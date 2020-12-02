package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.DriverService;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.MonorailDriverlDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.impl.mock.MonorailDriverDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.MonorailTrainDriver;

import java.util.List;

public class MonorailDriverService {
    private static final MonorailDriverlDao MONORAIL_DRIVER_DAO = MonorailDriverDaoImpl.getInstance();

    public static MonorailTrainDriver createEngine(MonorailTrainDriver monorailTrainDriver) throws
            BusDriverInvalidAgeException, TransportInvalidParamException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        return MONORAIL_DRIVER_DAO.create(monorailTrainDriver);
    }

    public static MonorailTrainDriver getBusById(Long id){
        return MONORAIL_DRIVER_DAO.getById(id);
    }

    public static List<MonorailTrainDriver> get(){
        return MONORAIL_DRIVER_DAO.get();
    }

    public static MonorailTrainDriver update(MonorailTrainDriver monorailTrainDriver) throws
            BusDriverInvalidAgeException, TransportInvalidParamException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        return MONORAIL_DRIVER_DAO.update(monorailTrainDriver);
    }

    public static Long deleteById(Long id){
        return MONORAIL_DRIVER_DAO.deleteById(id);
    }
}
