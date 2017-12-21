package com.k2.Html5Builder.elements.attrValues;

/**
 * This enumeration defines the possible values for the sandbox attribute of 'iframe' elements
 * 
 * @author simon
 *
 */
public enum Sandbox {
	ALLOW_FORMS("allow-forms"),
	ALLOW_POINTER_LOCK("allow-pointer-lock"),
	ALLOW_POPUPS("allow-popups"),
	ALLOW_SAME_ORIGIN("allow-same-origin"),
	ALLOW_SCRIPTS("allow-scripts"),
	ALLOW_TOP_NAVIGATION("allow-top-navigation");
	
	String value;
	Sandbox(String value) { this.value = value; }
	/**
	 * Get the text value for this enumeration
	 * @return	The text value of this enumeration
	 */
	public String getValue() { return value; }

}
