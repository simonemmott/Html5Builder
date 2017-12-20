package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.elements.attrValues.OlType;

public class HtmlParam extends HtmlElement<HtmlParam> {
	
	public HtmlParam setName(String value) { attr("name", value); return this; }
	public HtmlParam setValue(String value) { attr("value", value); return this; }

	public HtmlParam(Html5Builder hb) {
		super(hb, "param");	
		emptyTag();
	}

}
