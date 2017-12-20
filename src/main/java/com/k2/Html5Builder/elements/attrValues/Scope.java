package com.k2.Html5Builder.elements.attrValues;

public enum Scope {
	COL("col"),
	COLGROUP("colgroup"),
	ROW("row"),
	ROWGROUP("rowgroup");
	
	String value;
	Scope(String value) { this.value = value; }
	public String getValue() { return value; }

}
