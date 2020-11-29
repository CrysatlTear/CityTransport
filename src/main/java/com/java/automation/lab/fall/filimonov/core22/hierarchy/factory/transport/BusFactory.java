package com.java.automation.lab.fall.filimonov.core22.hierarchy.factory.transport;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.enums.TransportSize;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.coordinate.Point;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.Engine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Bus;

import java.util.List;

public class BusFactory {
    public static Bus createBigBus(int id, int price, int maxSpeed, String modelName, Engine engine,
                                   Point coordinates, List<Object> passengers) throws BusDriverInvalidAgeException, TransportInvalidParamException {
        return new Bus(id,price,maxSpeed, TransportSize.Big,modelName,engine,coordinates,passengers);
    }

    public static Bus createMediumBus(int id, int price, int maxSpeed, String modelName, Engine engine,
                                      Point coordinates, List<Object> passengers) throws BusDriverInvalidAgeException, TransportInvalidParamException {
        return new Bus(id,price,maxSpeed,TransportSize.Medium,modelName,engine,coordinates,passengers);
    }

    public static Bus createMicroBus(int id, int price, int maxSpeed, String modelName, Engine engine,
                                     Point coordinates, List<Object> passengers) throws BusDriverInvalidAgeException, TransportInvalidParamException {
        return new Bus(id,price,maxSpeed,TransportSize.Micro,modelName,engine,coordinates,passengers);
    }
}
