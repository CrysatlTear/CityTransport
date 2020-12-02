package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.impl.json;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.IcEngineDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.IcEngine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.JsonIO;
import java.io.IOException;
import java.util.List;

public class IcEngineDaoImplJson implements IcEngineDao {
    @Override
    public IcEngine create(IcEngine o) {
        try {
            new JsonIO<>(IcEngine.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public IcEngine getById(Long id) {
        try {
            return new JsonIO<>(IcEngine.class).read(String.format(IOConstant.JSON_OBJ_PATH, IcEngine.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<IcEngine> get() {
        return null;
    }

    @Override
    public IcEngine update(IcEngine o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
