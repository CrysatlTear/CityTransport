package com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions;

public class TrainDriverInvalidAgeException extends Exception {
    public TrainDriverInvalidAgeException(String message, int num) {
        super(message + num);
    }
}
