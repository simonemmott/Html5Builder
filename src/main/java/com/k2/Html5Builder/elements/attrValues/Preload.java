package com.k2.Html5Builder.elements.attrValues;

/**
 * This enumeration defines the possible values for the preload attribute of 'audio' and 'video' tags
 * 
 * @author simon
 *
 */
public enum Preload {
	AUTO("auto"),
	METADATA("metadata"),
	NONE("none");
	
	String value;
	Preload(String value) { this.value = value; }
	/**
	 * Get the text value for this enumeration
	 * @return	The text value of this enumeration
	 */
	public String getValue() { return value; }

}
