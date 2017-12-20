package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.elements.attrValues.*;

public class HtmlArea extends HtmlElement<HtmlArea> {
	
	public HtmlArea setAlt(String value) { attr("alt", value); return this; }
	public HtmlArea setCoords(String value) { attr("coords", value); return this; }
	public HtmlArea setDownload(String value) { attr("download", value); return this; }
	public HtmlArea setHref(String value) { attr("href", value); return this; }
	public HtmlArea setMedia(String value) { attr("media", value); return this; }
	public HtmlArea setRel(ARel value) { attr("rel", value.getValue()); return this; }
	public HtmlArea setShape(Shape value) { attr("shape", value.getValue()); return this; }
	public HtmlArea setTarget(Target value) { attr("target", value.getValue()); return this; }
	public HtmlArea setTarget(String value) { attr("target", value); return this; }
	public HtmlArea setType(String value) { attr("type", value); return this; }

	public HtmlArea(Html5Builder hb) {
		super(hb, "area");	
		emptyTag();
	}

}
