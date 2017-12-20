package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

public class HtmlDetails extends HtmlPhrasingElement<HtmlDetails> {
	
	public HtmlDetails setOpen() { attr("cite", null); return this; }

	public HtmlDetails(Html5Builder hb) {
		super(hb, "details");		
	}

	public HtmlSummary summary() { return createAndAddChild(HtmlSummary.class); }

}
