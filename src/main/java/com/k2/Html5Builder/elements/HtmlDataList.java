package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlPhrasingElement;

public class HtmlDataList extends HtmlPhrasingElement<HtmlDataList> {
	
	public HtmlDataList(Html5Builder hb) {
		super(hb, "datalist");		
	}

	public HtmlOption option() { return createAndAddChild(HtmlOption.class); }

}
