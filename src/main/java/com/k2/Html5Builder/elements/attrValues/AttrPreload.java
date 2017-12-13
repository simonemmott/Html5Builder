package com.k2.Html5Builder.elements.attrValues;

public enum AttrPreload {
	AUTO("auto"),
	METADATA("metadata"),
	NONE("none");
	
	String value;
	AttrPreload(String value) { this.value = value; }
	public String getValue() { return value; }

}
