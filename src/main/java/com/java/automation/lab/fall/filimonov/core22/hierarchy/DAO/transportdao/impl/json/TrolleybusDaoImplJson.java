package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.json;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.TrolleybusDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.TrolleyBus;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class TrolleybusDaoImplJson implements TrolleybusDao {
    @Override
    public TrolleyBus create(TrolleyBus o) {
        try {
            new JsonIO<>(TrolleyBus.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public TrolleyBus getById(Long id) {
        try {
            return new JsonIO<>(TrolleyBus.class).read(String.format(IOConstant.JSON_OBJ_PATH, TrolleyBus.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<TrolleyBus> get() {
        return null;
    }

    @Override
    public TrolleyBus update(TrolleyBus o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
