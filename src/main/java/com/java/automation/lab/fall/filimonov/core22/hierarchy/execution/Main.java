package com.java.automation.lab.fall.filimonov.core22.hierarchy.execution;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.impl.sql.EngineDaoImplSQL;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.impl.sql.IcEngineDaoImplSQL;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.sql.BusDaoImplSQL;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.sql.CityTransportDaoImplSQL;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.config.SessionFactory;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.depot.*;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.coordinate.Point;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.ElectricEngine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.Engine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.IcEngine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.stops.GroundStops;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.stops.UndergroundStops;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.*;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.enums.Fuel;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.enums.TransportSize;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.enums.TransportTypess;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.*;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.factory.transport.*;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.FileManager;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.JsonIO;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.ObjectIO;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.threadManager.ThreadPool;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.BlockingDeque;


public class Main {
    public static void main(String[] args) throws InterruptedException, EngineInvalidRpmException, IOException, InvalidRouteException, TransportInvalidParamException, BusDriverInvalidAgeException {

        String[] busModelNames = new String[FileManager.getFileStringsCount(IOConstant.WHEEL_TRANSPORT_NAMES)];
        busModelNames = FileManager.readFile(busModelNames,IOConstant.WHEEL_TRANSPORT_NAMES);

        String[] trainModelNames = new String[FileManager.getFileStringsCount(IOConstant.TRAIN_TRANSPORT_NAMES)];
        trainModelNames = FileManager.readFile(trainModelNames,IOConstant.TRAIN_TRANSPORT_NAMES);

        List<String> icEnginesNames = FileManager.read("src/resources/IcEngineNames.dict");

        List<String> elEnginesNames = FileManager.read("src/resources/ElEngineNames.dict");

        Bus busA = null;

        try {
            busA = BusFactory.createBigBus(1234, 10000, 80, FileManager.getSpecificName(busModelNames, 3)
                    , new IcEngine(2,6000, 1500, Fuel.Petrol, FileManager.getSpecificNameStream(icEnginesNames, 3),
                            6), new Point(2, 2), new LinkedList<>());
        }
        catch (BusDriverInvalidAgeException | EngineInvalidRpmException | TransportInvalidParamException ex){
            ex.getStackTrace();
            System.err.println(ex.getMessage());
        }

        busA.printInfo();
        ArrayList<GroundStops> busRoute = new ArrayList<GroundStops>(10);
        busRoute.add(new GroundStops("ДС Кунцевщина", new Point(2, 2)));
        busRoute.add(new GroundStops("Пушкинская", new Point(4, 4)));
        busRoute.add(new GroundStops("ДС Каменная Горка", new Point(6, 6)));
        busA.driverIn();
        busA.startEngine();
        busA.moveTransport();

        try {
            busA.transportOnRoute(busA.coordinates, busRoute);
        }
        catch (InvalidRouteException ex){
            System.err.println(ex.getMessage());
        }

        busA.stopEngine();
        busA.getDriver().showDriverLicence();
        System.out.println("-----------------------------------------------------------------------------------------");

        Underground train = null;

        try {
            train = UndergroundFactory.createBigTrain(20123,50000, 100, FileManager.getRandomName(trainModelNames),
                    new ElectricEngine(10,4000, 1000, Fuel.Electric, FileManager.getSpecificNameStream(elEnginesNames, 2),
                            400, 50), 20, new Point(4, 4), new LinkedList<>());
        }
        catch (TrainDriverInvalidAgeException | EngineInvalidRpmException | TransportInvalidParamException ex){
            System.err.println(ex.getMessage());
            ex.getStackTrace();
        }

        train.printInfo();
        ArrayList<UndergroundStops> underRoute = new ArrayList<>();
        underRoute.add(new UndergroundStops("Каменная Горка", new Point(3, 3)));
        underRoute.add(new UndergroundStops("Кунцевщина", new Point(6,6)));
        underRoute.add(new UndergroundStops("Спортивная", new Point(10, 10)));
        underRoute.add(new UndergroundStops("Пушкинская", new Point(14, 14)));
        underRoute.add(new UndergroundStops("Фрунзенская", new Point(22, 22)));
        train.driverIn();
        train.startEngine();
        train.moveTransport();

        try {
            train.undergroundTransportOnRoute(train.coordinates, underRoute);
        }
        catch (InvalidRouteException ex){
            System.err.println(ex.getMessage());
        }

        train.stopEngine();
        System.out.println("-----------------------------------------------------------------------------------------");

        Tram tram = null;

        try {
            tram = TramFactory.createMediumTram(2314,30000, 80, FileManager.getRandomName(busModelNames),
                    new ElectricEngine(11, 12000, 3000, Fuel.Electric,
                            FileManager.getSpecificNameStream(elEnginesNames, 2), 300, 30),
                    new Point(6, 6), new LinkedList<>());
        }
        catch (BusDriverInvalidAgeException | EngineInvalidRpmException | TransportInvalidParamException ex){
            System.err.println(ex.getMessage());
            ex.getStackTrace();
        }

        ArrayList<GroundStops> tramRoute = new ArrayList(10);
        tramRoute.add(0, new GroundStops("ДС Одоевского", new Point(6, 6)));
        tramRoute.add(new GroundStops("Поликлиника", new Point(8, 8)));
        tramRoute.add(new GroundStops("Новая горка", new Point(10, 10)));
        tramRoute.add(new GroundStops("Фрунзе", new Point(15, 15)));
        tramRoute.add(new GroundStops("ДС 27 перекрёсток", new Point(17, 17)));
        tram.printInfo();
        tram.driverIn();
        tram.startEngine();
        tram.moveTransport();

        try {
            tram.transportOnRoute(tram.coordinates, tramRoute);
        }
        catch (InvalidRouteException ex){
            System.err.println(ex.getMessage());
        }

        tram.stopEngine();
        System.out.println("-----------------------------------------------------------------------------------------");

        TrolleyBus trolleyBus = null;

        try {
            trolleyBus = TrolleyBusFactory.createBigTrolleyBus(40123,45000, 100,
                    FileManager.getRandomName(busModelNames), new ElectricEngine(12,8000, 2000,
                            Fuel.Electric, FileManager.getSpecificNameStream(elEnginesNames, 3),
                            200, 35), new Point(6, 6), new LinkedList<>());
        }
        catch (BusDriverInvalidAgeException | EngineInvalidRpmException | TransportInvalidParamException ex){
            System.err.println(ex.getMessage());
            ex.getStackTrace();
        }

        ArrayList<GroundStops> trolleyBusRoute = new ArrayList<>();
        trolleyBusRoute.add(new GroundStops("ДС Домовая", new Point(6, 6)));
        trolleyBusRoute.add(new GroundStops("Колледж Технологии и Дизайна", new Point(8, 8)));
        trolleyBusRoute.add(new GroundStops("Универсам Рига", new Point(10, 10)));
        trolleyBusRoute.add(new GroundStops("БНТУ", new Point(15, 15)));
        trolleyBusRoute.add(new GroundStops("ДС Корженевского", new Point(17, 17)));
        trolleyBus.printInfo();
        trolleyBus.driverIn();
        trolleyBus.startEngine();
        trolleyBus.moveTransport();

        try {
            trolleyBus.transportOnRoute(trolleyBus.coordinates, trolleyBusRoute);
        }
        catch (InvalidRouteException ex){
            System.err.println(ex.getMessage());
        }

        trolleyBus.stopEngine();
        System.out.println("-----------------------------------------------------------------------------------------");

        MonoRail monoRailTrain = null;

        try {
            monoRailTrain = MonorailFactory.createBigMonorail(12,100000, 100, FileManager.getSpecificName(trainModelNames, 1),
                    new ElectricEngine(14,12000, 3500, Fuel.Electric, FileManager.getSpecificNameStream(elEnginesNames, 1),
                            1000, 100), 10, new Point(-2, -2), new LinkedList<>());
        }
        catch (TrainDriverInvalidAgeException | EngineInvalidRpmException | TransportInvalidParamException ex){
            System.err.println(ex.getMessage());
            ex.getStackTrace();
        }

        ArrayList<GroundStops> monoRailTrainStops = new ArrayList();
        monoRailTrainStops.add(new GroundStops("ДС Сидорова", new Point(-4, -4)));
        monoRailTrainStops.add(new GroundStops("Колледж БГУИР", new Point(-8, -8)));
        monoRailTrainStops.add(new GroundStops("Соседи 24/7", new Point(-10, -10)));
        monoRailTrainStops.add(3, new GroundStops("МГЛУ", new Point(-15, -15)));
        monoRailTrainStops.add(new GroundStops("ДС Озеро 8", new Point(-17, -17)));
        monoRailTrain.printInfo();
        monoRailTrain.driverIn();
        monoRailTrain.startEngine();
        monoRailTrain.moveTransport();

        try {
            monoRailTrain.transportOnRoute(trolleyBus.coordinates, monoRailTrainStops);
        }
        catch (InvalidRouteException ex){
            System.err.println(ex.getMessage());
        }

        monoRailTrain.stopEngine();
        monoRailTrain.driverInfo(monoRailTrain.getDriver());
        System.out.println(monoRailTrainStops.get(0).hashCode());
        System.out.println(monoRailTrainStops.get(1).toString());
        System.out.println(busRoute.get(0).toString());
        System.out.println(Arrays.toString(new ArrayList[]{busRoute}));
        System.out.println(busA.equals(busA));
        System.out.println(busA.toString());

        Bus finalBusA = busA;
        Thread threadOne = new Thread(() -> finalBusA.loadPassengers(finalBusA.getPassengers(), finalBusA.coordinates,busRoute));

        Bus finalBusA1 = busA;
        Thread threadTwo = new Thread(() -> finalBusA1.unloadPassengers(finalBusA1.getPassengers(), finalBusA1.coordinates,busRoute));

        threadOne.start();
        threadTwo.start();
        threadOne.join();
        threadTwo.join();

        busA.createRouteMap(busRoute);
        System.out.println(busA.getPassengers());
        busA.driverCheckLicence(busA.getDriver());



        Bus bus1 = null;

        try {
            bus1 = BusFactory.createBigBus(1,10000, 80, FileManager.getSpecificName(busModelNames,3)
                    , new IcEngine(3,6000, 1500, Fuel.Petrol, FileManager.getSpecificNameStream(icEnginesNames, 3),
                            6), new Point(2, 2), new LinkedList<>());
        }
        catch (BusDriverInvalidAgeException | EngineInvalidRpmException | TransportInvalidParamException ex){
            ex.getStackTrace();
            System.err.println(ex.getMessage());
        }

        Bus bus2 = null;

        try {
            bus2 = BusFactory.createBigBus(10,10000, 80, FileManager.getSpecificName(busModelNames,3)
                    , new IcEngine(4,6000, 1500, Fuel.Petrol, FileManager.getSpecificNameStream(icEnginesNames, 3),
                            6), new Point(2, 2), new LinkedList<>());
        }
        catch (BusDriverInvalidAgeException | EngineInvalidRpmException | TransportInvalidParamException ex){
            ex.getStackTrace();
            System.err.println(ex.getMessage());
        }

        BlockingDeque<Bus> busDepot =  Depot.createBusDepot(20);
        busDepot.add(bus1);
        busDepot.add(bus2);
        System.out.println(busDepot);

        BlockingDeque<Tram> tramDepot = Depot.createTramDepot(5);
        tramDepot.add(tram);
        System.out.println(tramDepot);
        tramDepot.remove(tram);
        System.out.println(tramDepot);

        BlockingDeque<Underground> undergroundDepot = Depot.createUndergroundDepot(20);
        undergroundDepot.add(train);
        System.out.println(undergroundDepot);

        var bus_107 = GenericTransportFactory.createCityTransport(TransportTypess.BUS,1,30000,100,
                TransportSize.Medium,FileManager.getSpecificName(busModelNames,2),new IcEngine(4,5000,
                        2500,Fuel.Petrol,FileManager.getSpecificNameStream(elEnginesNames,3),40),
                new Point(2,2),new LinkedList<>());
        bus_107.printInfo();

        ThreadPool.threadPoolLoader(bus1,busRoute);
        ThreadPool.threadPoolUnloader(bus1,busRoute);
        System.out.println(bus1.getPassengers());

        new ObjectIO<Bus>().write(bus1, IOConstant.RQ_PATH);

        new JsonIO<Bus>(Bus.class).write(bus2,IOConstant.JSON_OBJ_PATH);

        try{
            SessionFactory.getSession();
            System.out.println("Success");
        }
        catch (Exception exception){
            System.out.println("Failed");
        }

        Bus buss = new Bus(1,50000,100,TransportSize.Big,"MercedecBenz",new IcEngine(1,4000,2000,Fuel.Petrol,
                "HW1000",50),new Point(2,2),new LinkedList<>());


        EngineDaoImplSQL engineDaoImplSQL = new EngineDaoImplSQL();
        engineDaoImplSQL.create(buss.getEngine());

        IcEngineDaoImplSQL icEngineDaoImplSQL = new IcEngineDaoImplSQL();
        icEngineDaoImplSQL.create((IcEngine) buss.getEngine());




        CityTransportDaoImplSQL cityTransportDaoImplSQL = new CityTransportDaoImplSQL();
        cityTransportDaoImplSQL.create(buss);


        BusDaoImplSQL busDaoImplSQL = new BusDaoImplSQL();
        busDaoImplSQL.create(buss);


       var a = busDaoImplSQL.getById(1L);
        System.out.println(busDaoImplSQL.getById(1L));




    }
}
