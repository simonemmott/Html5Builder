package com.k2.Html5Builder.elements.attrValues;

/**
 * This enumeration defines the possible values for the 'http-equiv' attribute of 'head' and 'meta' elements
 * 
 * @author simon
 *
 */
public enum HttpEquiv {
	CONTENT_TYPE("content-type"),
	DEFAULT_STYLE("default-style"),
	REFRESH("refresh");
	
	String value;
	HttpEquiv(String value) { this.value = value; }
	/**
	 * Get the text value for this enumeration
	 * @return	The text value of this enumeration
	 */
	public String getValue() { return value; }

}
