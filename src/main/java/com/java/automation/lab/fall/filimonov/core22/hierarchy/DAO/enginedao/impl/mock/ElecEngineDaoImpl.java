package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.impl.mock;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.ElecEngineDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.NotImplementMethodExeption;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.ElectricEngine;
import java.util.List;

public class ElecEngineDaoImpl implements ElecEngineDao {
    private static ElecEngineDaoImpl instance;

    public static synchronized ElecEngineDaoImpl getInstance(){
        if(instance == null){
            instance = new ElecEngineDaoImpl();
        }
        return instance;
    }

    private ElecEngineDaoImpl(){

    }

    @Override
    public ElectricEngine create(ElectricEngine electricEngine) throws EngineInvalidRpmException {
        return new ElectricEngine(
                electricEngine.getId(),
                electricEngine.getRpm(),
                electricEngine.getTickpm(),
                electricEngine.getFuel(),
                electricEngine.getModelName(),
                electricEngine.getTractionForce(),
                electricEngine.getCharge()
        );
    }

    @Override
    public ElectricEngine getById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public List<ElectricEngine> get() {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public ElectricEngine update(ElectricEngine electricEngine) throws EngineInvalidRpmException {
        return new ElectricEngine(
                electricEngine.getId(),
                electricEngine.getRpm(),
                electricEngine.getTickpm(),
                electricEngine.getFuel(),
                electricEngine.getModelName(),
                electricEngine.getTractionForce(),
                electricEngine.getCharge()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }
}
