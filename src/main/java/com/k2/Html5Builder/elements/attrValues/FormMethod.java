package com.k2.Html5Builder.elements.attrValues;

/**
 * This enumeration defines the possible values for the method or formMethod attributes of 'button', 'form' and 'input' elements
 * 
 * @author simon
 *
 */
public enum FormMethod {
	GET("get"),
	POST("post");
	
	String value;
	FormMethod(String value) { this.value = value; }
	/**
	 * Get the text value for this enumeration
	 * @return	The text value of this enumeration
	 */
	public String getValue() { return value; }

}
