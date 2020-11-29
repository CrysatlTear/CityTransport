package com.java.automation.lab.fall.filimonov.core22.hierarchy.factory;

public class Factory<T> {
    private final Class<T> type;

    public Factory(Class<T> type) {
        this.type = type;
    }

    public T getInstance() {
        try {
            return type.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
