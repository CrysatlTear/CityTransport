package com.java.automation.lab.fall.filimonov.core22.hierarchy.enums;

public enum TransportSize {
    Big("Biggest pub transport"),
    Medium("Medium size pub transport"),
    Micro("Smallest types of pub transport");

    private String description;

    TransportSize(String description){this.description = description;}

    public void setDescription(String description) {
        this.description = description;
    }
}
