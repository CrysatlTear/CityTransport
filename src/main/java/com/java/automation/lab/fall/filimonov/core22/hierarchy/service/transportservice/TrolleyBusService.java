package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.transportservice;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.TrolleybusDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.mock.TrolleybusDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.TrolleyBus;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.service.driverservice.BusDriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class TrolleyBusService {
    private static final TrolleybusDao TROLLEYBUS_DAO = TrolleybusDaoImpl.getInstance();
    private static final Logger LOGGER = LoggerFactory.getLogger(BusDriverService.class);

    public static TrolleyBus create(TrolleyBus bus) throws TransportInvalidParamException, BusDriverInvalidAgeException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        LOGGER.info("Going to create trolleybus");
        return TROLLEYBUS_DAO.create(bus);
    }

    public static TrolleyBus getById(Long id){
        LOGGER.info("Going to get trolleybus by id");
        return TROLLEYBUS_DAO.getById(id);
    }

    public static List<TrolleyBus> get(){
        LOGGER.info("Going get all trolleybuses");
        return TROLLEYBUS_DAO.get();
    }

    public static TrolleyBus update(TrolleyBus bus) throws TransportInvalidParamException, BusDriverInvalidAgeException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        LOGGER.info("Going to update trolleybus");
        return TROLLEYBUS_DAO.update(bus);
    }

    public static Long deleteById(Long id){
        LOGGER.info("Going to delete trolleybus by ID");
        return TROLLEYBUS_DAO.deleteById(id);
    }
}
