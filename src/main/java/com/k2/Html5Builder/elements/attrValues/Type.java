package com.k2.Html5Builder.elements.attrValues;

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
	public String getValue() { return value; }

}
