package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

public class HtmlTable extends HtmlElement<HtmlTable> {
	
	public HtmlTable(Html5Builder hb) {
		super(hb, "table");		
	}

	public HtmlColGroup colGroup() { return createAndAddChild(HtmlColGroup.class); }

}
