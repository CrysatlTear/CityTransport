package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.DriverDao.impl.xml;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.DriverDao.MonorailDriverlDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.MonorailTrainDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.XMLIO;

import javax.xml.bind.JAXBException;
import java.util.List;

public class MonorailDriverDaoImplXML implements MonorailDriverlDao {

    @Override
    public MonorailTrainDriver create(MonorailTrainDriver o) {
        try {
            new XMLIO<>(MonorailTrainDriver.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public MonorailTrainDriver getById(Long id) {
        try {
            return new XMLIO<>(MonorailTrainDriver.class).read(String.format(IOConstant.XML_OBJ_PATH, MonorailTrainDriver.class.getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<MonorailTrainDriver> get() {
        return null;
    }

    @Override
    public MonorailTrainDriver update(MonorailTrainDriver o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
