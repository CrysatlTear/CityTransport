package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.TransportService;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.UndergroundDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.mock.UndergroundDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Underground;


import java.util.List;

public class UndergroundService {
    private static final UndergroundDao UNDERGROUND_DAO = UndergroundDaoImpl.getInstance();

    public static Underground createTrain(Underground underground) throws TransportInvalidParamException, TrainDriverInvalidAgeException, EngineInvalidRpmException, BusDriverInvalidAgeException {
        return UNDERGROUND_DAO.create(underground);
    }

    public static Underground getBusById(Long id){
        return UNDERGROUND_DAO.getById(id);
    }

    public static List<Underground> get(){
        return UNDERGROUND_DAO.get();
    }

    public static Underground update(Underground underground) throws TransportInvalidParamException, TrainDriverInvalidAgeException, EngineInvalidRpmException, BusDriverInvalidAgeException {
        return UNDERGROUND_DAO.update(underground);
    }

    public static Long deleteById(Long id){
        return UNDERGROUND_DAO.deleteById(id);
    }
}