package com.k2.Html5Builder.elements.attrValues;

public enum Target {
	BLANK("_blank"),
	PARENT("_parent"),
	SELF("_self"),
	TOP("_top");
	
	String value;
	Target(String value) { this.value = value; }
	public String getValue() { return value; }

}
