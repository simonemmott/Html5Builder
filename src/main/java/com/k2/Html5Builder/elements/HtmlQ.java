package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlPhrasingElement;
import com.k2.Html5Builder.elements.attrValues.Dir;

public class HtmlQ extends HtmlPhrasingElement<HtmlQ> {
	
	public HtmlQ setCite(String value) { attr("cite", value); return this; }

	public HtmlQ(Html5Builder hb) {
		super(hb, "q");		
	}

}
