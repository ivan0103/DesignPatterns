package com.company;

import javafx.scene.control.TextField;

import javax.swing.event.ChangeListener;

public class TextBox extends TextField implements UIControl{
	private UIMediator mediator;
	private boolean mediatedUpdate;
	public TextBox(UIMediator mediator) {
		this.setText("Textbox");
		this.mediator = mediator;
		this.mediator.register(this);
		this.textProperty().addListener((v, o, n) -> {
			if (!mediatedUpdate){
				this.mediator.valueChanges(this);
			}
		});
	}

	@Override
	public void controlChanged(UIControl control) {
		this.mediatedUpdate = true;
		this.setText(control.getControlValue());
		this.mediatedUpdate = false;
	}

	@Override
	public String getControlValue() {
		return getText();
	}

	@Override
	public String getControlName() {
		return "Textbox";
	}
}
