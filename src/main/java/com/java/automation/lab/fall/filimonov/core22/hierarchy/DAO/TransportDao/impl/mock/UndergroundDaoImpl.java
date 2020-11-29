package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.TransportDao.impl.mock;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.TransportDao.UndergroundDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.NotImplementMethodExeption;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Underground;

import java.util.List;

public class UndergroundDaoImpl implements UndergroundDao {
    private static UndergroundDaoImpl instance;

    public static synchronized UndergroundDaoImpl getInstance(){
        if(instance == null){
            instance = new UndergroundDaoImpl();
        }
        return instance;
    }

    private UndergroundDaoImpl(){

    }

    @Override
    public Underground create(Underground train) throws TransportInvalidParamException, TrainDriverInvalidAgeException {
        return new Underground(
                train.getId(),
                train.getPrice(),
                train.getMaxSpeed(),
                train.getSize(),
                train.getModelName(),
                train.getEngine(),
                train.getWagons(),
                train.getCoordinates(),
                train.getPassengers()
        );
    }

    @Override
    public Underground getById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public List<Underground> get() {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public Underground update(Underground train) throws TransportInvalidParamException, TrainDriverInvalidAgeException {
        return new Underground(
                train.getId(),
                train.getPrice(),
                train.getMaxSpeed(),
                train.getSize(),
                train.getModelName(),
                train.getEngine(),
                train.getWagons(),
                train.getCoordinates(),
                train.getPassengers()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }
}
