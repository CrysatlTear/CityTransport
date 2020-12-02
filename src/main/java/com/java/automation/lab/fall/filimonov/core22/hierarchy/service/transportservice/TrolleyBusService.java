package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.transportservice;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.TrolleybusDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.mock.TrolleybusDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.TrolleyBus;

import java.util.List;

public class TrolleyBusService {
    private static final TrolleybusDao TROLLEYBUS_DAO = TrolleybusDaoImpl.getInstance();

    public static TrolleyBus createTrolleybus(TrolleyBus bus) throws TransportInvalidParamException, BusDriverInvalidAgeException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        return TROLLEYBUS_DAO.create(bus);
    }

    public static TrolleyBus getBusById(Long id){
        return TROLLEYBUS_DAO.getById(id);
    }

    public static List<TrolleyBus> get(){
        return TROLLEYBUS_DAO.get();
    }

    public static TrolleyBus update(TrolleyBus bus) throws TransportInvalidParamException, BusDriverInvalidAgeException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        return TROLLEYBUS_DAO.update(bus);
    }

    public static Long deleteById(Long id){
        return TROLLEYBUS_DAO.deleteById(id);
    }
}
