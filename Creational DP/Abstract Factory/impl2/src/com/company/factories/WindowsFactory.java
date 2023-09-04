package com.company.factories;

import com.company.buttons.Button;
import com.company.buttons.WindowsButton;
import com.company.checkboxes.Checkbox;
import com.company.checkboxes.WindowsCheckBox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckBox();
    }
}
