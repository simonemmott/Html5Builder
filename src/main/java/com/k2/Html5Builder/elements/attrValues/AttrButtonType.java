package com.k2.Html5Builder.elements.attrValues;

public enum AttrButtonType {
	BUTTON("button"),
	RESET("reset"),
	SUBMIT("submit");
	
	String value;
	AttrButtonType(String value) { this.value = value; }
	public String getValue() { return value; }

}
