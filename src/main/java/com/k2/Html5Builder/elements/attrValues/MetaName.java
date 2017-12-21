package com.k2.Html5Builder.elements.attrValues;

/**
 * This enumeration defines the possible values for the name attribute of 'meta' elements
 * 
 * @author simon
 *
 */
public enum MetaName {
	APPLICATION_NAME("application-name"),
	AUTHOR("author"),
	DESCRIPTION("description"),
	GENERATOR("generator"),
	KEYWORDS("keywords"),
	VIEWPORT("viewport");
	
	String value;
	MetaName(String value) { this.value = value; }
	/**
	 * Get the text value for this enumeration
	 * @return	The text value of this enumeration
	 */
	public String getValue() { return value; }

}
