package com.k2.Html5Builder.elements.attrValues;

public enum OlType {
	NUMERIC("1"),
	UPPER_CHAR("A"),
	LOWER_CHAR("a"),
	UPPER_ROMAN("I"),
	LOWER_ROMAN("i");
	
	String value;
	OlType(String value) { this.value = value; }
	public String getValue() { return value; }

}
