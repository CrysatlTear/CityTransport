package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.DriverDao.impl.mock;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.DriverDao.MonorailDriverlDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.NotImplementMethodExeption;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.MonorailTrainDriver;

import java.util.List;

public class MonorailDriverDaoImpl implements MonorailDriverlDao {

    private static MonorailDriverDaoImpl instance;

    public static synchronized MonorailDriverDaoImpl getInstance(){
        if(instance == null){
            instance = new MonorailDriverDaoImpl();
        }
        return instance;
    }

    private MonorailDriverDaoImpl(){

    }

    @Override
    public MonorailTrainDriver create(MonorailTrainDriver monorailTrainDriver) throws TrainDriverInvalidAgeException {
        return new MonorailTrainDriver(
                monorailTrainDriver.getName(),
                monorailTrainDriver.getAge(),
                monorailTrainDriver.getLicence()

        );
    }

    @Override
    public MonorailTrainDriver getById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public List<MonorailTrainDriver> get() {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public MonorailTrainDriver update(MonorailTrainDriver monorailTrainDriver) throws TrainDriverInvalidAgeException {
        return new MonorailTrainDriver(
                monorailTrainDriver.getName(),
                monorailTrainDriver.getAge(),
                monorailTrainDriver.getLicence()

        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }
}
