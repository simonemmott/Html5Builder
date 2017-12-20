package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlFlowElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.elements.attrValues.FormEncType;
import com.k2.Html5Builder.elements.attrValues.FormMethod;
import com.k2.Html5Builder.elements.attrValues.Target;

public class HtmlForm extends HtmlFlowElement<HtmlForm> {
	
	public HtmlForm setAcceptCharset(String value) { attr("accept-charset", value); return this; }
	public HtmlForm setAction(String value) { attr("action", value); return this; }
	public HtmlForm setAutocomplete() { attr("autocomplete", null); return this; }
	public HtmlForm setEncType(FormEncType value) { attr("encType", value.getValue()); return this; }
	public HtmlForm setMethod(FormMethod value) { attr("method", value.getValue()); return this; }
	public HtmlForm setName(String value) { attr("name", value); return this; }
	public HtmlForm setNoValidate() { attr("noValidate", null); return this; }
	public HtmlForm setTarget(Target value) { attr("target", value.getValue()); return this; }

	public HtmlForm(Html5Builder hb) {
		super(hb, "form");		
	}

}
