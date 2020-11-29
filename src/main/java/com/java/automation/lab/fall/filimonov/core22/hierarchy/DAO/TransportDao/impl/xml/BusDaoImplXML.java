package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.TransportDao.impl.xml;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.TransportDao.BusDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.ElectricEngine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Bus;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.NotImplementMethodExeption;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.XMLIO;

import javax.xml.bind.JAXBException;
import java.util.List;

public class BusDaoImplXML implements BusDao {
    @Override
    public Bus create(Bus o) {
        try {
            new XMLIO<>(Bus.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public Bus getById(Long id) {
        try {
            return new XMLIO<>(Bus.class).read(String.format(IOConstant.XML_OBJ_PATH, Bus.class.getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Bus> get() {
        return null;
    }

    @Override
    public Bus update(Bus o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
