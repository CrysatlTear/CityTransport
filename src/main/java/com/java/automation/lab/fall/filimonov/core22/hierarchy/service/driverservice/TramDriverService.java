package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.driverservice;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.TramDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.impl.mock.TramDriverDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.TramDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class TramDriverService {
    private static final TramDriverDao TRAM_DRIVER_DAO = TramDriverDaoImpl.getInstance();
    private static final Logger LOGGER = LoggerFactory.getLogger(BusDriverService.class);

    public static TramDriver createEngine(TramDriver tramDriver) throws BusDriverInvalidAgeException, TrainDriverInvalidAgeException, TransportInvalidParamException, EngineInvalidRpmException {
        LOGGER.info("Going to create tram driver");
        return TRAM_DRIVER_DAO.create(tramDriver);
    }

    public static TramDriver getBusById(Long id){
        return TRAM_DRIVER_DAO.getById(id);
    }

    public static List<TramDriver> get(){
        LOGGER.info("Going to create tram driver");
        return TRAM_DRIVER_DAO.get();
    }

    public static TramDriver update(TramDriver tramDriver) throws BusDriverInvalidAgeException, TrainDriverInvalidAgeException, TransportInvalidParamException, EngineInvalidRpmException {
        LOGGER.info("Going to create tram driver");
        return TRAM_DRIVER_DAO.update(tramDriver);
    }

    public static Long deleteById(Long id){
        LOGGER.info("Going to create tram driver");
        return TRAM_DRIVER_DAO.deleteById(id);
    }
}
