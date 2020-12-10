package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.impl.mock;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.IcEngineDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.NotImplementMethodExeption;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.IcEngine;

import java.util.List;

public class IcEngineDaoImpl implements IcEngineDao {
    private static IcEngineDaoImpl instance;

    public static synchronized IcEngineDaoImpl getInstance(){
        if(instance == null){
            instance = new IcEngineDaoImpl();
        }
        return instance;
    }

    private IcEngineDaoImpl(){

    }

    @Override
    public IcEngine create(IcEngine electricEngine) throws EngineInvalidRpmException {
        return new IcEngine(
                electricEngine.getId(),
                electricEngine.getRpm(),
                electricEngine.getTickpm(),
                electricEngine.getFuel(),
                electricEngine.getModelName(),
                electricEngine.getCapacity()
        );
    }

    @Override
    public IcEngine getById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public List<IcEngine> get() {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public IcEngine update(IcEngine electricEngine) throws EngineInvalidRpmException {
        return new IcEngine(
                electricEngine.getId(),
                electricEngine.getRpm(),
                electricEngine.getTickpm(),
                electricEngine.getFuel(),
                electricEngine.getModelName(),
                electricEngine.getCapacity()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }
}
