package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.TransportDao.impl.xml;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.TransportDao.TrolleybusDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.ElectricEngine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.TrolleyBus;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.NotImplementMethodExeption;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.XMLIO;

import javax.xml.bind.JAXBException;
import java.util.List;

public class TrolleybusDaoImplXML implements TrolleybusDao {
    @Override
    public TrolleyBus create(TrolleyBus o) {
        try {
            new XMLIO<>(TrolleyBus.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public TrolleyBus getById(Long id) {
        try {
            return new XMLIO<>(TrolleyBus.class).read(String.format(IOConstant.XML_OBJ_PATH, TrolleyBus.class.getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<TrolleyBus> get() {
        return null;
    }

    @Override
    public TrolleyBus update(TrolleyBus o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
