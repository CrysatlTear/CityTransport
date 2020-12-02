package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.impl.mock;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.TramDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.NotImplementMethodExeption;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.TramDriver;

import java.util.List;

public class TramDriverDaoImpl implements TramDriverDao {
    private static TramDriverDaoImpl instance;

    public static synchronized TramDriverDaoImpl getInstance(){
        if(instance == null){
            instance = new TramDriverDaoImpl();
        }
        return instance;
    }

    private TramDriverDaoImpl(){

    }

    @Override
    public TramDriver create(TramDriver tramDriver) throws BusDriverInvalidAgeException {
        return new TramDriver(
                tramDriver.getName(),
                tramDriver.getAge(),
                tramDriver.getLicence()

        );
    }

    @Override
    public TramDriver getById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public List<TramDriver> get() {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public TramDriver update(TramDriver tramDriver) throws BusDriverInvalidAgeException {
        return new TramDriver(
                tramDriver.getName(),
                tramDriver.getAge(),
                tramDriver.getLicence()

        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }
}
