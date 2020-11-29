package com.java.automation.lab.fall.filimonov.core22.hierarchy.factory.driverFact;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.enums.DriverLicence;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.MonorailTrainDriver;

public class MonorailDriverFactory {
    public static MonorailTrainDriver createDefaultMonorailDriver(String name, int age) throws TrainDriverInvalidAgeException {
        return new MonorailTrainDriver(name,age, DriverLicence.Monorail_Train_Driver);
    }

    public static MonorailTrainDriver createProfesionalMonorailDriver(String name, int age) throws TrainDriverInvalidAgeException {
        return new MonorailTrainDriver(name,age, DriverLicence.Monorail_Train_Driver_profesional);
    }

    public static MonorailTrainDriver createMasterMonorailDriver(String name, int age) throws TrainDriverInvalidAgeException {
        return new MonorailTrainDriver(name,age, DriverLicence.Monorail_Train_Driver_master);
    }
}
