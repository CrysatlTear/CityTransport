package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.DriverDao.impl.mock;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.DriverDao.TrolleybusDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.NotImplementMethodExeption;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.TrolleyBusDriver;

import java.util.List;

public class TrolleybusDriverDaoImpl implements TrolleybusDriverDao {
    private static TrolleybusDriverDaoImpl instance;

    public static synchronized TrolleybusDriverDaoImpl getInstance(){
        if(instance == null){
            instance = new TrolleybusDriverDaoImpl();
        }
        return instance;
    }

    private TrolleybusDriverDaoImpl(){

    }

    @Override
    public TrolleyBusDriver create(TrolleyBusDriver trolleyBusDriver) throws BusDriverInvalidAgeException {
        return new TrolleyBusDriver(
                trolleyBusDriver.getName(),
                trolleyBusDriver.getAge(),
                trolleyBusDriver.getLicence()

        );
    }

    @Override
    public TrolleyBusDriver getById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public List<TrolleyBusDriver> get() {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public TrolleyBusDriver update(TrolleyBusDriver trolleyBusDriver) throws BusDriverInvalidAgeException {
        return new TrolleyBusDriver(
                trolleyBusDriver.getName(),
                trolleyBusDriver.getAge(),
                trolleyBusDriver.getLicence()

        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }
}
