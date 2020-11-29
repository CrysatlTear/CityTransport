package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.base.AbstractModel;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TransportInvalidParamException;

import java.util.List;

public interface DAO<T extends AbstractModel> {
    T create(T t) throws TransportInvalidParamException, BusDriverInvalidAgeException, TrainDriverInvalidAgeException, EngineInvalidRpmException;
    T getById(Long id);
    List<T> get();
    T update(T t) throws TransportInvalidParamException, BusDriverInvalidAgeException, TrainDriverInvalidAgeException, EngineInvalidRpmException;
    Long deleteById(Long id);
}
