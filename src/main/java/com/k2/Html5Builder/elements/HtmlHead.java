package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

public class HtmlHead extends HtmlElement<HtmlHead> {
	
	public HtmlHead(Html5Builder hb) {
		super(hb, "head");		
	}
	
	public HtmlBase base() { return createAndAddChild(HtmlBase.class); }


}
