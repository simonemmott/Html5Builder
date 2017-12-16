package com.k2.Html5Builder.elements.attrValues;

public enum FormMethod {
	GET("get"),
	POST("post");
	
	String value;
	FormMethod(String value) { this.value = value; }
	public String getValue() { return value; }

}
