package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlFlowElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQuery;
import com.k2.Html5Builder.elements.attrValues.Dir;
import com.k2.Html5Builder.elements.attrValues.Scope;

public class HtmlTh extends HtmlFlowElement<HtmlTh> {
	
	public HtmlTh setAbbr(String value) { attr("abbr", value); return this; }
	public HtmlTh setColSpan(Integer value) { attr("colSpan", value.toString()); return this; }
	public HtmlTh setHeaders(String value) { attr("headers", value); return this; }
	public HtmlTh setRowSpan(Integer value) { attr("rowSpan", value.toString()); return this; }
	public HtmlTh setScope(Scope value) { attr("rowSpan", value.getValue()); return this; }

	public HtmlTh(Html5Builder hb) {
		super(hb, "th");		
	}

}
