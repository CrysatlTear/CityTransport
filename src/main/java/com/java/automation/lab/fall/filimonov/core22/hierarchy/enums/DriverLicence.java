package com.java.automation.lab.fall.filimonov.core22.hierarchy.enums;

public enum DriverLicence {
    Bus_Driver_Licence("Basic bus driver licence"),
    Bus_Driver_Licence_profesional("Professional bus driver licence"),
    Bus_Driver_Licence_master("Master bus driver licence"),
    Monorail_Train_Driver("Basic monorail train driver licence"),
    Monorail_Train_Driver_profesional("Professional monorail train driver licence"),
    Monorail_Train_Driver_master("Master monorail train driver licence"),
    Tram_Driver_Licence("Basic tram driver licence"),
    Tram_Driver_profesional("Professional tram driver licence"),
    Tram_Driver_master("Master tram driver licence"),
    TrolleyBus_Driver_Licence("Basic trolleybus driver licence"),
    TrolleyBus_Driver_profesional("Professional trolleybus driver licence"),
    TrolleyBus_Driver_master("Master trolleybus driver licence"),
    Underground_Train_Driver("Basic underground train driver licence"),
    Underground_Train_Driver_profesional("Professional underground train driver licence"),
    Underground_Train_Driver_master("Master underground train driver licence");

    DriverLicence(String descritpion) {
        this.descritpion = descritpion;
    }

    private String descritpion;

    public String getDescritpion() {
        return descritpion;
    }
}
