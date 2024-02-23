package org.example.Factory;

import org.example.Class.Rectangle;
import org.example.Interface.Shape;

public class RectangleFactory extends ShapeFactory{
    @Override
   public Shape createShape() {
        return new Rectangle();
    }
}
