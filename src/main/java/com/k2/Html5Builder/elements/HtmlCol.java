package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

public class HtmlCol extends HtmlElement<HtmlCol> {
	
	public HtmlCol setSpan(Integer value) { attr("span", value.toString()); return this; }

	public HtmlCol(Html5Builder hb) {
		super(hb, "col");		
	}

}
