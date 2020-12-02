package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.driverservice;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.TrolleybusDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.impl.mock.TrolleybusDriverDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.TrolleyBusDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;

import java.util.List;


public class TrolleyBusDriverService {
    private static final TrolleybusDriverDao TRAM_DRIVER_DAO = TrolleybusDriverDaoImpl.getInstance();

    public static TrolleyBusDriver createEngine(TrolleyBusDriver trolleyBusDriver) throws BusDriverInvalidAgeException, TrainDriverInvalidAgeException, TransportInvalidParamException, EngineInvalidRpmException {
        return TRAM_DRIVER_DAO.create(trolleyBusDriver);
    }

    public static TrolleyBusDriver getBusById(Long id){
        return TRAM_DRIVER_DAO.getById(id);
    }

    public static List<TrolleyBusDriver> get(){
        return TRAM_DRIVER_DAO.get();
    }

    public static TrolleyBusDriver update(TrolleyBusDriver trolleyBusDriver) throws BusDriverInvalidAgeException, TrainDriverInvalidAgeException, TransportInvalidParamException, EngineInvalidRpmException {
        return TRAM_DRIVER_DAO.update(trolleyBusDriver);
    }

    public static Long deleteById(Long id){
        return TRAM_DRIVER_DAO.deleteById(id);
    }
}
