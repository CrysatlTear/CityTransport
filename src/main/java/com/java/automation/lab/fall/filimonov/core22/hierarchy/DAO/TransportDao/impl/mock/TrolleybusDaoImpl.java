package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.TransportDao.impl.mock;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.TransportDao.TrolleybusDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.NotImplementMethodExeption;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.TrolleyBus;

import java.util.List;

public class TrolleybusDaoImpl implements TrolleybusDao {
    private static TrolleybusDaoImpl instance;

    public static synchronized TrolleybusDaoImpl getInstance(){
        if(instance == null){
            instance = new TrolleybusDaoImpl();
        }
        return instance;
    }

    private TrolleybusDaoImpl(){

    }

    @Override
    public TrolleyBus create(TrolleyBus trolleyBus) throws TransportInvalidParamException, BusDriverInvalidAgeException {
        return new TrolleyBus(
                trolleyBus.getId(),
                trolleyBus.getPrice(),
                trolleyBus.getMaxSpeed(),
                trolleyBus.getSize(),
                trolleyBus.getModelName(),
                trolleyBus.getEngine(),
                trolleyBus.getCoordinates(),
                trolleyBus.getPassengers()
        );
    }

    @Override
    public TrolleyBus getById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public List<TrolleyBus> get() {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public TrolleyBus update(TrolleyBus trolleyBus) throws TransportInvalidParamException, BusDriverInvalidAgeException {
        return new TrolleyBus(
                trolleyBus.getId(),
                trolleyBus.getPrice(),
                trolleyBus.getMaxSpeed(),
                trolleyBus.getSize(),
                trolleyBus.getModelName(),
                trolleyBus.getEngine(),
                trolleyBus.getCoordinates(),
                trolleyBus.getPassengers()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }
}
