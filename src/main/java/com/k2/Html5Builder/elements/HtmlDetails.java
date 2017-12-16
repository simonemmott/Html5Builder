package com.k2.Html5Builder.elements;

import java.util.Date;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

public class HtmlDetails extends HtmlElement<HtmlDetails> {
	
	public HtmlDetails setOpen() { attr("cite", null); return this; }

	public HtmlDetails(Html5Builder hb) {
		super(hb, "details");		
	}

}
