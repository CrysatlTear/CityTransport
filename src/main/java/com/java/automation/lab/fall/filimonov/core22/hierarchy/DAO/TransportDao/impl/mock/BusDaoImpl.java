package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.TransportDao.impl.mock;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.TransportDao.BusDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.NotImplementMethodExeption;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Bus;

import java.util.List;

public class BusDaoImpl implements BusDao {

    private static BusDaoImpl instance;

    public static synchronized BusDaoImpl getInstance(){
        if(instance == null){
            instance = new BusDaoImpl();
        }
        return instance;
    }

    private BusDaoImpl(){

    }

    @Override
    public Bus create(Bus bus) throws TransportInvalidParamException, BusDriverInvalidAgeException {
        return new Bus(
                bus.getId(),
                bus.getPrice(),
                bus.getMaxSpeed(),
                bus.getSize(),
                bus.getModelName(),
                bus.getEngine(),
                bus.getCoordinates(),
                bus.getPassengers()

        );
    }

    @Override
    public Bus getById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public List<Bus> get() {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public Bus update(Bus bus) throws TransportInvalidParamException, BusDriverInvalidAgeException {
        return new Bus(
                bus.getId(),
                bus.getPrice(),
                bus.getMaxSpeed(),
                bus.getSize(),
                bus.getModelName(),
                bus.getEngine(),
                bus.getCoordinates(),
                bus.getPassengers()

        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }
}
