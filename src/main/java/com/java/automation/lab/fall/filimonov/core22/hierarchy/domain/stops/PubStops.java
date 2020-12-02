package com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.stops;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.base.AbstractModel;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.coordinate.Point;

public abstract class PubStops extends AbstractModel {
   private Point coordinates;
   private String name;
   public static int number = 0;
   public static int stopNumber = 1;


    public PubStops(Point coordinates2D) {
        this.coordinates = coordinates2D;
        number++;
        stopNumber++;
    }

    public Point getCoordinates2D() {
        return coordinates;
    }

    public void setCoordinates2D(Point coordinates2D) {
        this.coordinates = coordinates2D;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
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
        return "GroundStop : " + getName() + " coordinates : " + getCoordinates().toString();
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
}
