package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlPhrasingElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.elements.attrValues.OlType;

public class HtmlOutput extends HtmlPhrasingElement<HtmlOutput> {
	
	public HtmlOutput setFor(String value) { attr("for", value); return this; }
	public HtmlOutput setForm(String value) { attr("form", value); return this; }
	public HtmlOutput setName(String value) { attr("name", value); return this; }

	public HtmlOutput(Html5Builder hb) {
		super(hb, "output");		
	}

}
