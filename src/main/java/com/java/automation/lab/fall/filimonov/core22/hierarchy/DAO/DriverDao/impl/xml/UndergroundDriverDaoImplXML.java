package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.DriverDao.impl.xml;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.DriverDao.UndergroundDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.TrolleyBusDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.UndergroundDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.NotImplementMethodExeption;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io.XMLIO;

import javax.xml.bind.JAXBException;
import java.util.List;

public class UndergroundDriverDaoImplXML implements UndergroundDriverDao {
    @Override
    public UndergroundDriver create(UndergroundDriver o) {
        try {
            new XMLIO<>(UndergroundDriver.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public UndergroundDriver getById(Long id) {
        try {
            return new XMLIO<>(UndergroundDriver.class).read(String.format(IOConstant.XML_OBJ_PATH, UndergroundDriver.class.getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<UndergroundDriver> get() {
        return null;
    }

    @Override
    public UndergroundDriver update(UndergroundDriver o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
