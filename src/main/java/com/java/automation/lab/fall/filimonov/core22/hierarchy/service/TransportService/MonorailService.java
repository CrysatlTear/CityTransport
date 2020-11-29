package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.TransportService;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.TransportDao.MonorailDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.TransportDao.impl.mock.MonorailDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.MonoRail;


import java.util.List;

public class MonorailService {
    private static final MonorailDao MONORAIL_DAO = MonorailDaoImpl.getInstance();

    public static MonoRail createMonoRail(MonoRail bus) throws TransportInvalidParamException, BusDriverInvalidAgeException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        return MONORAIL_DAO.create(bus);
    }

    public static MonoRail getBusById(Long id){
        return MONORAIL_DAO.getById(id);
    }

    public static List<MonoRail> get(){
        return MONORAIL_DAO.get();
    }

    public static MonoRail update(MonoRail bus) throws TransportInvalidParamException, BusDriverInvalidAgeException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        return MONORAIL_DAO.update(bus);
    }

    public static Long deleteById(Long id){
        return MONORAIL_DAO.deleteById(id);
    }
}
