package com.k2.Html5Builder.elements.attrValues;

/**
 * This enumeration defines the possible values for the type attribute of 'input' elements
 * 
 * @author simon
 *
 */
public enum Type {
	BUTTON("button"),
	CHECKBOX("checkbox"),
	COLOR("color"),
	DATE("date"),
	DATETIME_LOCAL("datetime-local"),
	EMAIL("email"),
	FILE("file"),
	HIDDEN("hidden"),
	IMAGE("image"),
	MONTH("month"),
	NUMBER("number"),
	PASSWORD("password"),
	RADIO("radio"),
	RANGE("range"),
	RESET("reset"),
	SEARCH("search"),
	SUBMIT("submit"),
	TEL("tel"),
	TEXT("text"),
	TIME("time"),
	URL("url"),
	WEEK("week");
	
	String value;
	Type(String value) { this.value = value; }
	/**
	 * Get the text value for this enumeration
	 * @return	The text value of this enumeration
	 */
	public String getValue() { return value; }

}
