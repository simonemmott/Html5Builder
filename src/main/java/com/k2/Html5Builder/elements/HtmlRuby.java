package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlPhrasingElement;
import com.k2.Html5Builder.elements.attrValues.Dir;

public class HtmlRuby extends HtmlPhrasingElement<HtmlRuby> {
	
	public HtmlRuby(Html5Builder hb) {
		super(hb, "ruby");		
	}

	public HtmlRp rp() { return createAndAddChild(HtmlRp.class); }
	public HtmlRt rt() { return createAndAddChild(HtmlRt.class); }

}
