package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlPhrasingElement;

public class HtmlLabel extends HtmlPhrasingElement<HtmlLabel> {
	
	public HtmlLabel setFor(String value) { attr("for", value); return this; }
	public HtmlLabel setForm(String value) { attr("form", value); return this; }

	public HtmlLabel(Html5Builder hb) {
		super(hb, "label");		
	}

}
