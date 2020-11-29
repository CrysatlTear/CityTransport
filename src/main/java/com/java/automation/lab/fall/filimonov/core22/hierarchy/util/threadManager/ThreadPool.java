package com.java.automation.lab.fall.filimonov.core22.hierarchy.util.threadManager;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.stops.GroundStops;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.CityTransport;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ThreadPool {
    public static void threadPoolLoader(CityTransport transport, ArrayList<GroundStops> arr) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new Runnable() {
            @Override
            public synchronized void run() {
                try {
                    transport.loadPassengers(transport.getPassengers(),transport.getCoordinates(),arr);
                } finally {
                    executorService.shutdown();
                }
            }
        });
    }

    public static void threadPoolUnloader(CityTransport transport, ArrayList<GroundStops> arr) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new Runnable() {
            @Override
            public synchronized void run() {
                try {
                    transport.unloadPassengers(transport.getPassengers(),transport.getCoordinates(),arr);
                } finally {
                    executorService.shutdown();
                }
            }
        });
    }

}