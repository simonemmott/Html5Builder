package com.k2.Html5Builder.elements.attrValues;

public enum Accept {
	AUDIO("audio/*"),
	VIDEO("video/*"),
	IMAGE("image/*");
	
	String value;
	Accept(String value) { this.value = value; }
	public String getValue() { return value; }

}
