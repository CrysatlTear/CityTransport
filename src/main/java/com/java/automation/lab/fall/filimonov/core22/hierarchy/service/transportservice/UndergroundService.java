package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.transportservice;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.UndergroundDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.mock.UndergroundDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Underground;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.service.driverservice.BusDriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.List;

public class UndergroundService {
    private static final UndergroundDao UNDERGROUND_DAO = UndergroundDaoImpl.getInstance();
    private static final Logger LOGGER = LoggerFactory.getLogger(BusDriverService.class);

    public static Underground createTrain(Underground underground) throws TransportInvalidParamException, TrainDriverInvalidAgeException, EngineInvalidRpmException, BusDriverInvalidAgeException {
        LOGGER.info("Going to create train ");
        return UNDERGROUND_DAO.create(underground);
    }

    public static Underground getById(Long id){
        LOGGER.info("Going to get train by ID");
        return UNDERGROUND_DAO.getById(id);
    }

    public static List<Underground> get(){
        LOGGER.info("Going to get all trains");
        return UNDERGROUND_DAO.get();
    }

    public static Underground update(Underground underground) throws TransportInvalidParamException, TrainDriverInvalidAgeException, EngineInvalidRpmException, BusDriverInvalidAgeException {
        LOGGER.info("Going to update train");
        return UNDERGROUND_DAO.update(underground);
    }

    public static Long deleteById(Long id){
        LOGGER.info("Going to delete train by id");
        return UNDERGROUND_DAO.deleteById(id);
    }
}