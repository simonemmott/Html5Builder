package com.k2.Html5Builder.elements.attrValues;

/**
 * This enumeration defines the possible values for the autoComplete attribute of 'input' elements
 * 
 * @author simon
 *
 */
public enum OnOff {
	ON("on"),
	OFF("off");
	
	String value;
	OnOff(String value) { this.value = value; }
	/**
	 * Get the text value for this enumeration
	 * @return	The text value of this enumeration
	 */
	public String getValue() { return value; }

}
