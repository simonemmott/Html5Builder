package com.k2.Html5Builder.elements.attrValues;

/**
 * This enumeration defines the possible values for accept attributes on input elements
 * 
 * @author simon
 *
 */
public enum Accept {
	/**
	 * Accept audio files
	 */
	AUDIO("audio/*"),
	/**
	 * Accept video files
	 */
	VIDEO("video/*"),
	/**
	 * Accept image files
	 */
	IMAGE("image/*");
	
	String value;
	Accept(String value) { this.value = value; }
	/**
	 * Get the text value for this enumeration
	 * @return	The text value of this enumeration
	 */
	public String getValue() { return value; }

}
