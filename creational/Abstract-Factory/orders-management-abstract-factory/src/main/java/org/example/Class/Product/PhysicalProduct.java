package org.example.Class.Product;

import org.example.Interface.Product;

public class PhysicalProduct implements Product {
    @Override
    public void ship() {
        System.out.println("The product has been collected and is ready to be delivered to the physical store.");
    }
}
