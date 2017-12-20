package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.elements.attrValues.Dir;

public class HtmlSelect extends HtmlElement<HtmlSelect> {
	
	public HtmlSelect setAutofocus() { attr("autofocus", null); return this; }
	public HtmlSelect setDisabled() { attr("disabled", null); return this; }
	public HtmlSelect setForm(String value) { attr("form", value); return this; }
	public HtmlSelect setMultiple() { attr("multiple", null); return this; }
	public HtmlSelect setName(String value) { attr("name", value); return this; }
	public HtmlSelect setRequired() { attr("required", null); return this; }
	public HtmlSelect setSize(Integer value) { attr("size", value.toString()); return this; }

	public HtmlSelect(Html5Builder hb) {
		super(hb, "select");		
	}
	
	public HtmlOptGroup optGroup() { return createAndAddChild(HtmlOptGroup.class); }
	public HtmlOption option() { return createAndAddChild(HtmlOption.class); }


}
