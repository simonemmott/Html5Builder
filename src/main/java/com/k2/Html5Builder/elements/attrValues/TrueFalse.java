package com.k2.Html5Builder.elements.attrValues;

/**
 * This enumeration defines the possible values for boolean attributes
 * 
 * @author simon
 *
 */
public enum TrueFalse {
	TRUE("true"),
	FALSE("false");
	
	String value;
	TrueFalse(String value) { this.value = value; }
	/**
	 * Get the text value for this enumeration
	 * @return	The text value of this enumeration
	 */
	public String getValue() { return value; }

}
