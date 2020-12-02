package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.transportservice;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.BusDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.mock.BusDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Bus;

import java.util.List;

public class BusService {
    private static final BusDao BUS_DAO = BusDaoImpl.getInstance();

    public static Bus createBus(Bus bus) throws TransportInvalidParamException, BusDriverInvalidAgeException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        return BUS_DAO.create(bus);
    }

    public static Bus getBusById(Long id){
        return BUS_DAO.getById(id);
    }

    public static List<Bus> get(){
        return BUS_DAO.get();
    }

    public static Bus update(Bus bus) throws TransportInvalidParamException, BusDriverInvalidAgeException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        return BUS_DAO.update(bus);
    }

    public static Long deleteById(Long id){
        return BUS_DAO.deleteById(id);
    }
}
