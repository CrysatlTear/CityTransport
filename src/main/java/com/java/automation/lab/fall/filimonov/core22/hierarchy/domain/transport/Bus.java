package com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.enums.TransportSize;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.InvalidRouteException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.factory.driverFact.BusDriverFactory;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.BusDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.Passenger;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.Engine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.coordinate.Point;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.stops.GroundStops;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.*;

@XmlRootElement(name = "Bus")
@XmlType(propOrder = { "id", "price", "maxSpeed", "size", "modelName", "engine", "coordinates" })

public class Bus extends CityTransport implements Comparable<Bus>, Serializable {

    public Bus() throws BusDriverInvalidAgeException {}

    public Bus(int id, int price, int maxSpeed, TransportSize size, String modelName, Engine engine,
               Point coordinates, List<Object> passengers) throws BusDriverInvalidAgeException, TransportInvalidParamException {
        super(id, price, maxSpeed, size, modelName, engine, coordinates, passengers);
        if(passengers == null){
            throw new TransportInvalidParamException("Bus without seats can't be created",this.getModelName());
        }
    }

        BusDriver driver = BusDriverFactory.createDefaultBusDriver("Valera", 50);

    public void driverInfo(BusDriver x){
            x.showInfo();
            x.showDriverLicence();
    }

    public void driverCheckLicence(BusDriver x){
        if(x.getLicence() != null){
            System.out.println("Driver have licence !");
        }
        else{
            System.err.println("Driver dont have licence !!!");
        }
    }

    @Override
    public void driverIn() {
        System.out.println("Driver " + driver.getName() + " in bus !!!");
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
        System.out.println("Bus info : Bus model - " + this.getModelName() + "; size - " + this.getSize() +
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
            }
        }
    }

    public void transportOnRoute(Point coordinatesB, ArrayList<GroundStops> arr) throws InvalidRouteException {
        double x = coordinatesB.getX();
        double y = coordinatesB.getY();
        double x1 = arr.get(0).getCoordinates2D().getX();
        double y1 = arr.get(0).getCoordinates2D().getY();
        double x2 = arr.get(1).getCoordinates2D().getX();
        double y2 = arr.get(1).getCoordinates2D().getY();
        if((x-x1)/(x2-x1)==(y-y1)/(y2-y1) && x >= x1 && y >= y1) {
            printGroundRoute(arr);
        }
        else{
            throw new InvalidRouteException("Bus in not on route", this.getModelName());
        }
    }


    @Override
    public int hashCode() {
        return (getModelName() + getMaxSpeed() + getPrice()).hashCode();
    }

    @Override
    public String toString() {
        return "Bus {\n\tName: " + getModelName() + "\n\tType: " + getSize() + "\n\tSpeed: " +getMaxSpeed() +
                "\n\tEngine: " + getEngine() +"\n    }";
    }

    @Override
    public boolean equals(Object other){
        if (this == other) {return  true;}
        if (other == null || other.getClass() != getClass()) {return false;}
        Bus that = (Bus) other;
        return this.getModelName() == that.getModelName() &&
                this.getPrice() == that.getPrice() && this.getSize() == that.getSize() &&
                this.getEngine() == that.getEngine() && this.getCoordinates() == that.getCoordinates() &&
                this.getPassengers() == that.getPassengers();
    }

    public void createRouteMap(ArrayList<GroundStops> arr){
        Map<Integer, String> routeMap = new HashMap<Integer, String>();
        for (int i = 0; i < arr.size(); i++){
            routeMap.put(arr.get(i).hashCode(), arr.get(i).getName());
        }
        for (Map.Entry<Integer,String> stop:routeMap.entrySet()){
            System.out.println("Key: "+stop.getKey()+ "; Stop name: "+stop.getValue());
        }
    }

    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    @Override
    public int compareTo(Bus o) {
        return this.getMaxSpeed() - o.getMaxSpeed();
    }
}