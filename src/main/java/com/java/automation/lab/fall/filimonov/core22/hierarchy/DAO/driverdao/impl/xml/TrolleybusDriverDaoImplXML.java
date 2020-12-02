package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.impl.xml;

import  com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.TrolleybusDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.TrolleyBusDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.XMLIO;

import javax.xml.bind.JAXBException;
import java.util.List;

public class TrolleybusDriverDaoImplXML implements TrolleybusDriverDao {

    @Override
    public TrolleyBusDriver create(TrolleyBusDriver o) {
        try {
            new XMLIO<>(TrolleyBusDriver.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public TrolleyBusDriver getById(Long id) {
        try {
            return new XMLIO<>(TrolleyBusDriver.class).read(String.format(IOConstant.XML_OBJ_PATH, TrolleyBusDriver.class.getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<TrolleyBusDriver> get() {
        return null;
    }

    @Override
    public TrolleyBusDriver update(TrolleyBusDriver o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
