package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.elements.attrValues.OlType;

public class HtmlOl extends HtmlElement<HtmlOl> {
	
	public HtmlOl setReversed() { attr("reversed", null); return this; }
	public HtmlOl setStart(Integer value) { attr("start", value.toString()); return this; }
	public HtmlOl setType(OlType value) { attr("type", value.getValue()); return this; }

	public HtmlOl(Html5Builder hb) {
		super(hb, "ol");		
	}

	public HtmlLi li() { return createAndAddChild(HtmlLi.class); }

}
