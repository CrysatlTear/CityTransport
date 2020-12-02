package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.impl.json;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.ElecEngineDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.ElectricEngine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.JsonIO;
import java.io.IOException;
import java.util.List;

public class ElecEngineDaoImplJson implements ElecEngineDao {
    @Override
    public ElectricEngine create(ElectricEngine o) {
        try {
            new JsonIO<>(ElectricEngine.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public ElectricEngine getById(Long id) {
        try {
            return new JsonIO<>(ElectricEngine.class).read(String.format(IOConstant.JSON_OBJ_PATH, ElectricEngine.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<ElectricEngine> get() {
        return null;
    }

    @Override
    public ElectricEngine update(ElectricEngine o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
