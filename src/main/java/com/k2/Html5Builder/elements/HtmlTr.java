package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQuery;
import com.k2.Html5Builder.elements.attrValues.Dir;

public class HtmlTr extends HtmlElement<HtmlTr> {
	
	public HtmlTr(Html5Builder hb) {
		super(hb, "tr");		
	}

	public HtmlTd td() { return createAndAddChild(HtmlTd.class); }
	public HtmlTh th() { return createAndAddChild(HtmlTh.class); }

}
