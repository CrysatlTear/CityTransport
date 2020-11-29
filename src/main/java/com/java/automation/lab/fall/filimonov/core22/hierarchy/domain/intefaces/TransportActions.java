package com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.intefaces;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.coordinate.Point;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.stops.GroundStops;

import java.util.ArrayList;
import java.util.List;

public interface TransportActions{
    void driverIn();

    void startEngine();

    void stopEngine();

    void moveTransport();

    void printInfo();

    void loadPassengers(List<Object> passengers, Point coordinatesB, ArrayList<GroundStops> arr);

    void unloadPassengers(List<Object> passengers, Point coordinatesB, ArrayList<GroundStops> arr);
}
