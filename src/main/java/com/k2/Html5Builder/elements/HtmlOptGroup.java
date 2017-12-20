package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.elements.attrValues.OlType;

public class HtmlOptGroup extends HtmlElement<HtmlOptGroup> {
	
	public HtmlOptGroup setDisabled() { attr("disabled", null); return this; }
	public HtmlOptGroup setLabel(String value) { attr("label", value); return this; }

	public HtmlOptGroup(Html5Builder hb) {
		super(hb, "optGroup");		
	}

	public HtmlOption option() { return createAndAddChild(HtmlOption.class); }

}
