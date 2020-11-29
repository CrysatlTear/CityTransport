package com.java.automation.lab.fall.filimonov.core22.hierarchy.factory.driverFact;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.enums.DriverLicence;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.TrolleyBusDriver;

public class TrolleyBusFactory {
    public static TrolleyBusDriver createDefaultTrolleyBusDriver(String name, int age) throws BusDriverInvalidAgeException {
        return new TrolleyBusDriver(name,age, DriverLicence.TrolleyBus_Driver_Licence);
    }

    public static TrolleyBusDriver createProfesionalTrolleyBusDriver(String name, int age) throws BusDriverInvalidAgeException {
        return new TrolleyBusDriver(name,age, DriverLicence.TrolleyBus_Driver_profesional);
    }

    public static TrolleyBusDriver createMasterTrolleyBusDriver(String name, int age) throws BusDriverInvalidAgeException {
        return new TrolleyBusDriver(name,age, DriverLicence.TrolleyBus_Driver_master);
    }
}
