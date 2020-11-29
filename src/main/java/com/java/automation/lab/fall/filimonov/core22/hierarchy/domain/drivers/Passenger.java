package com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers;

import java.io.Serializable;

public class Passenger implements Serializable {
    private static int count = 0;
    private int id = 0;

    public Passenger() {
        id = count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Passenger.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "Passenger : " + getId();
    }

    @Override
    public boolean equals(Object other){
        if (this == other) {return  true;}
        if (other == null || other.getClass() != getClass()) {return false;}
        Passenger that = (Passenger) other;
        return  this.getId() == that.getId();
    }
}
