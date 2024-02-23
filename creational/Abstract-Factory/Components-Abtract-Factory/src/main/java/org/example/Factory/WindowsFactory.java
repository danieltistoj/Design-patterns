package org.example.Factory;

import org.example.Class.Button.WindowsButton;
import org.example.Class.Checkbox.WindowsCheckbox;
import org.example.Interface.Button;
import org.example.Interface.Checkbox;
import org.example.Interface.GUIFactory;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
