package com.k2.Html5Builder.elements;

import java.util.Date;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

public class HtmlDl extends HtmlElement<HtmlDl> {
	
	public HtmlDl(Html5Builder hb) {
		super(hb, "dl");		
	}

	public HtmlDd dd() { return createAndAddChild(HtmlDd.class); }
	public HtmlDt dt() { return createAndAddChild(HtmlDt.class); }

}
