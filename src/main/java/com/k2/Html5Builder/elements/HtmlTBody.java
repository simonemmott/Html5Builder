package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

public class HtmlTBody extends HtmlElement<HtmlTBody> {
	
	public HtmlTBody(Html5Builder hb) {
		super(hb, "tbody");	
	}
	
	public HtmlTr tr() { return createAndAddChild(HtmlTr.class); }

}
