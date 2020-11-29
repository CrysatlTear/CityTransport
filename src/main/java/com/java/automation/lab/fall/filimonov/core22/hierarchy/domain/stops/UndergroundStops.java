package com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.stops;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.coordinate.Point;

public class UndergroundStops extends PubStops {
    private String name;
    public UndergroundStops(String name, Point coordinates2D) {
        super(coordinates2D);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return number + getName().hashCode() * stopNumber;
    }

    @Override
    public String toString(){
        return "UngeroundStop : " + getName() + " coordinates : " + getCoordinates().toString();
    }

    @Override
    public boolean equals(Object other){
        if (this == other) {return  true;}
        if (other == null || other.getClass() != getClass()) {return false;}
        UndergroundStops that = (UndergroundStops) other;
        return this.getCoordinates2D() == that.getCoordinates2D() &&
                this.getName() == that.getName();
    }
}
