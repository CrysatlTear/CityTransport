package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.DriverDao.impl.mock;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.DriverDao.BusDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.NotImplementMethodExeption;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.BusDriver;

import java.util.List;

public class BusDriverDaoImpl implements BusDriverDao {

    private static BusDriverDaoImpl instance;

    public static synchronized BusDriverDaoImpl getInstance(){
        if(instance == null){
            instance = new BusDriverDaoImpl();
        }
        return instance;
    }

    private BusDriverDaoImpl(){

    }

    @Override
    public BusDriver create(BusDriver busDriver) throws BusDriverInvalidAgeException {
        return new BusDriver(
                busDriver.getName(),
                busDriver.getAge(),
                busDriver.getLicence()

        );
    }

    @Override
    public BusDriver getById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public List<BusDriver> get() {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public BusDriver update(BusDriver busDriver) throws BusDriverInvalidAgeException {
        return new BusDriver(
                busDriver.getName(),
                busDriver.getAge(),
                busDriver.getLicence()

        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }
}
