package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.driverservice;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.TrolleybusDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.impl.mock.TrolleybusDriverDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.TrolleyBusDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class TrolleyBusDriverService {
    private static final TrolleybusDriverDao TRAM_DRIVER_DAO = TrolleybusDriverDaoImpl.getInstance();
    private static final Logger LOGGER = LoggerFactory.getLogger(BusDriverService.class);

    public static TrolleyBusDriver createEngine(TrolleyBusDriver trolleyBusDriver) throws BusDriverInvalidAgeException, TrainDriverInvalidAgeException, TransportInvalidParamException, EngineInvalidRpmException {
        LOGGER.info("Going to create trolleybus driver");
        return TRAM_DRIVER_DAO.create(trolleyBusDriver);
    }

    public static TrolleyBusDriver getBusById(Long id){
        LOGGER.info("Going to create trolleybus driver");
        return TRAM_DRIVER_DAO.getById(id);
    }

    public static List<TrolleyBusDriver> get(){
        LOGGER.info("Going to create trolleybus driver");
        return TRAM_DRIVER_DAO.get();
    }

    public static TrolleyBusDriver update(TrolleyBusDriver trolleyBusDriver) throws BusDriverInvalidAgeException, TrainDriverInvalidAgeException, TransportInvalidParamException, EngineInvalidRpmException {
        LOGGER.info("Going to create trolleybus driver");
        return TRAM_DRIVER_DAO.update(trolleyBusDriver);
    }

    public static Long deleteById(Long id){
        LOGGER.info("Going to create trolleybus driver");
        return TRAM_DRIVER_DAO.deleteById(id);
    }
}
