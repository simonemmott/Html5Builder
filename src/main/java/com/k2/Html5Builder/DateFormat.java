package com.k2.Html5Builder;

/**
 * This enumeration defines the java data format strings for various HTML data formats
 * @author simon
 *
 */
public enum DateFormat {
	/**
	 * Date and time with time zone
	 */
	DATE_TIME_ZONE("yyyy-MM-dd HH:mm:ssz"),
	/**
	 * Date and time without time zone
	 */
	DATE_TIME("yyyy-MM-dd HH:mm:ss"),
	/**
	 * Date only
	 */
	DATE("yyyy-MM-dd");
	
	String value;
	DateFormat(String value) { this.value = value; }
	/**
	 * Get the java format string for the enumeration
	 * @return A String containing the java date format suitable for java SimpleDateFormat
	 */
	public String getValue() { return value; }

}
