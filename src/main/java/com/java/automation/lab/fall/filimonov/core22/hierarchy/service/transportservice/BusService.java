package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.transportservice;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.BusDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.mock.BusDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Bus;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.service.driverservice.BusDriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class BusService {
    private static final BusDao BUS_DAO = BusDaoImpl.getInstance();
    private static final Logger LOGGER = LoggerFactory.getLogger(BusDriverService.class);

    public static Bus create(Bus bus) throws TransportInvalidParamException, BusDriverInvalidAgeException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        LOGGER.info("Going to create bus ");
        return BUS_DAO.create(bus);
    }

    public static Bus getById(Long id){
        LOGGER.info("Going to get bus by ID");
        return BUS_DAO.getById(id);
    }

    public static List<Bus> get(){
        LOGGER.info("Going to get all buses ");
        return BUS_DAO.get();
    }

    public static Bus update(Bus bus) throws TransportInvalidParamException, BusDriverInvalidAgeException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        LOGGER.info("Going to update bus");
        return BUS_DAO.update(bus);
    }

    public static Long deleteById(Long id){
        LOGGER.info("Going to delete bus by ID");
        return BUS_DAO.deleteById(id);
    }
}
