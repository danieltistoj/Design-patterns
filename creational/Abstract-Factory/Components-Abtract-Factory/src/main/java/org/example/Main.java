package org.example;

import org.example.Factory.MacFactory;
import org.example.Factory.WindowsFactory;
import org.example.Interface.Button;
import org.example.Interface.Checkbox;
import org.example.Interface.GUIFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        String os = "Windows";

        if (os.equals("Windows")) {
            factory = new WindowsFactory();
        }else {
            factory = new MacFactory();
        }

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
    }
}