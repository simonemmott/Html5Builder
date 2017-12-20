package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

public class HtmlUl extends HtmlElement<HtmlUl> {
	
	public HtmlUl(Html5Builder hb) {
		super(hb, "ul");		
	}

	public HtmlLi li() { return createAndAddChild(HtmlLi.class); }

}
