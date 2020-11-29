package com.java.automation.lab.fall.filimonov.core22.hierarchy.enums;

public enum TransportTypess{
    BUS("Bus"),
    TROLLEYBUS("TrolleyBus"),
    TRAM("Tram"),
    MONORAIL("Monorail Train"),
    UNDERGROUND("UnderGround Train");

    private String description;

    TransportTypess(String description){this.description = description;}

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    }

