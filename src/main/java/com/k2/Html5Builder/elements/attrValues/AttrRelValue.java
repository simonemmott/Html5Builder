package com.k2.Html5Builder.elements.attrValues;

public enum AttrRelValue {
	ALTERNATE("alternate"),
	AUTHOR("author"),
	BOOKMARK("bookmark"),
	EXTERNAL("external"),
	HELP("help"),
	LICENSE("license"),
	NEXT("next"),
	NO_FOLLOW("nofollow"),
	NO_REFERRER("noreferrer"),
	NO_OPENER("noopener"),
	PREV("prev"),
	SEARCH("search"),
	TAG("tag");
	
	String value;
	AttrRelValue(String value) { this.value = value; }
	public String getValue() { return value; }

}
