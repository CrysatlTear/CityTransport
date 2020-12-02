package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.DriverService;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.BusDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.impl.mock.BusDriverDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.BusDriver;

import java.util.List;

public class BusDriverService {
    private static final BusDriverDao BUS_DRIVER_DAO = BusDriverDaoImpl.getInstance();

    public static BusDriver createEngine(BusDriver busDriver) throws TransportInvalidParamException, BusDriverInvalidAgeException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        return BUS_DRIVER_DAO.create(busDriver);
    }

    public static BusDriver getBusById(Long id){
        return BUS_DRIVER_DAO.getById(id);
    }

    public static List<BusDriver> get(){
        return BUS_DRIVER_DAO.get();
    }

    public static BusDriver update(BusDriver busDriver) throws BusDriverInvalidAgeException, TransportInvalidParamException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        return BUS_DRIVER_DAO.update(busDriver);
    }

    public static Long deleteById(Long id){
        return BUS_DRIVER_DAO.deleteById(id);
    }
}
