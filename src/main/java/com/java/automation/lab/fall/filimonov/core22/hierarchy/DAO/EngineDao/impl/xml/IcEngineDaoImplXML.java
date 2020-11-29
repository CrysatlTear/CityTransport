package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.EngineDao.impl.xml;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.EngineDao.IcEngineDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.MonorailTrainDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.IcEngine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.NotImplementMethodExeption;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.XMLIO;

import javax.xml.bind.JAXBException;
import java.util.List;

public class IcEngineDaoImplXML implements IcEngineDao {
    @Override
    public IcEngine create(IcEngine o) {
        try {
            new XMLIO<>(IcEngine.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public IcEngine getById(Long id) {
        try {
            return new XMLIO<>(IcEngine.class).read(String.format(IOConstant.XML_OBJ_PATH, IcEngine.class.getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<IcEngine> get() {
        return null;
    }

    @Override
    public IcEngine update(IcEngine o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
