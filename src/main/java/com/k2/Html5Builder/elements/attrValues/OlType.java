package com.k2.Html5Builder.elements.attrValues;

/**
 * This enumeration defines the possible values for the type attribute of 'ol' elements
 * 
 * @author simon
 *
 */
public enum OlType {
	NUMERIC("1"),
	UPPER_CHAR("A"),
	LOWER_CHAR("a"),
	UPPER_ROMAN("I"),
	LOWER_ROMAN("i");
	
	String value;
	OlType(String value) { this.value = value; }
	/**
	 * Get the text value for this enumeration
	 * @return	The text value of this enumeration
	 */
	public String getValue() { return value; }

}
