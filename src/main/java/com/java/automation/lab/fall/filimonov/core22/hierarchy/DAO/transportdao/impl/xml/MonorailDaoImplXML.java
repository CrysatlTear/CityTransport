package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.xml;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.MonorailDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.MonoRail;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.XMLIO;

import javax.xml.bind.JAXBException;
import java.util.List;

public class MonorailDaoImplXML implements MonorailDao {
    @Override
    public MonoRail create(MonoRail o) {
        try {
            new XMLIO<>(MonoRail.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public MonoRail getById(Long id) {
        try {
            return new XMLIO<>(MonoRail.class).read(String.format(IOConstant.XML_OBJ_PATH, MonoRail.class.getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<MonoRail> get() {
        return null;
    }

    @Override
    public MonoRail update(MonoRail o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
