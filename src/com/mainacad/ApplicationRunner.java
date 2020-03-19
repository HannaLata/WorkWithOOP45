package com.mainacad;

import com.mainacad.circle.Circle;
import com.mainacad.rectangle.Rectangle;
import com.mainacad.square.Square;
import com.mainacad.trapezoid.Trapezoid;
import com.mainacad.triangle.Triangle;

public class ApplicationRunner {

    public static void main(String[] args) {

        Square square = new Square();
        square.setSide(10.0);

        System.out.println("Square with side " + square.getSide() + " has area " + square.getArea());

        Circle circle = new Circle();
        circle.setRadius(10.0);

        System.out.println("Circle with radius " + circle.getRadius() + " has area " + circle.getArea());

        Triangle triangle = new Triangle();
        triangle.setBase(10.0);
        triangle.setHeight(12.0);

        System.out.println("Triangle with base " + triangle.getBase() + " and height " + triangle.getHeight() +
                " has area " + triangle.getArea());

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10.0);
        rectangle.setWidth(12.0);

        System.out.println("Rectangle with length " + rectangle.getLength() + " and width " + rectangle.getWidth() +
                " has area " + rectangle.getArea());

        Trapezoid trapezoid = new Trapezoid();
        trapezoid.setSide1(10.0);
        trapezoid.setSide2(12.0);
        trapezoid.setHeight(15.0);

        System.out.println("Trapezoid with first side " + trapezoid.getSide1() + ", second side " +
                trapezoid.getSide2() + " and height " + trapezoid.getHeight() + " has area " + trapezoid.getArea());

    }

}

