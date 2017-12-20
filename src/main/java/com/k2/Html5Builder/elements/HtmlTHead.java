package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

public class HtmlTHead extends HtmlElement<HtmlTHead> {
	
	public HtmlTHead(Html5Builder hb) {
		super(hb, "thead");	
	}
	
	public HtmlTr tr() { return createAndAddChild(HtmlTr.class); }

}
