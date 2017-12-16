package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.elements.attrValues.ButtonType;
import com.k2.Html5Builder.elements.attrValues.Dir;
import com.k2.Html5Builder.elements.attrValues.FormEncType;
import com.k2.Html5Builder.elements.attrValues.FormMethod;
import com.k2.Html5Builder.elements.attrValues.Target;

public class HtmlButton extends HtmlElement<HtmlButton> {
	
	public HtmlButton setAutoFocus() { attr("autoFocus", null); return this; }
	public HtmlButton setDisabled() { attr("disabled", null); return this; }
	public HtmlButton setForm(String value) { attr("form", value); return this; }
	public HtmlButton setFormAction(String value) { warnValid("type", "submit", "formAction"); attr("formAction", value); return this; }
	public HtmlButton setFormEncType(FormEncType value) { warnValid("type", "submit", "formEncType"); attr("formEncType", value.getValue()); return this; }
	public HtmlButton setFormMethod(FormMethod value) { warnValid("type", "submit", "formMethod"); attr("formMethod", value.getValue()); return this; }
	public HtmlButton setFormNoValidate() { warnValid("type", "submit", "formNoValidate"); attr("formNoValidate", null); return this; }
	public HtmlButton setFormTarget(Target value) { warnValid("type", "submit", "formTarget"); attr("formTarget", value.getValue()); return this; }
	public HtmlButton setFormTarget(String value) { warnValid("type", "submit", "formTarget"); attr("formTarget", value); return this; }
	public HtmlButton setName(String value) { attr("name", value); return this; }
	public HtmlButton setType(ButtonType value) { attr("type", value.getValue()); return this; }
	public HtmlButton setValue(String value) { attr("value", value); return this; }

	public HtmlButton(Html5Builder hb) {
		super(hb, "button");		
	}

}
