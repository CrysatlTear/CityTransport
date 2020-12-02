package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.DriverDao.impl.json;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.DriverDao.BusDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.BusDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.ElectricEngine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.NotImplementMethodExeption;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class BusDriverDaoImplJson implements BusDriverDao {
    @Override
    public BusDriver create(BusDriver o) {
        try {
            new JsonIO<>(BusDriver.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public BusDriver getById(Long id) {
        try {
            return new JsonIO<>(BusDriver.class).read(String.format(IOConstant.JSON_OBJ_PATH, BusDriver.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<BusDriver> get() {
        return null;
    }

    @Override
    public BusDriver update(BusDriver o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
