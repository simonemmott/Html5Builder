package com.k2.Html5Builder.elements.attrValues;

public enum AttrDir {
	LTR("ltr"),
	RTL("rtl");
	
	String value;
	AttrDir(String value) { this.value = value; }
	public String getValue() { return value; }

}
