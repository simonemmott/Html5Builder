package com.k2.Html5Builder.elements.attrValues;

/**
 * This enumeration defines possible values for the crossOrigin attribute of 'img' and 'link' elements
 * 
 * @author simon
 *
 */
public enum CrossOrigin {
	ANONYMOUS("anonymous"),
	USE_CREDENTIALS("use-credentials");
	
	String value;
	CrossOrigin(String value) { this.value = value; }
	/**
	 * Get the text value for this enumeration
	 * @return	The text value of this enumeration
	 */
	public String getValue() { return value; }

}
