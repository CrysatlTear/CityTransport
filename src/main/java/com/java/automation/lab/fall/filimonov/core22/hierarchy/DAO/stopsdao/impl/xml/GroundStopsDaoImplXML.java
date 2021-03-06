package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.stopsdao.impl.xml;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.stopsdao.GroundStopsDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.stops.GroundStops;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.XMLIO;

import javax.xml.bind.JAXBException;
import java.util.List;

public class GroundStopsDaoImplXML implements GroundStopsDao {
    @Override
    public GroundStops create(GroundStops o) {
        try {
            new XMLIO<>(GroundStops.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public GroundStops getById(Long id) {
        try {
            return new XMLIO<>(GroundStops.class).read(String.format(IOConstant.XML_OBJ_PATH, GroundStops.class.getCanonicalName()));
        } catch (JAXBException e) {
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
