package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.DriverDao.impl.json;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.DriverDao.TramDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.TramDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.ElectricEngine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.NotImplementMethodExeption;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class TramDriverDaoImplJson implements TramDriverDao {
    @Override
    public TramDriver create(TramDriver o) {
        try {
            new JsonIO<>(TramDriver.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public TramDriver getById(Long id) {
        try {
            return new JsonIO<>(TramDriver.class).read(String.format(IOConstant.JSON_OBJ_PATH, TramDriver.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<TramDriver> get() {
        return null;
    }

    @Override
    public TramDriver update(TramDriver o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
