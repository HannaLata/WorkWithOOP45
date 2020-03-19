package com.mainacad.triangle;

public class Triangle {

    public double base;
    public double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {

        return (base*height)/2;
    }
}
