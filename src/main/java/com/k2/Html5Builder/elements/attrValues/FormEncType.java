package com.k2.Html5Builder.elements.attrValues;

public enum FormEncType {
	APPLICATION("application/x-www-form-urlencoded"),
	MULTIPART("multipart/form-data"),
	TEXT("text/plain");
	
	String value;
	FormEncType(String value) { this.value = value; }
	public String getValue() { return value; }

}
