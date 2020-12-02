package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.impl.json;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.TrolleybusDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.TrolleyBusDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class TrolleybusDriverDaoImplJson implements TrolleybusDriverDao {
    @Override
    public TrolleyBusDriver create(TrolleyBusDriver o) {
        try {
            new JsonIO<>(TrolleyBusDriver.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public TrolleyBusDriver getById(Long id) {
        try {
            return new JsonIO<>(TrolleyBusDriver.class).read(String.format(IOConstant.JSON_OBJ_PATH, TrolleyBusDriver.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<TrolleyBusDriver> get() {
        return null;
    }

    @Override
    public TrolleyBusDriver update(TrolleyBusDriver o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
