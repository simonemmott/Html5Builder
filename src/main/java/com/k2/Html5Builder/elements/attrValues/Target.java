package com.k2.Html5Builder.elements.attrValues;

/**
 * This enumeration defines the possible value for the target attribute of 'a', 'area', 'base', 'button', 'form' and 'input' elements
 * 
 * @author simon
 *
 */
public enum Target {
	BLANK("_blank"),
	PARENT("_parent"),
	SELF("_self"),
	TOP("_top");
	
	String value;
	Target(String value) { this.value = value; }
	/**
	 * Get the text value for this enumeration
	 * @return	The text value of this enumeration
	 */
	public String getValue() { return value; }

}
