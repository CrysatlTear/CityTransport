package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.stopsdao.impl.xml;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.stopsdao.UndergroundStopsDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.stops.UndergroundStops;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.XMLIO;

import javax.xml.bind.JAXBException;
import java.util.List;

public class UndergroundStopsDaoImplXML implements UndergroundStopsDao {
    @Override
    public UndergroundStops create(UndergroundStops o) {
        try {
            new XMLIO<>(UndergroundStops.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public UndergroundStops getById(Long id) {
        try {
            return new XMLIO<>(UndergroundStops.class).read(String.format(IOConstant.XML_OBJ_PATH, UndergroundStops.class.getCanonicalName()));
        } catch (JAXBException e) {
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
