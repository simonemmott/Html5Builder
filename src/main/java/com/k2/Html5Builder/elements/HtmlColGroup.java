package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

public class HtmlColGroup extends HtmlElement<HtmlColGroup> {
	
	public HtmlColGroup setSpan(Integer value) { attr("span", value.toString()); return this; }

	public HtmlColGroup(Html5Builder hb) {
		super(hb, "colgroup");		
	}
	
	public HtmlCol col() { return createAndAddChild(HtmlCol.class); }


}
