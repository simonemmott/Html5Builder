package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlPhrasingElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.elements.attrValues.OlType;

public class HtmlProgress extends HtmlPhrasingElement<HtmlProgress> {
	
	public HtmlProgress setMax(Double value) { attr("max", value.toString()); return this; }
	public HtmlProgress setMax(Integer value) { attr("max", value.toString()); return this; }
	public HtmlProgress setValue(Double value) { attr("value", value.toString()); return this; }
	public HtmlProgress setValue(Integer value) { attr("value", value.toString()); return this; }

	public HtmlProgress(Html5Builder hb) {
		super(hb, "progress");		
	}

}
