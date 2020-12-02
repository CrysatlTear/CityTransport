package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.json;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.UndergroundDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Underground;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class UndergroundDaoImplJson implements UndergroundDao {
    @Override
    public Underground create(Underground o) {
        try {
            new JsonIO<>(Underground.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public Underground getById(Long id) {
        try {
            return new JsonIO<>(Underground.class).read(String.format(IOConstant.JSON_OBJ_PATH, Underground.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Underground> get() {
        return null;
    }

    @Override
    public Underground update(Underground o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
