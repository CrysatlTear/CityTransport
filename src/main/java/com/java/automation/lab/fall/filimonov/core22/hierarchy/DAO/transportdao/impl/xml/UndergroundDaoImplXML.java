package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.xml;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.UndergroundDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Underground;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.XMLIO;

import javax.xml.bind.JAXBException;
import java.util.List;

public class UndergroundDaoImplXML implements UndergroundDao {
    @Override
    public Underground create(Underground o) {
        try {
            new XMLIO<>(Underground.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public Underground getById(Long id) {
        try {
            return new XMLIO<>(Underground.class).read(String.format(IOConstant.XML_OBJ_PATH, Underground.class.getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Underground> get() {
        return null;
    }

    @Override
    public Underground update(Underground o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
