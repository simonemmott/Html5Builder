package com.k2.Html5Builder.elements.attrValues;

public enum Shape {
	DEFAULT("default"),
	RECTANGLE("rect"),
	CIRCLE("circle"),
	POLYGON("poly");
	
	String value;
	Shape(String value) { this.value = value; }
	public String getValue() { return value; }

}
