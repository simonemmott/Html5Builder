package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.elements.attrValues.Dir;

public class HtmlBlockQuote extends HtmlElement<HtmlBlockQuote> {
	
	public HtmlBlockQuote setDir(String value) { attr("cite", value); return this; }

	public HtmlBlockQuote(Html5Builder hb) {
		super(hb, "blockquote");		
	}

}