package com.company.factories;

import com.company.buttons.Button;
import com.company.buttons.MacOSButton;
import com.company.checkboxes.Checkbox;
import com.company.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
