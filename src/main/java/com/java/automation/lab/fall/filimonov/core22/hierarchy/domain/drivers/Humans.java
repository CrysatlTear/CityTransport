package com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.enums.DriverLicence;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.intefaces.DriverActions;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.base.AbstractModel;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
@XmlRootElement(name = "baseUIComponent")
@XmlType(propOrder = { "name", "age", "licence" })

public abstract class Humans extends AbstractModel implements DriverActions, Serializable {
    private DriverLicence licence;
    private int age;
    private String name;
    private int counter = 0;

    public Humans(){

    }

    public Humans(String name, int age, DriverLicence licence) {
        this.name = name;
        this.age = age;
        this.licence = licence;
        counter++;
    }

    @Override
    public int hashCode() {
        return (getName() + getAge() + counter).hashCode();
    }

    @Override
    public String toString() {
        return "Bus driver {\n\tName: " + getName()  + "\n\tAge: " +getAge() +"\n    }";
    }

    @Override
    public boolean equals(Object that){
        if (that == null) {
            return false;
        }
        if (this.getClass() != that.getClass()) {
            return false;
        }
        if (this == that) {
            return true;
        }
        else return false;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DriverLicence getLicence() {
        return licence;
    }

    public void setLicence(DriverLicence licence) {
        this.licence = licence;
    }
}
