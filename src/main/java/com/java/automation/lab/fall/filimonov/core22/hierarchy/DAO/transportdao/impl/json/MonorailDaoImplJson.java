package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.json;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.MonorailDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.MonoRail;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class MonorailDaoImplJson implements MonorailDao {
    @Override
    public MonoRail create(MonoRail o) {
        try {
            new JsonIO<>(MonoRail.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public MonoRail getById(Long id) {
        try {
            return new JsonIO<>(MonoRail.class).read(String.format(IOConstant.JSON_OBJ_PATH, MonoRail.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<MonoRail> get() {
        return null;
    }

    @Override
    public MonoRail update(MonoRail o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
