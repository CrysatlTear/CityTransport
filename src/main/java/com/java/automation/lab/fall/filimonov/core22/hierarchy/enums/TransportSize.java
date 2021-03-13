package com.java.automation.lab.fall.filimonov.core22.hierarchy.enums;

public enum TransportSize {
    Big("Big"),
    Medium("Medium"),
    Micro("Small");

    private String description;

    TransportSize(String description){this.description = description;}

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
