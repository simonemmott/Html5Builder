package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQuery;
import com.k2.Html5Builder.elements.attrValues.Dir;

public class HtmlSource extends HtmlElement<HtmlSource> {
	
	public HtmlSource setSrc(String value) { attr("src", value); return this; }
	public HtmlSource setSrcSet(String value) { attr("srcSet", value); return this; }
	public HtmlSource setMedia(MediaQuery value) { attr("media", value.query()); return this; }
	public HtmlSource setMultiple() { attr("multiple", null); return this; }
	public HtmlSource setSizes(String value) { attr("sizes", value); return this; }
	public HtmlSource setType(MediaType value) { attr("type", value.getTemplate()); return this; }

	public HtmlSource(Html5Builder hb) {
		super(hb, "source");	
		emptyTag();
	}

}
