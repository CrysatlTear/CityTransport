package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.transportservice;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.MonorailDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.mock.MonorailDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.MonoRail;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.service.driverservice.BusDriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.List;

public class MonorailService {
    private static final MonorailDao MONORAIL_DAO = MonorailDaoImpl.getInstance();
    private static final Logger LOGGER = LoggerFactory.getLogger(BusDriverService.class);

    public static MonoRail create(MonoRail bus) throws TransportInvalidParamException, BusDriverInvalidAgeException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        LOGGER.info("Going to create monorail");
        return MONORAIL_DAO.create(bus);
    }

    public static MonoRail getById(Long id){
        LOGGER.info("Going to get monorail by ID");
        return MONORAIL_DAO.getById(id);
    }

    public static List<MonoRail> get(){
        LOGGER.info("Going to get all momorail trains");
        return MONORAIL_DAO.get();
    }

    public static MonoRail update(MonoRail bus) throws TransportInvalidParamException, BusDriverInvalidAgeException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        LOGGER.info("Going to update monorail");
        return MONORAIL_DAO.update(bus);
    }

    public static Long deleteById(Long id){
        LOGGER.info("Going to delete monorail by ID");
        return MONORAIL_DAO.deleteById(id);
    }
}
