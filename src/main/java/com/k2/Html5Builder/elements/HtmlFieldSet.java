package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlFlowElement;
import com.k2.Html5Builder.MediaTypes.MediaType;

public class HtmlFieldSet extends HtmlFlowElement<HtmlFieldSet> {
	
	public HtmlFieldSet setDisabled() { attr("disabled", null); return this; }
	public HtmlFieldSet setForm(String value) { attr("form", value); return this; }	
	public HtmlFieldSet setName(String value) { attr("name", value); return this; }
	
	public HtmlFieldSet(Html5Builder hb) {
		super(hb, "fieldset");		
	}

	public HtmlLegend legend() { return createAndAddChild(HtmlLegend.class); }

}
