package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.stopsdao.impl.json;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.stopsdao.UndergroundStopsDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.stops.UndergroundStops;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class UndergroundStopsDaoImplJson implements UndergroundStopsDao {
    @Override
    public UndergroundStops create(UndergroundStops o) {
        try {
            new JsonIO<>(UndergroundStops.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public UndergroundStops getById(Long id) {
        try {
            return new JsonIO<>(UndergroundStops.class).read(String.format(IOConstant.JSON_OBJ_PATH, UndergroundStops.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<UndergroundStops> get() {
        return null;
    }

    @Override
    public UndergroundStops update(UndergroundStops o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
