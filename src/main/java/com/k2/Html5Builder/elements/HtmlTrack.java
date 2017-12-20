package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQuery;
import com.k2.Html5Builder.elements.attrValues.Dir;
import com.k2.Html5Builder.elements.attrValues.Kind;
import com.k2.Html5Builder.elements.attrValues.Scope;

public class HtmlTrack extends HtmlElement<HtmlTrack> {
	
	public HtmlTrack setDefault() { attr("default", null); return this; }
	public HtmlTrack setKind(Kind value) { attr("kind", value.getValue()); return this; }
	public HtmlTrack setLabel(String value) { attr("label", value); return this; }
	public HtmlTrack setSrc(String value) { attr("src", value); return this; }
	public HtmlTrack setSrcLang(String value) { attr("srcLang", value); return this; }

	public HtmlTrack(Html5Builder hb) {
		super(hb, "track");	
		emptyTag();
	}

}
