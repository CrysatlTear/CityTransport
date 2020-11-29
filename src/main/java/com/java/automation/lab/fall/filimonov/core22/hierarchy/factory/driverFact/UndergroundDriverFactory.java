package com.java.automation.lab.fall.filimonov.core22.hierarchy.factory.driverFact;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.enums.DriverLicence;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.UndergroundDriver;

public class UndergroundDriverFactory {
    public static UndergroundDriver createDefaultUndergroundDriver(String name, int age) throws TrainDriverInvalidAgeException {
        return new UndergroundDriver(name,age, DriverLicence.Underground_Train_Driver);
    }

    public static UndergroundDriver createProfesionalUndergroudDriver(String name, int age) throws TrainDriverInvalidAgeException {
        return new UndergroundDriver(name,age, DriverLicence.Underground_Train_Driver_profesional);
    }

    public static UndergroundDriver createMasterUndergroundDriver(String name, int age) throws TrainDriverInvalidAgeException {
        return new UndergroundDriver(name,age, DriverLicence.Underground_Train_Driver_master);
    }
}
