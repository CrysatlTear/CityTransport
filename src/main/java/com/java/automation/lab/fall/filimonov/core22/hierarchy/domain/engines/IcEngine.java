package com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.enums.Fuel;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlRootElement(name = "IcEngine")
@XmlType(propOrder = { "id", "tickpm", "fuel", "modelName", "modelName", "capacity"})

public class IcEngine extends Engine implements Serializable {
    private int capacity;

    public IcEngine(){}

    public IcEngine(int rpm, int tickpm, Fuel fuel, String modelName, int capacity) throws EngineInvalidRpmException {
        super(rpm, tickpm, fuel, modelName);
        this.capacity = capacity;
        if(rpm > 10000){
            throw new EngineInvalidRpmException("Engine is not safe, RPM is to high : ", this.getRpm());
        }
        else if(rpm < 2000){
            throw new EngineInvalidRpmException("Engine is have low RPM: ", this.getRpm());
        }
    }

    @Override
    public int hashCode() {
        return (getModelName() + getTickpm()).hashCode();
    }

    @Override
    public String toString() {
        return "Engine {\n\tName: " + getModelName() + "\n\tCharge: " + getCapacity() + "\n\tRPM: " +getRpm() +"\n    }";
    }

    @Override
    public boolean equals(Object other){
        if (this == other) {return  true;}
        if (other == null || other.getClass() != getClass()) {return false;}
        IcEngine that = (IcEngine) other;
        return this.getModelName() == that.getModelName() &&
                this.getCapacity() == that.getCapacity() && this.getRpm() == that.getRpm() &&
                this.getTickpm() == that.getTickpm() && this.getFuel() == that.getFuel();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
