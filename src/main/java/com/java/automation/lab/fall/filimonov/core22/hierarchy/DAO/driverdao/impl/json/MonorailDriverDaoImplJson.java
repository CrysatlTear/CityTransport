package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.impl.json;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.MonorailDriverlDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.MonorailTrainDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class MonorailDriverDaoImplJson implements MonorailDriverlDao {
    @Override
    public MonorailTrainDriver create(MonorailTrainDriver o) {
        try {
            new JsonIO<>(MonorailTrainDriver.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public MonorailTrainDriver getById(Long id) {
        try {
            return new JsonIO<>(MonorailTrainDriver.class).read(String.format(IOConstant.JSON_OBJ_PATH, MonorailTrainDriver.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<MonorailTrainDriver> get() {
        return null;
    }

    @Override
    public MonorailTrainDriver update(MonorailTrainDriver o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
