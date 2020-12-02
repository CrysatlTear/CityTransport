package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.transportservice;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.TramDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.mock.TramDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Tram;

import java.util.List;

public class TramService {
    private static final TramDao TRAM_DAO = TramDaoImpl.getInstance();

    public static Tram createTram(Tram bus) throws TransportInvalidParamException, BusDriverInvalidAgeException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        return TRAM_DAO.create(bus);
    }

    public static Tram getBusById(Long id){
        return TRAM_DAO.getById(id);
    }

    public static List<Tram> get(){
        return TRAM_DAO.get();
    }

    public static Tram update(Tram bus) throws TransportInvalidParamException, BusDriverInvalidAgeException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        return TRAM_DAO.update(bus);
    }

    public static Long deleteById(Long id){
        return TRAM_DAO.deleteById(id);
    }
}
