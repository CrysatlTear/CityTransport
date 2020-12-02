package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.stopsdao.impl.mock;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.stopsdao.GroundStopsDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.stops.GroundStops;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.NotImplementMethodExeption;

import java.util.List;

public class GroundStopsDaoImplMock implements GroundStopsDao {
    private static GroundStopsDaoImplMock instance;

    public static synchronized GroundStopsDaoImplMock getInstance(){
        if(instance == null){
            instance = new GroundStopsDaoImplMock();
        }
        return instance;
    }

    private GroundStopsDaoImplMock(){

    }

    @Override
    public GroundStops create(GroundStops o) throws EngineInvalidRpmException {
        return new GroundStops(
                o.getName(),
                o.getCoordinates2D()
        );
    }

    @Override
    public GroundStops getById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public List<GroundStops> get() {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public GroundStops update(GroundStops o) throws EngineInvalidRpmException {
        return new GroundStops(
                o.getName(),
                o.getCoordinates2D()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }
}
