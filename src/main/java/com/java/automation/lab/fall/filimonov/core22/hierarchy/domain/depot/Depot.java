package com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.depot;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.base.AbstractModel;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.*;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Depot extends AbstractModel {

    public static BlockingDeque<Bus> createBusDepot(int capacity){
        return new LinkedBlockingDeque<>(capacity);
    }

    public static BlockingDeque<TrolleyBus> createTrolleybusDepot(int capacity){
        return new LinkedBlockingDeque<>(capacity);
    }

    public static BlockingDeque<Tram> createTramDepot(int capacity){
        return new LinkedBlockingDeque<>(capacity);
    }

    public static BlockingDeque<Underground> createUndergroundDepot(int capacity){
        return new LinkedBlockingDeque<>(capacity);
    }

    public static BlockingDeque<MonoRail> createMonorailDepot(int capacity){
        return new LinkedBlockingDeque<>(capacity);
    }

}
