package com.k2.Html5Builder.elements.attrValues;

/**
 * This enumeration defines the possible values for the scope attribute of 'th' elements
 * 
 * @author simon
 *
 */
public enum Scope {
	COL("col"),
	COLGROUP("colgroup"),
	ROW("row"),
	ROWGROUP("rowgroup");
	
	String value;
	Scope(String value) { this.value = value; }
	/**
	 * Get the text value for this enumeration
	 * @return	The text value of this enumeration
	 */
	public String getValue() { return value; }

}
