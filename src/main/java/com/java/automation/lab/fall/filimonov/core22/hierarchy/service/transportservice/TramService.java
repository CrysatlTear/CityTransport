package com.java.automation.lab.fall.filimonov.core22.hierarchy.service.transportservice;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.TramDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.mock.TramDaoImpl;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Tram;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.service.driverservice.BusDriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class TramService {
    private static final TramDao TRAM_DAO = TramDaoImpl.getInstance();
    private static final Logger LOGGER = LoggerFactory.getLogger(BusDriverService.class);

    public static Tram create(Tram bus) throws TransportInvalidParamException, BusDriverInvalidAgeException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        LOGGER.info("Going to create tram");
        return TRAM_DAO.create(bus);
    }

    public static Tram getById(Long id){
        LOGGER.info("Going to get tram by id");
        return TRAM_DAO.getById(id);
    }

    public static List<Tram> get(){
        LOGGER.info("Going to get all trams");
        return TRAM_DAO.get();
    }

    public static Tram update(Tram bus) throws TransportInvalidParamException, BusDriverInvalidAgeException, TrainDriverInvalidAgeException, EngineInvalidRpmException {
        LOGGER.info("Going to create tram by id");
        return TRAM_DAO.update(bus);
    }

    public static Long deleteById(Long id){
        LOGGER.info("Going to delete tram by id");
        return TRAM_DAO.deleteById(id);
    }
}
