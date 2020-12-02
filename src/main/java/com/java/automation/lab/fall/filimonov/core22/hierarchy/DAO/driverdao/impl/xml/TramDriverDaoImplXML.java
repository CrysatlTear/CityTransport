package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.impl.xml;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.TramDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.TramDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.XMLIO;

import javax.xml.bind.JAXBException;
import java.util.List;

public class TramDriverDaoImplXML implements TramDriverDao {
    private static TramDriverDaoImplXML instance;

    @Override
    public TramDriver create(TramDriver o) {
        try {
            new XMLIO<>(TramDriver.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public TramDriver getById(Long id) {
        try {
            return new XMLIO<>(TramDriver.class).read(String.format(IOConstant.XML_OBJ_PATH, TramDriver.class.getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<TramDriver> get() {
        return null;
    }

    @Override
    public TramDriver update(TramDriver o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
