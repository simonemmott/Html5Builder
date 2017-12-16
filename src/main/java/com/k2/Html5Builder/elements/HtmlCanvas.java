package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

public class HtmlCanvas extends HtmlElement<HtmlCanvas> {
	
	public HtmlCanvas setHeight(Integer value) { attr("height", value.toString()); return this; }
	public HtmlCanvas setWidth(Integer value) { attr("width", value.toString()); return this; }

	public HtmlCanvas(Html5Builder hb) {
		super(hb, "canvas");		
	}

}
