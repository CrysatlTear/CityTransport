package com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.coordinate;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.enums.Axis;

import java.io.Serializable;

public class Point implements Serializable {
    private int x;
    private int y;
    private int counter = 0;

    public Point() {
        this(0, 0);
    }

    public Point(int value, Axis axis) {
        if (axis.equals(Axis.X)) {
            this.x = value;
        } else {
            this.y = value;
        }
        counter++;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        counter++;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = (int) x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = (int) y;
    }

    @Override
    public String toString() {
        return "Coordinate2D {\n\tx: " + x + "\n\ty: " + y + "\n}";
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
        return x == ((Point) that).x && y == ((Point) that).getY();
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
