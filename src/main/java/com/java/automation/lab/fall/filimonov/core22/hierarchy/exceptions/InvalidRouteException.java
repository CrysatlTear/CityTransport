package com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions;

public class InvalidRouteException extends Exception {
    public InvalidRouteException(String message, String modelName) {
        super(message + modelName);
    }
}
