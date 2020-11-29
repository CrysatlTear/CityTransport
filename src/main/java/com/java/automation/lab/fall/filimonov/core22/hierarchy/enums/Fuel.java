package com.java.automation.lab.fall.filimonov.core22.hierarchy.enums;

public enum  Fuel {
    Petrol("Fuel for IC Engines"),
    Electric("Fuel for electrical engine");

    private String descritpion;

    Fuel(String descritpion) {
        this.descritpion = descritpion;
    }

    public String getDescritpion() {
        return descritpion;
    }
}
