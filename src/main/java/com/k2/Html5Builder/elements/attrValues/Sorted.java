package com.k2.Html5Builder.elements.attrValues;

public enum Sorted {
	REVERSED("reversed"),
	NUMBER("number"),
	REVERSED_NUMBER("reversed number"),
	NUMBER_REVERSED("number reversed");
	
	String value;
	Sorted(String value) { this.value = value; }
	public String getValue() { return value; }

}
