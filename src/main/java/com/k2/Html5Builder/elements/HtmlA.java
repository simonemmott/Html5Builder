package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.elements.attrValues.AttrRel;
import com.k2.Html5Builder.elements.attrValues.AttrTarget;

public class HtmlA extends HtmlElement<HtmlA> {
	
	public HtmlA setDownload(String value) { attr("download", value); return this; }
	public HtmlA setHref(String value) { attr("href", value); return this; }
	public HtmlA setHrefLang(String value) { attr("hrefLang", value); return this; }
	public HtmlA setMedia(String value) { attr("media", value); return this; }
	public HtmlA setRel(AttrRel value) { attr("rel", value.getValue()); return this; }
	public HtmlA setTarget(AttrTarget value) { attr("target", value.getValue()); return this; }
	public HtmlA setTarget(String value) { attr("target", value); return this; }
	public HtmlA setType(String value) { attr("type", value); return this; }


	public HtmlA(Html5Builder hb) {
		super(hb, "a");		
	}

}
