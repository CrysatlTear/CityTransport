package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.json;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.BusDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Bus;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class BusDaoImplJson implements BusDao {
    @Override
    public Bus create(Bus o) {
        try {
            new JsonIO<>(Bus.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public Bus getById(Long id) {
        try {
            return new JsonIO<>(Bus.class).read(String.format(IOConstant.JSON_OBJ_PATH, Bus.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Bus> get() {
        return null;
    }

    @Override
    public Bus update(Bus o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
