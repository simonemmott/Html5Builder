package com.k2.Html5Builder.elements.attrValues;

public enum MetaName {
	APPLICATION_NAME("application-name"),
	AUTHOR("author"),
	DESCRIPTION("description"),
	GENERATOR("generator"),
	KEYWORDS("keywords"),
	VIEWPORT("viewport");
	
	String value;
	MetaName(String value) { this.value = value; }
	public String getValue() { return value; }

}
