package com.k2.Html5Builder.elements.attrValues;

public enum AttrTarget {
	BLANK("_blank"),
	PARENT("_parent"),
	SELF("_self"),
	TOP("_top");
	
	String value;
	AttrTarget(String value) { this.value = value; }
	public String getValue() { return value; }

}
