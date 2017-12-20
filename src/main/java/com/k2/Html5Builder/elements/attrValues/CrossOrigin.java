package com.k2.Html5Builder.elements.attrValues;

public enum CrossOrigin {
	ANONYMOUS("anonymous"),
	USE_CREDENTIALS("use-credentials");
	
	String value;
	CrossOrigin(String value) { this.value = value; }
	public String getValue() { return value; }

}
