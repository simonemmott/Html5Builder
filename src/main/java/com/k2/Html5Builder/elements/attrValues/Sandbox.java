package com.k2.Html5Builder.elements.attrValues;

public enum Sandbox {
	ALLOW_FORMS("allow-forms"),
	ALLOW_POINTER_LOCK("allow-pointer-lock"),
	ALLOW_POPUPS("allow-popups"),
	ALLOW_SAME_ORIGIN("allow-same-origin"),
	ALLOW_SCRIPTS("allow-scripts"),
	ALLOW_TOP_NAVIGATION("allow-top-navigation");
	
	String value;
	Sandbox(String value) { this.value = value; }
	public String getValue() { return value; }

}
