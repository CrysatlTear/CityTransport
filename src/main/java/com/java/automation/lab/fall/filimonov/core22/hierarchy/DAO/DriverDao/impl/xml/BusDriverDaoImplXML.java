package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.DriverDao.impl.xml;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.DriverDao.BusDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.BusDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.XMLIO;

import javax.xml.bind.JAXBException;
import java.util.List;

public class BusDriverDaoImplXML implements BusDriverDao {
    @Override
    public BusDriver create(BusDriver o) {
        try {
            new XMLIO<>(BusDriver.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public BusDriver getById(Long id) {
        try {
            return new XMLIO<>(BusDriver.class).read(String.format(IOConstant.XML_OBJ_PATH, BusDriver.class.getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<BusDriver> get() {
        return null;
    }

    @Override
    public BusDriver update(BusDriver o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
