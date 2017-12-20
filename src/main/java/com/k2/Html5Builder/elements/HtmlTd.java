package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlFlowElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQuery;
import com.k2.Html5Builder.elements.attrValues.Dir;

public class HtmlTd extends HtmlFlowElement<HtmlTd> {
	
	public HtmlTd setColSpan(Integer value) { attr("colSpan", value.toString()); return this; }
	public HtmlTd setHeaders(String value) { attr("headers", value); return this; }
	public HtmlTd setRowSpan(Integer value) { attr("rowSpan", value.toString()); return this; }

	public HtmlTd(Html5Builder hb) {
		super(hb, "td");		
	}

}
