package com.k2.Html5Builder.elements.attrValues;

public enum HttpEquiv {
	CONTENT_TYPE("content-type"),
	DEFAULT_STYLE("default-style"),
	REFRESH("refresh");
	
	String value;
	HttpEquiv(String value) { this.value = value; }
	public String getValue() { return value; }

}
