package com.java.automation.lab.fall.filimonov.core22.hierarchy.factory.transport;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.enums.TransportSize;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.enums.TransportTypess;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.factory.Factory;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.coordinate.Point;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.Engine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.*;
import java.util.LinkedList;
import java.util.Map;

public class GenericTransportFactory {
    private static final Map<TransportTypess, Factory<? extends CityTransport>> types = Map.of(
            TransportTypess.BUS, new Factory(Bus.class),
            TransportTypess.TROLLEYBUS, new Factory(TrolleyBus.class),
            TransportTypess.TRAM, new Factory(Tram.class),
            TransportTypess.MONORAIL, new Factory(MonoRail.class),
            TransportTypess.UNDERGROUND, new Factory(Underground.class)
    );

    private GenericTransportFactory(){};

    public static CityTransport createCityTransport(TransportTypess type, int id, int price, int maxSpeed,
                                                    TransportSize size, String modelName, Engine engine,
                                                    Point coordinates, LinkedList<Object> passengers ){
        var transport = types.get(type).getInstance();
        transport.setPrice(price);
        transport.setMaxSpeed(maxSpeed);
        transport.setSize(size);
        transport.setModelName(modelName);
        transport.setEngine(engine);
        transport.setCoordinates(coordinates);
        transport.setPassengers(passengers);
        return transport;
    }

}
