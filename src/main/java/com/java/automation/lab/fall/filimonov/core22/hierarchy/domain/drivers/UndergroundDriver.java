package com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.enums.DriverLicence;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.exceptions.TrainDriverInvalidAgeException;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlRootElement(name = "UndergroundDriver")
@XmlType(propOrder = { "name", "age", "licence" })

public class UndergroundDriver extends Humans implements Comparable<UndergroundDriver>, Serializable {

    public UndergroundDriver(){}

    public UndergroundDriver(String name, int age, DriverLicence licence) throws TrainDriverInvalidAgeException {
        super(name, age, licence);
        if(age > 50 || age < 20){
            throw new TrainDriverInvalidAgeException("Underground train driver with such age can't drive a train: ",age);
        }
    }

    @Override
    public void showInfo(){
        System.out.println("Underground train driver : " + getName() + " age " + getAge());
    }

    @Override
    public void showDriverLicence(){
        System.out.println("Driver " + getName() + " licence : " + getLicence());
    }

    @Override
    public int hashCode() {
        return (getName() + getAge()).hashCode();
    }

    @Override
    public String toString() {
        return "Train driver {\n\tName: " + getName() + "\n\tLicence: " + getLicence() + "\n\tAge: " +getAge() +"\n    }";
    }

    @Override
    public boolean equals(Object other){
        if (this == other) {return  true;}
        if (other == null || other.getClass() != getClass()) {return false;}
        UndergroundDriver that = (UndergroundDriver) other;
        return this.getAge() == that.getAge() && this.getLicence() == that.getLicence() &&
                this.getName() == that.getName();
    }

    @Override
    public int compareTo(UndergroundDriver o) {
        return this.getAge() - o.getAge();
    }
}
