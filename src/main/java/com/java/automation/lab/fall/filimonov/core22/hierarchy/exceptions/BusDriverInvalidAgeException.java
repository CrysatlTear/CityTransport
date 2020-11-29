package com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions;

public class BusDriverInvalidAgeException extends Exception{
    public BusDriverInvalidAgeException(String message, int num){
        super(message + num);
    }
}
