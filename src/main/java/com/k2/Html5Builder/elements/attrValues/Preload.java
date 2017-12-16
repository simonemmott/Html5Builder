package com.k2.Html5Builder.elements.attrValues;

public enum Preload {
	AUTO("auto"),
	METADATA("metadata"),
	NONE("none");
	
	String value;
	Preload(String value) { this.value = value; }
	public String getValue() { return value; }

}
