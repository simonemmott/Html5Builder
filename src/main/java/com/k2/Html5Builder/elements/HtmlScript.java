package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.elements.attrValues.OlType;

public class HtmlScript extends HtmlElement<HtmlScript> {
	
	public HtmlScript setAsync() { attr("async",null); return this; }
	public HtmlScript setCharSet(String value) { attr("charSet", value); return this; }
	public HtmlScript setDefer() { attr("defer", null); return this; }
	public HtmlScript setSrc(String value) { attr("src", value); return this; }
	public HtmlScript setType(MediaType value) { attr("type", value.getTemplate()); return this; }

	public HtmlScript(Html5Builder hb) {
		super(hb, "script");		
	}

}
