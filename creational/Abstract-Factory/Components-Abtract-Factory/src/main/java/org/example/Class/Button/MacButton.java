package org.example.Class.Button;

import org.example.Interface.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Mac button");
    }
}
