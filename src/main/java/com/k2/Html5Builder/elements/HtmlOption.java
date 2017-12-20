package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.elements.attrValues.OlType;

public class HtmlOption extends HtmlElement<HtmlOption> {
	
	public HtmlOption setDisabled() { attr("disabled", null); return this; }
	public HtmlOption setLabel(String value) { attr("label", value); return this; }
	public HtmlOption setSelected() { attr("selected", null); return this; }
	public HtmlOption setValue(String value) { attr("value", value); return this; }

	public HtmlOption(Html5Builder hb) {
		super(hb, "option");		
		emptyTag();
	}

}
