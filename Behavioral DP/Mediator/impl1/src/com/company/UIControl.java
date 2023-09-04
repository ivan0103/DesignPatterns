package com.company;

//Abstract colleague
public interface UIControl {
	
	void controlChanged(UIControl control);
	
	String getControlValue();
	
	String getControlName();
}
