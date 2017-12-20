package com.k2.Html5Builder;

public enum DateFormat {
	DATE_TIME_ZONE("yyyy-MM-dd HH:mm:sszzzz"),
	DATE_TIME("yyyy-MM-dd HH:mm:ss"),
	DATE("yyyy-MM-dd");
	
	String value;
	DateFormat(String value) { this.value = value; }
	public String getValue() { return value; }

}
