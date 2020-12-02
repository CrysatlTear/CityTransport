package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.engineservice;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.IcEngineDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.impl.mock.IcEngineDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.IcEngine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;

import java.util.List;

public class IcEngineService  {
    private static final IcEngineDao IC_ENGINE_DAO = IcEngineDaoImpl.getInstance();

    public static IcEngine createEngine(IcEngine icEngine) throws EngineInvalidRpmException, TrainDriverInvalidAgeException, TransportInvalidParamException, BusDriverInvalidAgeException {
        return IC_ENGINE_DAO.create(icEngine);
    }

    public static IcEngine getBusById(Long id){
        return IC_ENGINE_DAO.getById(id);
    }

    public static List<IcEngine> get(){
        return IC_ENGINE_DAO.get();
    }

    public static IcEngine update(IcEngine icEngine) throws EngineInvalidRpmException, TrainDriverInvalidAgeException, TransportInvalidParamException, BusDriverInvalidAgeException {
        return IC_ENGINE_DAO.update(icEngine);
    }

    public static Long deleteById(Long id){
        return IC_ENGINE_DAO.deleteById(id);
    }
}
