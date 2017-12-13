package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.elements.attrValues.AttrButtonType;
import com.k2.Html5Builder.elements.attrValues.AttrDir;
import com.k2.Html5Builder.elements.attrValues.AttrFormEncType;
import com.k2.Html5Builder.elements.attrValues.AttrFormMethod;
import com.k2.Html5Builder.elements.attrValues.AttrTarget;

public class HtmlButton extends HtmlElement<HtmlButton> {
	
	public HtmlButton setAutoFocus() { attr("autoFocus", null); return this; }
	public HtmlButton setDisabled() { attr("disabled", null); return this; }
	public HtmlButton setForm(String value) { attr("form", value); return this; }
	public HtmlButton setFormAction(String value) { warnValid("type", "submit", "formAction"); attr("formAction", value); return this; }
	public HtmlButton setFormEncType(AttrFormEncType value) { warnValid("type", "submit", "formEncType"); attr("formEncType", value.getValue()); return this; }
	public HtmlButton setFormMethod(AttrFormMethod value) { warnValid("type", "submit", "formMethod"); attr("formMethod", value.getValue()); return this; }
	public HtmlButton setFormNoValidate() { warnValid("type", "submit", "formNoValidate"); attr("formNoValidate", null); return this; }
	public HtmlButton setFormTarget(AttrTarget value) { warnValid("type", "submit", "formTarget"); attr("formTarget", value.getValue()); return this; }
	public HtmlButton setFormTarget(String value) { warnValid("type", "submit", "formTarget"); attr("formTarget", value); return this; }
	public HtmlButton setName(String value) { attr("name", value); return this; }
	public HtmlButton setType(AttrButtonType value) { attr("type", value.getValue()); return this; }
	public HtmlButton setValue(String value) { attr("value", value); return this; }

	public HtmlButton(Html5Builder hb) {
		super(hb, "button");		
	}

}
