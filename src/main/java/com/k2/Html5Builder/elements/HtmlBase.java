package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlGlobalElement;
import com.k2.Html5Builder.elements.attrValues.ARel;
import com.k2.Html5Builder.elements.attrValues.Target;
import com.k2.XMLBuilder.XMLElement;

public class HtmlBase extends HtmlGlobalElement<HtmlBase> {
	
	public HtmlBase setHref(String value) { attr("href", value); return this; }
	public HtmlBase setTarget(Target value) { attr("target", value.getValue()); return this; }
	public HtmlBase setTarget(String value) { attr("target", value); return this; }

	public HtmlBase(Html5Builder hb) {
		super(hb, "base");
		emptyTag();
	}

}
