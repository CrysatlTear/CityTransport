package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.mock;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.TramDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.NotImplementMethodExeption;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Tram;

import java.util.List;

public class TramDaoImpl implements TramDao {
    private static TramDaoImpl instance;

    public static synchronized TramDaoImpl getInstance(){
        if(instance == null){
            instance = new TramDaoImpl();
        }
        return instance;
    }

    private TramDaoImpl(){

    }

    @Override
    public Tram create(Tram tram) throws TransportInvalidParamException, BusDriverInvalidAgeException {
        return new Tram(
                tram.getId(),
                tram.getPrice(),
                tram.getMaxSpeed(),
                tram.getSize(),
                tram.getModelName(),
                tram.getEngine(),
                tram.getCoordinates(),
                tram.getPassengers()
        );
    }

    @Override
    public Tram getById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public List<Tram> get() {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public Tram update(Tram tram) throws TransportInvalidParamException, BusDriverInvalidAgeException {
        return new Tram(
                tram.getId(),
                tram.getPrice(),
                tram.getMaxSpeed(),
                tram.getSize(),
                tram.getModelName(),
                tram.getEngine(),
                tram.getCoordinates(),
                tram.getPassengers()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }
}
