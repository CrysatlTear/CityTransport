package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.driverservice;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.BusDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.impl.mock.BusDriverDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.BusDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.service.transportservice.BusService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class BusDriverService {
    private static final BusDriverDao BUS_DRIVER_DAO = BusDriverDaoImpl.getInstance();
    private static final Logger LOGGER = LoggerFactory.getLogger(BusDriverService.class);

    public static BusDriver createEngine(BusDriver busDriver) throws TransportInvalidParamException, BusDriverInvalidAgeException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        LOGGER.info("Going to create bus driver");
        return BUS_DRIVER_DAO.create(busDriver);
    }

    public static BusDriver getBusById(Long id){
        LOGGER.info("Going to get bus driver by id " + id);
        return BUS_DRIVER_DAO.getById(id);
    }

    public static List<BusDriver> get(){
        LOGGER.info("Going to get all bus drivers from table");
        return BUS_DRIVER_DAO.get();
    }

    public static BusDriver update(BusDriver busDriver) throws BusDriverInvalidAgeException, TransportInvalidParamException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        LOGGER.info("Going to update bus drivers from table");
        return BUS_DRIVER_DAO.update(busDriver);

    }

    public static Long deleteById(Long id){
        return BUS_DRIVER_DAO.deleteById(id);
    }
}
