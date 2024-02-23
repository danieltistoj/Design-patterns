package org.example.Interface;

import org.example.Interface.Button;
import org.example.Interface.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
