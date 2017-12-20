package com.k2.Html5Builder.elements.attrValues;

public enum OnOff {
	ON("on"),
	OFF("off");
	
	String value;
	OnOff(String value) { this.value = value; }
	public String getValue() { return value; }

}
