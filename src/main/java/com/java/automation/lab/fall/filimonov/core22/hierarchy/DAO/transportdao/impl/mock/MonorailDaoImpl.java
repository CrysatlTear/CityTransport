package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.mock;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.MonorailDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.NotImplementMethodExeption;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.MonoRail;

import java.util.List;

public class MonorailDaoImpl implements MonorailDao {

    private static MonorailDaoImpl instance;

    public static synchronized MonorailDaoImpl getInstance(){
        if(instance == null){
            instance = new MonorailDaoImpl();
        }
        return instance;
    }

    private MonorailDaoImpl(){

    }

    @Override
    public MonoRail create(MonoRail monoRail) throws TransportInvalidParamException, TrainDriverInvalidAgeException {
        return new MonoRail(
                monoRail.getId(),
                monoRail.getPrice(),
                monoRail.getMaxSpeed(),
                monoRail.getSize(),
                monoRail.getModelName(),
                monoRail.getEngine(),
                monoRail.getWagons(),
                monoRail.getCoordinates(),
                monoRail.getPassengers()
        );
    }

    @Override
    public MonoRail getById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public List<MonoRail> get() {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public MonoRail update(MonoRail monoRail) throws TransportInvalidParamException, TrainDriverInvalidAgeException {
        return new MonoRail(
                monoRail.getId(),
                monoRail.getPrice(),
                monoRail.getMaxSpeed(),
                monoRail.getSize(),
                monoRail.getModelName(),
                monoRail.getEngine(),
                monoRail.getWagons(),
                monoRail.getCoordinates(),
                monoRail.getPassengers()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }
}
