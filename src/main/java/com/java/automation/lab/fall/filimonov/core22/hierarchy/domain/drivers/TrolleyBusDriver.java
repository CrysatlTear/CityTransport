package com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.enums.DriverLicence;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.BusDriverInvalidAgeException;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlRootElement(name = "TrolleyBusDriver")
@XmlType(propOrder = { "name", "age", "licence" })

public class TrolleyBusDriver extends Humans implements Comparable<TrolleyBusDriver>, Serializable {

    public TrolleyBusDriver(){}

    public TrolleyBusDriver(String name, int age, DriverLicence licence) throws BusDriverInvalidAgeException {
        super(name, age, licence);
        if(age > 60 || age < 18){
            throw new BusDriverInvalidAgeException("Trolleybus driver with such age can't drive :",age);
        }
    }

    @Override
    public void showInfo(){
        System.out.println("TrolleyBus driver : " + getName() + " age " + getAge());
    }

    @Override
    public void showDriverLicence() {
        System.out.println("Driver " + getName() + " licence : " + getLicence());
    }

    @Override
    public int hashCode() {
        return (getName() + getAge()).hashCode();
    }

    @Override
    public String toString() {
        return "TrolleyBus driver {\n\tName: " + getName() + "\n\tLicence: " + getLicence() + "\n\tAge: " +getAge() +"\n    }";
    }

    @Override
    public boolean equals(Object other){
        if (this == other) {return  true;}
        if (other == null || other.getClass() != getClass()) {return false;}
        TrolleyBusDriver that = (TrolleyBusDriver) other;
        return this.getAge() == that.getAge() && this.getLicence() == that.getLicence() &&
                this.getName() == that.getName();
    }

    @Override
    public int compareTo(TrolleyBusDriver o) {
        return this.getAge() - o.getAge();
    }
}

