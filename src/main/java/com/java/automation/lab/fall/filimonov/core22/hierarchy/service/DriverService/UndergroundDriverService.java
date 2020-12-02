package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.DriverService;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.UndergroundDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.impl.mock.UndergroundDriverDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.UndergroundDriver;

import java.util.List;

public class UndergroundDriverService {
    private static final UndergroundDriverDao UNDERGROUND_DRIVER_DAO = UndergroundDriverDaoImpl.getInstance();

    public static UndergroundDriver createEngine(UndergroundDriver undergroundDriver) throws
            BusDriverInvalidAgeException, TransportInvalidParamException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        return UNDERGROUND_DRIVER_DAO.create(undergroundDriver);
    }

    public static UndergroundDriver getBusById(Long id){
        return UNDERGROUND_DRIVER_DAO.getById(id);
    }

    public static List<UndergroundDriver> get(){
        return UNDERGROUND_DRIVER_DAO.get();
    }

    public static UndergroundDriver update(UndergroundDriver undergroundDriver) throws
            BusDriverInvalidAgeException, TransportInvalidParamException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        return UNDERGROUND_DRIVER_DAO.update(undergroundDriver);
    }

    public static Long deleteById(Long id){
        return UNDERGROUND_DRIVER_DAO.deleteById(id);
    }
}
