package com.k2.Html5Builder.elements.attrValues;

/**
 * This enumeration defined the possible values for the rel attribute on 'a' elements
 * 
 * @author simon
 *
 */
public enum ARel {
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
	ARel(String value) { this.value = value; }
	/**
	 * Get the text value for this enumeration
	 * @return	The text value of this enumeration
	 */
	public String getValue() { return value; }

}
