package org.example.Factory;

import org.example.Class.Button.MacButton;
import org.example.Class.Checkbox.MacCheckbox;
import org.example.Interface.Button;
import org.example.Interface.Checkbox;
import org.example.Interface.GUIFactory;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
