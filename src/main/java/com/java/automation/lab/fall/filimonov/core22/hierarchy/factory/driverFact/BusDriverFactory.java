package com.java.automation.lab.fall.filimonov.core22.hierarchy.factory.driverFact;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.enums.DriverLicence;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.BusDriver;

public class BusDriverFactory  {
    public static BusDriver createDefaultBusDriver(String name, int age) throws BusDriverInvalidAgeException {
        return new BusDriver(name,age, DriverLicence.Bus_Driver_Licence);
    }

    public static BusDriver createProfesionalBusDriver(String name, int age) throws BusDriverInvalidAgeException {
        return new BusDriver(name,age, DriverLicence.Bus_Driver_Licence_profesional);
    }

    public static BusDriver createMasterBusDriver(String name, int age) throws BusDriverInvalidAgeException {
        return new BusDriver(name,age, DriverLicence.Bus_Driver_Licence_master);
    }
}
