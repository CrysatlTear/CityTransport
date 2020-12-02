package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.stopsdao.impl.json;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.stopsdao.GroundStopsDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.stops.GroundStops;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class GroundStopsDaoImplJson implements GroundStopsDao {
    @Override
    public GroundStops create(GroundStops o) {
        try {
            new JsonIO<>(GroundStops.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public GroundStops getById(Long id) {
        try {
            return new JsonIO<>(GroundStops.class).read(String.format(IOConstant.JSON_OBJ_PATH, GroundStops.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<GroundStops> get() {
        return null;
    }

    @Override
    public GroundStops update(GroundStops o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
