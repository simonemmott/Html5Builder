package com.k2.Html5Builder.elements.attrValues;

public enum AttrFormMethod {
	GET("get"),
	POST("post");
	
	String value;
	AttrFormMethod(String value) { this.value = value; }
	public String getValue() { return value; }

}
