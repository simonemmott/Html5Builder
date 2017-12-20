package com.k2.Html5Builder.elements;

import java.io.PrintWriter;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQuery;
import com.k2.Html5Builder.elements.attrValues.Dir;

public class HtmlStyle extends HtmlElement<HtmlStyle> {
	
	public HtmlStyle setMedia(MediaQuery value) { attr("media", value.query()); return this; }
	public HtmlStyle setScoped() { attr("scoped", null); return this; }

	public HtmlStyle(Html5Builder hb) {
		super(hb, "style");	
		attr("type", "text/css");
	}
	
	@Override
	public PrintWriter toXml(PrintWriter pw) {
		if (!has("scoped") && !parent().getClass().equals(HtmlHead.class)) {
			warning("style elemnts can only be added within the body of an Html document if the 'scoped' attribute is set");
		}
		return super.toXml(pw);
	}

}
