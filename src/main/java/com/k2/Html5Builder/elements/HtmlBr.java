package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

public class HtmlBr extends HtmlElement<HtmlBr> {
	
	public HtmlBr(Html5Builder hb) {
		super(hb, "br");		
		emptyTag();
	}

}
