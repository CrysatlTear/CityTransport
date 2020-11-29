package com.java.automation.lab.fall.filimonov.core22.hierarchy.factory.driverFact;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.enums.DriverLicence;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.TramDriver;

public class TramDriverFactory {
    public static TramDriver createDefaultTramDriver(String name, int age) throws BusDriverInvalidAgeException {
        return new TramDriver(name,age, DriverLicence.Tram_Driver_Licence);
    }

    public static TramDriver createProfesionalTramDriver(String name, int age) throws BusDriverInvalidAgeException {
        return new TramDriver(name,age, DriverLicence.Tram_Driver_profesional);
    }

    public static TramDriver createMasterTramDriver(String name, int age) throws BusDriverInvalidAgeException {
        return new TramDriver(name,age, DriverLicence.Tram_Driver_master);
    }
}
