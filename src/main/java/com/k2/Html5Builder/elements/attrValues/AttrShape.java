package com.k2.Html5Builder.elements.attrValues;

public enum AttrShape {
	DEFAULT("default"),
	RECTANGLE("rect"),
	CIRCLE("circle"),
	POLYGON("poly");
	
	String value;
	AttrShape(String value) { this.value = value; }
	public String getValue() { return value; }

}
