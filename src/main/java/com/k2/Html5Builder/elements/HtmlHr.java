package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

public class HtmlHr extends HtmlElement<HtmlHr> {
	
	public HtmlHr(Html5Builder hb) {
		super(hb, "hr");		
		emptyTag();
	}

}
