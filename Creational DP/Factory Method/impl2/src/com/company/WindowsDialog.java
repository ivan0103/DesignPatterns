package com.company;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WIndowsButton();
    }
}
