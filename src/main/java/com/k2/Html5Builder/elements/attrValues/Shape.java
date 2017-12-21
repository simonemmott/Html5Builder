package com.k2.Html5Builder.elements.attrValues;

/**
 * This enumeration defines the possible values for the shape attribute of 'area' elements
 * 
 * @author simon
 *
 */
public enum Shape {
	DEFAULT("default"),
	RECTANGLE("rect"),
	CIRCLE("circle"),
	POLYGON("poly");
	
	String value;
	Shape(String value) { this.value = value; }
	/**
	 * Get the text value for this enumeration
	 * @return	The text value of this enumeration
	 */
	public String getValue() { return value; }

}
