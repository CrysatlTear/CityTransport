package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.TransportDao.impl.xml;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.TransportDao.TramDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.ElectricEngine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Tram;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.NotImplementMethodExeption;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.XMLIO;

import javax.xml.bind.JAXBException;
import java.util.List;

public class TramDaoImplXML implements TramDao {
    @Override
    public Tram create(Tram o) {
        try {
            new XMLIO<>(Tram.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public Tram getById(Long id) {
        try {
            return new XMLIO<>(Tram.class).read(String.format(IOConstant.XML_OBJ_PATH, Tram.class.getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Tram> get() {
        return null;
    }

    @Override
    public Tram update(Tram o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
