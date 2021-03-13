package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.engineservice;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.ElecEngineDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.impl.mock.ElecEngineDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.ElectricEngine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.service.driverservice.BusDriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class ElectricEngineService {
    private static final ElecEngineDao IC_ENGINE_DAO = ElecEngineDaoImpl.getInstance();
    private static final Logger LOGGER = LoggerFactory.getLogger(BusDriverService.class);

    public static ElectricEngine createEngine(ElectricEngine electricEngine) throws EngineInvalidRpmException, TrainDriverInvalidAgeException, TransportInvalidParamException, BusDriverInvalidAgeException {
        LOGGER.info("Going to create trolleybus driver");
        return IC_ENGINE_DAO.create(electricEngine);
    }

    public static ElectricEngine getBusById(Long id){
        LOGGER.info("Going to create trolleybus driver");
        return IC_ENGINE_DAO.getById(id);
    }

    public static List<ElectricEngine> get(){
        LOGGER.info("Going to create trolleybus driver");
        return IC_ENGINE_DAO.get();
    }

    public static ElectricEngine update(ElectricEngine electricEngine) throws EngineInvalidRpmException, TrainDriverInvalidAgeException, TransportInvalidParamException, BusDriverInvalidAgeException {
        LOGGER.info("Going to create trolleybus driver");
        return IC_ENGINE_DAO.update(electricEngine);
    }

    public static Long deleteById(Long id){
        LOGGER.info("Going to create trolleybus driver");
        return IC_ENGINE_DAO.deleteById(id);
    }
}
