package org.example;

import org.example.Factory.CircleFactory;
import org.example.Factory.RectangleFactory;
import org.example.Factory.ShapeFactory;
import org.example.Interface.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();

        ShapeFactory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.createShape();
        rectangle.draw();
    }
}