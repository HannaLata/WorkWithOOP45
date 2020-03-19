package com.mainacad.trapezoid;

import com.mainacad.abs.AbstractShape;

public class Trapezoid extends AbstractShape {

    private double side1;
    private double side2;
    private double height;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {

        return ((side1*side2)/2)*height;
    }
}
