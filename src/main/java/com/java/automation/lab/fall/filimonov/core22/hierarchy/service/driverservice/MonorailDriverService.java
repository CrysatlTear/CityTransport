package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.driverservice;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.MonorailDriverlDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.impl.mock.MonorailDriverDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.MonorailTrainDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MonorailDriverService {
    private static final MonorailDriverlDao MONORAIL_DRIVER_DAO = MonorailDriverDaoImpl.getInstance();
    private static final Logger LOGGER = LoggerFactory.getLogger(BusDriverService.class);

    public static MonorailTrainDriver create(MonorailTrainDriver monorailTrainDriver) throws
            BusDriverInvalidAgeException, TransportInvalidParamException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        LOGGER.info("Going to create monorail driver");
        return MONORAIL_DRIVER_DAO.create(monorailTrainDriver);
    }

    public static MonorailTrainDriver getById(Long id){
        LOGGER.info("Going to get by ID monorail driver");
        return MONORAIL_DRIVER_DAO.getById(id);

    }

    public static List<MonorailTrainDriver> get(){
        LOGGER.info("Going to get all monorail drivers");
        return MONORAIL_DRIVER_DAO.get();
    }

    public static MonorailTrainDriver update(MonorailTrainDriver monorailTrainDriver) throws
            BusDriverInvalidAgeException, TransportInvalidParamException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        LOGGER.info("Going to update monorail driver");
        return MONORAIL_DRIVER_DAO.update(monorailTrainDriver);
    }

    public static Long deleteById(Long id){
        LOGGER.info("Going to delete monorail driver");
        return MONORAIL_DRIVER_DAO.deleteById(id);
    }
}
