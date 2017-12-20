package com.k2.Html5Builder.elements.attrValues;

public enum Kind {
	CAPTIONS("captions"),
	CHAPTERS("chapters"),
	DESCRIPTIONS("descriptions"),
	METADATA("metadata"),
	SUBTITLES("subtiles");
	
	String value;
	Kind(String value) { this.value = value; }
	public String getValue() { return value; }

}
