package com.k2.Html5Builder.elements.attrValues;

/**
 * This enumeration defines the possible values for the formEnctype attribute of 'button', 'form' and 'input' elements
 * 
 * @author simon
 *
 */
public enum FormEncType {
	APPLICATION("application/x-www-form-urlencoded"),
	MULTIPART("multipart/form-data"),
	TEXT("text/plain");
	
	String value;
	FormEncType(String value) { this.value = value; }
	/**
	 * Get the text value for this enumeration
	 * @return	The text value of this enumeration
	 */
	public String getValue() { return value; }

}
