package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.impl.xml;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.ElecEngineDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.ElectricEngine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.XMLIO;

import javax.xml.bind.JAXBException;
import java.util.List;

public class ElecEngineDaoImplXML implements ElecEngineDao {
    @Override
    public ElectricEngine create(ElectricEngine o) {
        try {
            new XMLIO<>(ElectricEngine.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public ElectricEngine getById(Long id) {
        try {
            return new XMLIO<>(ElectricEngine.class).read(String.format(IOConstant.XML_OBJ_PATH, ElectricEngine.class.getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<ElectricEngine> get() {
        return null;
    }

    @Override
    public ElectricEngine update(ElectricEngine o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
