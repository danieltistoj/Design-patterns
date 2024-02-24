package org.example.Class.Product;

import org.example.Interface.Product;

public class OnlineProduct implements Product {
    @Override
    public void ship() {
        System.out.println("El producto ha sido empacado y enviado al cliente de la tienda en línea.");
    }
}
