package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlGlobalElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQuery;
import com.k2.Html5Builder.elements.attrValues.CrossOrigin;
import com.k2.Html5Builder.elements.attrValues.HtmlLanguageCode;
import com.k2.Html5Builder.elements.attrValues.LinkRel;

public class HtmlLink extends HtmlGlobalElement<HtmlLink> {
	
	private LinkRel rel = null;
	
	public HtmlLink setCrossOrigin(CrossOrigin value) { attr("crossOrigin", value.getValue()); return this; }
	public HtmlLink setHRef(String value) { attr("href", value); return this; }
	public HtmlLink setHRefLang(HtmlLanguageCode value) { attr("hrefLang", value.getValue()); return this; }
	public HtmlLink setMedia(MediaQuery value) { attr("media", value.query()); return this; }
	public HtmlLink setMedia(String value) { attr("media", value); return this; }
	public HtmlLink setRel(LinkRel value) { rel = value; attr("rel", value.getValue()); return this; }
	public HtmlLink setSizes(String value) { if (rel == LinkRel.ICON) attr("sizes", value); else warning("sizes is only applcable for link elements with rel: 'icon'"); return this; }
	public HtmlLink setType(MediaType value) { attr("type", value.getTemplate()); return this; }

	public HtmlLink(Html5Builder hb) {
		super(hb, "link");
		emptyTag();
	}

}
