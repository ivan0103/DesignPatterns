package com.company;

public abstract class Dialog {

    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
