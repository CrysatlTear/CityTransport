package com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.enums.Fuel;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.EngineInvalidRpmException;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlRootElement(name = "IcEngine")
@XmlType(propOrder = { "id", "tickpm", "fuel", "modelName", "modelName", "tractionForce", "charge"})

public class ElectricEngine extends Engine implements Serializable {

    private int tractionForce;
    private int charge;

    public ElectricEngine(){}

    public ElectricEngine(int id, int rpm, int tickpm, Fuel fuel, String modelName, int tractionForce, int charge) throws EngineInvalidRpmException {
        super(id, rpm, tickpm, fuel, modelName);
        this.tractionForce = tractionForce;
        this.charge = charge;
        if(rpm > 12000){
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
        return "Engine {\n\tName: " + getModelName() + "\n\tCharge: " + getCharge() + "\n\tRPM: " +getRpm() +"\n    }";
    }

    @Override
    public boolean equals(Object other){
        if (this == other) {return  true;}
        if (other == null || other.getClass() != getClass()) {return false;}
        ElectricEngine that = (ElectricEngine) other;
        return this.getModelName() == that.getModelName() &&
                this.getCharge() == that.getCharge() && this.getRpm() == that.getRpm() &&
                this.getTickpm() == that.getTickpm() && this.getFuel() == that.getFuel();
    }

    public int getTractionForce() {
        return tractionForce;
    }

    public void setTractionForce(int tractionForce) {
        this.tractionForce = tractionForce;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }
}
