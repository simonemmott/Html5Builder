package com.k2.Html5Builder.elements.attrValues;

/**
 * This enumeration defines the possible values for the wrap attribute of 'textarea' elements
 * 
 * @author simon
 *
 */
public enum Wrap {
	HARD("hard"),
	SOFT("soft");
	
	String value;
	Wrap(String value) { this.value = value; }
	/**
	 * Get the text value for this enumeration
	 * @return	The text value of this enumeration
	 */
	public String getValue() { return value; }

}
