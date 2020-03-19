package com.mainacad;

import com.mainacad.abs.Shape;
import com.mainacad.circle.Circle;
import com.mainacad.rectangle.Rectangle;
import com.mainacad.square.Square;
import com.mainacad.trapezoid.Trapezoid;
import com.mainacad.triangle.Triangle;

public class ApplicationRunner {

    public static void main(String[] args) {

        Square square = new Square();
        square.setSide(10.0);
        square.setName("Square");

        System.out.println(square.getName() + " with side " + square.getSide() + " has area " + square.getArea());

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

        Shape maxShape;

        if ( circle.getArea() > square.getArea() ) {

            maxShape = circle;
        } else {
            maxShape = square;
        }
        if ( trapezoid.getArea() > maxShape.getArea() ) {

            maxShape = trapezoid;
        }
        if ( triangle.getArea() > maxShape.getArea() ) {

            maxShape = triangle;
        }
        if ( rectangle.getArea() > maxShape.getArea() ) {

            maxShape = rectangle;
        }

        System.out.println("Max shape is " + maxShape.getClass().getSimpleName() + " and has area " + maxShape.getArea());

        Shape minShape;

        if ( square.getArea() < circle.getArea() ) {

            minShape = square;
        } else {

            minShape = circle;
        }
        if ( rectangle.getArea() < minShape.getArea() ) {

            minShape = rectangle;
        }

        if ( triangle.getArea() < minShape.getArea() ) {

            minShape = triangle;
        }

        if ( trapezoid.getArea() < minShape.getArea() ) {

            minShape = trapezoid;
        }

        System.out.println("Min shape is " + minShape.getClass().getSimpleName() + " and has area " + minShape.getArea());
        

    }

}

