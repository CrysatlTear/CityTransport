package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.DriverDao.impl.mock;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.DriverDao.UndergroundDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.NotImplementMethodExeption;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.UndergroundDriver;

import java.util.List;

public class UndergroundDriverDaoImpl implements UndergroundDriverDao {
    private static UndergroundDriverDaoImpl instance;

    public static synchronized UndergroundDriverDaoImpl getInstance(){
        if(instance == null){
            instance = new UndergroundDriverDaoImpl();
        }
        return instance;
    }

    private UndergroundDriverDaoImpl(){

    }

    @Override
    public UndergroundDriver create(UndergroundDriver undergroundDriver) throws TrainDriverInvalidAgeException {
        return new UndergroundDriver(
                undergroundDriver.getName(),
                undergroundDriver.getAge(),
                undergroundDriver.getLicence()

        );
    }

    @Override
    public UndergroundDriver getById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public List<UndergroundDriver> get() {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public UndergroundDriver update(UndergroundDriver undergroundDriver) throws TrainDriverInvalidAgeException {
        return new UndergroundDriver(
                undergroundDriver.getName(),
                undergroundDriver.getAge(),
                undergroundDriver.getLicence()

        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }
}
