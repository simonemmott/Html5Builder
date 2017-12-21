package com.k2.Html5Builder.elements.attrValues;

/**
 * This enumeration defines the possible values for the type attribute of 'button' elements
 * 
 * @author simon
 *
 */
public enum ButtonType {
	BUTTON("button"),
	RESET("reset"),
	SUBMIT("submit");
	
	String value;
	ButtonType(String value) { this.value = value; }
	/**
	 * Get the text value for this enumeration
	 * @return	The text value of this enumeration
	 */
	public String getValue() { return value; }

}
