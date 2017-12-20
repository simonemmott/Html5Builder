package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.elements.attrValues.HttpEquiv;
import com.k2.Html5Builder.elements.attrValues.MetaName;

public class HtmlMeta extends HtmlElement<HtmlMeta> {
	
	public HtmlMeta setCharSet(String value) { attr("charSet", value); return this; }
	public HtmlMeta setContent(String value) { attr("content", value); return this; }
	public HtmlMeta setHttpEquiv(HttpEquiv value) { attr("http-equiv", value.getValue()); return this; }
	public HtmlMeta setName(MetaName value) { attr("name", value.getValue()); return this; }

	public HtmlMeta(Html5Builder hb) {
		super(hb, "meta");
		emptyTag();
	}

}
