package com.k2.Html5Builder.elements.attrValues;

/**
 * This enumeration defines the possible value for the kind attribute of 'track' elements
 * @author simon
 *
 */
public enum Kind {
	CAPTIONS("captions"),
	CHAPTERS("chapters"),
	DESCRIPTIONS("descriptions"),
	METADATA("metadata"),
	SUBTITLES("subtiles");
	
	String value;
	Kind(String value) { this.value = value; }
	/**
	 * Get the text value for this enumeration
	 * @return	The text value of this enumeration
	 */
	public String getValue() { return value; }

}
