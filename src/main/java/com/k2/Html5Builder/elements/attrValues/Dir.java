package com.k2.Html5Builder.elements.attrValues;

/**
 * This enumeration defined the possible values for the dir attribute on 'bdo' elements
 * 
 * @author simon
 *
 */
public enum Dir {
	LTR("ltr"),
	RTL("rtl");
	
	String value;
	Dir(String value) { this.value = value; }
	/**
	 * Get the text value for this enumeration
	 * @return	The text value of this enumeration
	 */
	public String getValue() { return value; }

}
