package org.example.Factory;

import org.example.Class.Circle;
import org.example.Interface.Shape;

public class CircleFactory extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
