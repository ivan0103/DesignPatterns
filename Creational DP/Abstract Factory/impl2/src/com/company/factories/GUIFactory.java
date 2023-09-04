package com.company.factories;

import com.company.buttons.Button;
import com.company.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
