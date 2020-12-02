package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.json;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.TramDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Tram;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class TramDaoImplJson implements TramDao {
    @Override
    public Tram create(Tram o) {
        try {
            new JsonIO<>(Tram.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public Tram getById(Long id) {
        try {
            return new JsonIO<>(Tram.class).read(String.format(IOConstant.JSON_OBJ_PATH, Tram.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Tram> get() {
        return null;
    }

    @Override
    public Tram update(Tram o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
