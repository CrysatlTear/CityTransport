package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.EngineService;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.ElecEngineDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.impl.mock.ElecEngineDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.ElectricEngine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;

import java.util.List;


public class ElectricEngineService {
    private static final ElecEngineDao IC_ENGINE_DAO = ElecEngineDaoImpl.getInstance();

    public static ElectricEngine createEngine(ElectricEngine electricEngine) throws EngineInvalidRpmException, TrainDriverInvalidAgeException, TransportInvalidParamException, BusDriverInvalidAgeException {
        return IC_ENGINE_DAO.create(electricEngine);
    }

    public static ElectricEngine getBusById(Long id){
        return IC_ENGINE_DAO.getById(id);
    }

    public static List<ElectricEngine> get(){
        return IC_ENGINE_DAO.get();
    }

    public static ElectricEngine update(ElectricEngine electricEngine) throws EngineInvalidRpmException, TrainDriverInvalidAgeException, TransportInvalidParamException, BusDriverInvalidAgeException {
        return IC_ENGINE_DAO.update(electricEngine);
    }

    public static Long deleteById(Long id){
        return IC_ENGINE_DAO.deleteById(id);
    }
}
