package com.k2.Html5Builder.elements.attrValues;

public enum ButtonType {
	BUTTON("button"),
	RESET("reset"),
	SUBMIT("submit");
	
	String value;
	ButtonType(String value) { this.value = value; }
	public String getValue() { return value; }

}
