package com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.enums.Fuel;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.base.AbstractModel;

import java.io.Serializable;

public abstract class Engine extends AbstractModel implements Serializable {
    private int rpm;
    private int tickpm;
    private Fuel fuel;
    private String modelName;

    public Engine(){}

    public Engine(int rpm, int tickpm, Fuel fuel, String modelName) {
        this.rpm = rpm;
        this.tickpm = tickpm;
        this.fuel = fuel;
        this.modelName = modelName;
    }

    @Override
    public int hashCode() {
        return (getModelName() + getTickpm()).hashCode();
    }

    @Override
    public String toString() {
        return "Engine {\n\tName: " + getModelName() + "\n\tFuel: " +getFuel()+ "\n\tRPM: " +getRpm() +"\n    }";
    }

    @Override
    public boolean equals(Object other){
        if (this == other) {return  true;}
        if (other == null || other.getClass() != getClass()) {return false;}
        Engine that = (Engine) other;
        return this.getModelName() == that.getModelName() && this.getRpm() == that.getRpm() &&
                this.getTickpm() == that.getTickpm() && this.getFuel() == that.getFuel();
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int getTickpm() {
        return tickpm;
    }

    public void setTickpm(int tickpm) {
        this.tickpm = tickpm;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
