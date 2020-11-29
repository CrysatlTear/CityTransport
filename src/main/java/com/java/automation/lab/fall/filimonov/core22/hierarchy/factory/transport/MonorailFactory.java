package com.java.automation.lab.fall.filimonov.core22.hierarchy.factory.transport;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.enums.TransportSize;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.coordinate.Point;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.Engine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.MonoRail;

import java.util.List;

public class MonorailFactory {
    public static MonoRail createBigMonorail(int id, int price, int maxSpeed, String modelName, Engine engine, int wagons,
                                             Point coordinates, List<Object> passengers) throws TrainDriverInvalidAgeException, TransportInvalidParamException {
        return new MonoRail(id,price,maxSpeed, TransportSize.Big,modelName,engine,wagons,coordinates,passengers);
    }

    public static MonoRail createMediumMonorail(int id, int price, int maxSpeed, String modelName, Engine engine, int wagons,
                                                Point coordinates, List<Object> passengers) throws TrainDriverInvalidAgeException, TransportInvalidParamException {
        return new MonoRail(id,price,maxSpeed,TransportSize.Medium,modelName,engine,wagons,coordinates,passengers);
    }

    public static MonoRail createMicroMonorail(int id, int price, int maxSpeed, String modelName, Engine engine, int wagons,
                                               Point coordinates, List<Object> passengers) throws TrainDriverInvalidAgeException, TransportInvalidParamException {
        return new MonoRail(id,price,maxSpeed,TransportSize.Micro,modelName,engine, wagons, coordinates,passengers);
    }
}
