package com.k2.Html5Builder.elements.attrValues;

public enum Dir {
	LTR("ltr"),
	RTL("rtl");
	
	String value;
	Dir(String value) { this.value = value; }
	public String getValue() { return value; }

}
