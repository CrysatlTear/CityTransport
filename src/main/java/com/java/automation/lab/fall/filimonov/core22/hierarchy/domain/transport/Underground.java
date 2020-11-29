package com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.enums.TransportSize;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.InvalidRouteException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.factory.driverFact.UndergroundDriverFactory;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.Passenger;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.Engine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.UndergroundDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.coordinate.Point;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.stops.GroundStops;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.stops.UndergroundStops;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@XmlRootElement(name = "Monorail")
@XmlType(propOrder = { "id", "price", "maxSpeed", "size", "modelName", "engine", "coordinates" })
public class Underground extends CityTransport implements Comparable<Underground>, Serializable {
    private int wagons;

    public int getWagons() {
        return wagons;
    }

    public void setWagons(int wagons) {
        this.wagons = wagons;
    }

    public Underground() throws BusDriverInvalidAgeException, TrainDriverInvalidAgeException {}

    public Underground(int id, int price, int maxSpeed, TransportSize size, String modelName, Engine engine, int wagons,
                       Point coordinates, List<Object> passengers) throws TrainDriverInvalidAgeException, TransportInvalidParamException {
        super(id, price, maxSpeed, size, modelName, engine, coordinates, passengers);
        this.wagons = wagons;
        if(wagons <= 0){
            throw new TransportInvalidParamException("Bus without seats can't be created",this.getModelName());
        }
    }

    UndergroundDriver driver = UndergroundDriverFactory.createMasterUndergroundDriver("Petr", 40);

    public void driverInfo(UndergroundDriver x){
        x.showInfo();
        x.showDriverLicence();
    }

    public void driverCheckLicence(UndergroundDriver x){
        if(x.getLicence() != null){
            System.out.println("Driver have licence !");
        }
        else{
            System.err.println("Driver dont have licence !!!");
        }
    }

    @Override
    public void driverIn() {
        System.out.println("Driver" + driver.getName() + "in train !!!");
    }

    @Override
    public void startEngine() {
        System.out.println("Engine " + engine.getModelName() + " started !!!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine " + engine.getModelName() + " stopped !!!");
    }

    @Override
    public void moveTransport() {
        System.out.println("Bus " + this.getModelName() + " start moving with max speed : " + this.getMaxSpeed());
    }

    @Override
    public void printInfo() {
        System.out.println("Train info : Train model - " + this.getModelName() + "; wagons - " + this.getWagons() +
                "; max speed - " + this.getMaxSpeed() + "; price - " + this.getPrice() + "$; engine : " +
                engine.getModelName());
    }

    @Override
    public void loadPassengers(List<Object> passengers, Point coordinatesB, ArrayList<GroundStops> arr) {
        double x = getCoordinates().getX();
        double y = getCoordinates().getY();
        Random random = new Random();
        int dif = 20 - 1;
        for (int i = 0; i < arr.size(); i++) {
            double x1 = arr.get(i).getCoordinates2D().getX();
            double y1 = arr.get(i).getCoordinates2D().getY();
            if (arr.get(i).getName().equals(arr.get(i).getName())) {
                for (int j = 0; j < random.nextInt(dif + 1); j++) {
                    passengers.add(0, new Passenger());
                }
                System.out.println(arr);
            }
        }
    }

    @Override
    public void unloadPassengers(List<Object> passengers, Point coordinatesB, ArrayList<GroundStops> arr) {
        double x = getCoordinates().getX();
        double y = getCoordinates().getY();
        Random random = new Random();
        int dif = 20 - 1;
        for (int i = 0; i < arr.size(); i++) {
            double x1 = arr.get(i).getCoordinates2D().getX();
            double y1 = arr.get(i).getCoordinates2D().getY();
            if (arr.get(i).getName().equals(arr.get(i).getName())) {
                for (int j = 0; j < random.nextInt(dif + 1); j++) {
                    passengers.remove(random);
                }
                System.out.println(getPassengers());
            }
        }
    }

    public void undergroundTransportOnRoute(Point coordinatesB, ArrayList<UndergroundStops> arr) throws InvalidRouteException {
        double x = getCoordinates().getX();
        double y = getCoordinates().getY();
        double x1 = arr.get(0).getCoordinates2D().getX();
        double y1 = arr.get(0).getCoordinates2D().getY();
        double x2 = arr.get(1).getCoordinates2D().getX();
        double y2 = arr.get(1).getCoordinates2D().getY();
        if((x-x1)/(x2-x1)==(y-y1)/(y2-y1) && x >= x1 && y >= y1) {
            printUndergroundRoute(arr);
        }
        else{
            throw new InvalidRouteException("Bus in not on route", this.getModelName());
        }
    }

    @Override
    public String toString() {
        return "Train {\n\tName: " + getModelName() + "\n\tType: " + getSize() + "\n\tSpeed: " +getMaxSpeed() +
                "\n\tEngine: " + getEngine().getModelName() +"\n    }";
    }

    @Override
    public int hashCode() {
        return (getModelName() + getMaxSpeed() + getPrice()).hashCode();
    }

    @Override
    public boolean equals(Object other){
        if (this == other) {return  true;}
        if (other == null || other.getClass() != getClass()) {return false;}
        Underground that = (Underground) other;
        return this.getModelName() == that.getModelName() &&
                this.getPrice() == that.getPrice() && this.getSize() == that.getSize() &&
                this.getEngine() == that.getEngine() && this.getCoordinates() == that.getCoordinates() &&
                this.getPassengers() == that.getPassengers() && this.getWagons() == that.getWagons();
    }

    public UndergroundDriver getDriver() {
        return driver;
    }

    public void setDriver(UndergroundDriver driver) {
        this.driver = driver;
    }

    @Override
    public int compareTo(Underground o) {
        return this.getMaxSpeed() - o.getMaxSpeed();
    }
}
