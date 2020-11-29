package com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions;

public class EngineInvalidRpmException extends Exception {
    public EngineInvalidRpmException(String message, int rpm) {
        super(message + rpm);
    }
}
