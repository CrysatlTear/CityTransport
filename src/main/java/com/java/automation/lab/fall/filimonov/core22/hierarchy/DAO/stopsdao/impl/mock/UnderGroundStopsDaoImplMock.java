package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.stopsdao.impl.mock;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.stopsdao.UndergroundStopsDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.stops.UndergroundStops;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.NotImplementMethodExeption;

import java.util.List;

public class UnderGroundStopsDaoImplMock implements UndergroundStopsDao {
    private static UnderGroundStopsDaoImplMock instance;

    public static synchronized UnderGroundStopsDaoImplMock getInstance(){
        if(instance == null){
            instance = new UnderGroundStopsDaoImplMock();
        }
        return instance;
    }

    private UnderGroundStopsDaoImplMock(){

    }

    @Override
    public UndergroundStops create(UndergroundStops o) throws EngineInvalidRpmException {
        return new UndergroundStops(
                o.getName(),
                o.getCoordinates2D()
        );
    }

    @Override
    public UndergroundStops getById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public List<UndergroundStops> get() {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }

    @Override
    public UndergroundStops update(UndergroundStops o) throws EngineInvalidRpmException {
        return new UndergroundStops(
                o.getName(),
                o.getCoordinates2D()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementMethodExeption("Method not implemented getById");
    }
}
