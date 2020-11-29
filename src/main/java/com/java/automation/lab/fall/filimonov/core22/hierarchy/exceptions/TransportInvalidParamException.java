package com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions;

public class TransportInvalidParamException extends Exception {
    public TransportInvalidParamException(String message, String modelName) {
        super(message + modelName);
    }
}
