package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlPhrasingElement;
import com.k2.Html5Builder.elements.attrValues.Dir;

public class HtmlBdo extends HtmlPhrasingElement<HtmlBdo> {
	
	public HtmlBdo setDir(Dir value) { attr("dir", value.getValue()); return this; }

	public HtmlBdo(Html5Builder hb) {
		super(hb, "bdo");		
	}

}
