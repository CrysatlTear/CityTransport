package com.java.automation.lab.fall.filimonov.core22.hierarchy.enums;

public enum Axis {
    X("Horizontal", "abs"),
    Y("Vertical", "abs");

    private String descritpion;
    private String axis;

    Axis(String descritpion, String axis) {
        this.descritpion = descritpion;
        this.axis = axis;
    }

    public String getDescritpion() {
        return descritpion;
    }

    public String axis(){
        return axis;
    }
}
