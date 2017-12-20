package com.k2.Html5Builder.elements.attrValues;

public enum LinkRel {
	ALTERNATE("alternate"),
	AUTHOR("author"),
	DNS_PREFETCH("dns-prefetch"),
	HELP("help"),
	ICON("icon"),
	LICENSE("license"),
	NEXT("next"),
	PINGBACK("pingback"),
	PRECONNECT("preconnect"),
	PREFETCH("prefetch"),
	PRELOAD("preload"),
	PRERENDER("prerender"),
	PREV("prev"),
	SEARCH("search"),
	STYLESHEET("stylesheet");
	
	String value;
	LinkRel(String value) { this.value = value; }
	public String getValue() { return value; }

}
