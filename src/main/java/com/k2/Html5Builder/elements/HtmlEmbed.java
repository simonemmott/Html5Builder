package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.MediaTypes.MediaType;

public class HtmlEmbed extends HtmlElement<HtmlEmbed> {
	
	public HtmlEmbed setHeight(Integer value) { attr("height", value.toString()); return this; }
	public HtmlEmbed setUrl(String value) { attr("src", value); return this; }	
	public HtmlEmbed setWidth(Integer value) { attr("width", value.toString()); return this; }
	public HtmlEmbed setType(MediaType value) { attr("type", value.getTemplate()); return this; }
	
	public HtmlEmbed(Html5Builder hb) {
		super(hb, "embed");	
		emptyTag();
	}

}
