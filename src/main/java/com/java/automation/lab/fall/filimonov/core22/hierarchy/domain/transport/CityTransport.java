package com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.ElectricEngine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.IcEngine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.enums.TransportSize;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.base.AbstractModel;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.Engine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.intefaces.TransportActions;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.coordinate.Point;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.stops.GroundStops;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.stops.UndergroundStops;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public abstract class CityTransport extends AbstractModel implements TransportActions, Serializable {
    private IcEngine icEngine;
    private ElectricEngine electricEngine;
    private int price;
    private int maxSpeed;
    private TransportSize size;
    public Engine engine;
    public Point coordinates;
    private String modelName;
    private List<Object> passengers;

    public CityTransport(){}

    public CityTransport(int id, int price, int maxSpeed, TransportSize size, String modelName, Engine engine,
                         Point coordinates, List<Object> passengers) {
        this.setId(id);
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.size = size;
        this.engine = engine;
        this.coordinates = coordinates;
        this.modelName = modelName;
        this.passengers = Collections.synchronizedList(passengers);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public TransportSize getSize() {
        return size;
    }

    public void setSize(TransportSize size) {
        this.size = size;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Engine getEngine() {
        return engine;
    }

    public void  setEngine(Engine engine) {
        this.engine = engine;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    public List<Object> getPassengers() {
        return passengers;
    }

    public void setPassengers(LinkedList<Object> passengers) {
        this.passengers = passengers;
    }

    public void printGroundRoute(ArrayList<GroundStops> arr){
        for (int i = 0; i < arr.size() - 1; i++)
            System.out.println(getModelName() + " - is on route between " + arr.get(i).getName() +
                    " and " + arr.get(i + 1).getName());
    }

    public void printUndergroundRoute(ArrayList<UndergroundStops> arr) {
        for (int i = 0; i < arr.size() - 1; i++)
            System.out.println(getModelName() + " - is on route between " + arr.get(i).getName() +
                    " and " + arr.get(i + 1).getName());
    }

    public void setPassengers(List<Object> passengers) {
        this.passengers = passengers;
    }

}

