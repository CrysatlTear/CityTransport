package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.driverservice;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.UndergroundDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.impl.mock.UndergroundDriverDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.UndergroundDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class UndergroundDriverService {
    private static final UndergroundDriverDao UNDERGROUND_DRIVER_DAO = UndergroundDriverDaoImpl.getInstance();
    private static final Logger LOGGER = LoggerFactory.getLogger(BusDriverService.class);

    public static UndergroundDriver createEngine(UndergroundDriver undergroundDriver) throws
            BusDriverInvalidAgeException, TransportInvalidParamException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        LOGGER.info("Going to create train driver");
        return UNDERGROUND_DRIVER_DAO.create(undergroundDriver);
    }

    public static UndergroundDriver getBusById(Long id){
        LOGGER.info("Going to create train driver");
        return UNDERGROUND_DRIVER_DAO.getById(id);
    }

    public static List<UndergroundDriver> get(){
        LOGGER.info("Going to create train driver");
        return UNDERGROUND_DRIVER_DAO.get();
    }

    public static UndergroundDriver update(UndergroundDriver undergroundDriver) throws
            BusDriverInvalidAgeException, TransportInvalidParamException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        LOGGER.info("Going to create train driver");
        return UNDERGROUND_DRIVER_DAO.update(undergroundDriver);
    }

    public static Long deleteById(Long id){
        LOGGER.info("Going to create train driver driver");
        return UNDERGROUND_DRIVER_DAO.deleteById(id);
    }
}
