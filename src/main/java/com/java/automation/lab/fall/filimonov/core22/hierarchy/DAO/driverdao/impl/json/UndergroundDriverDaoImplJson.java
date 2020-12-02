package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.impl.json;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.UndergroundDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.UndergroundDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class UndergroundDriverDaoImplJson implements UndergroundDriverDao {
    @Override
    public UndergroundDriver create(UndergroundDriver o) {
        try {
            new JsonIO<>(UndergroundDriver.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public UndergroundDriver getById(Long id) {
        try {
            return new JsonIO<>(UndergroundDriver.class).read(String.format(IOConstant.JSON_OBJ_PATH, UndergroundDriver.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<UndergroundDriver> get() {
        return null;
    }

    @Override
    public UndergroundDriver update(UndergroundDriver o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
