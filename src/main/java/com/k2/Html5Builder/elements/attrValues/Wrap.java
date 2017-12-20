package com.k2.Html5Builder.elements.attrValues;

public enum Wrap {
	HARD("hard"),
	SOFT("soft");
	
	String value;
	Wrap(String value) { this.value = value; }
	public String getValue() { return value; }

}
