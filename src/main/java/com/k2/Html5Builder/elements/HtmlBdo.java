package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.elements.attrValues.AttrDir;

public class HtmlBdo extends HtmlElement<HtmlBdo> {
	
	public HtmlBdo setDir(AttrDir value) { attr("dir", value.getValue()); return this; }

	public HtmlBdo(Html5Builder hb) {
		super(hb, "bdo");		
	}

}
