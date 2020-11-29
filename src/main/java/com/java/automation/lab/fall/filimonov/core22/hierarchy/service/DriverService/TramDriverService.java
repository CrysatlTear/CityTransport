package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.DriverService;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.DriverDao.TramDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.DriverDao.impl.mock.TramDriverDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.TramDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;

import java.util.List;

public class TramDriverService {
    private static final TramDriverDao TRAM_DRIVER_DAO = TramDriverDaoImpl.getInstance();

    public static TramDriver createEngine(TramDriver tramDriver) throws BusDriverInvalidAgeException, TrainDriverInvalidAgeException, TransportInvalidParamException, EngineInvalidRpmException {
        return TRAM_DRIVER_DAO.create(tramDriver);
    }

    public static TramDriver getBusById(Long id){
        return TRAM_DRIVER_DAO.getById(id);
    }

    public static List<TramDriver> get(){
        return TRAM_DRIVER_DAO.get();
    }

    public static TramDriver update(TramDriver tramDriver) throws BusDriverInvalidAgeException, TrainDriverInvalidAgeException, TransportInvalidParamException, EngineInvalidRpmException {
        return TRAM_DRIVER_DAO.update(tramDriver);
    }

    public static Long deleteById(Long id){
        return TRAM_DRIVER_DAO.deleteById(id);
    }
}
