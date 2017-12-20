package com.k2.Html5Builder.elements;

import java.util.Date;

import com.k2.Html5Builder.DateFormat;
import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.elements.attrValues.Accept;
import com.k2.Html5Builder.elements.attrValues.FormEncType;
import com.k2.Html5Builder.elements.attrValues.FormMethod;
import com.k2.Html5Builder.elements.attrValues.OnOff;
import com.k2.Html5Builder.elements.attrValues.Target;
import com.k2.Html5Builder.elements.attrValues.Type;
import com.k2.Html5Builder.elements.attrValues.Wrap;

public class HtmlTextArea extends HtmlElement<HtmlTextArea> {
	
	public HtmlTextArea setAutofocus() { attr("autofocus", null); return this; }
	public HtmlTextArea setCols(Integer value) { attr("cols", value.toString()); return this; }
	public HtmlTextArea setDirName(String value) { attr("dirName", value); return this; }
	public HtmlTextArea setDisabled() { attr("disabled", null); return this; }
	public HtmlTextArea setForm(String value) { attr("form", value); return this; }
	public HtmlTextArea setMaxLength(Integer value) { attr("maxLength", value.toString()); return this; }
	public HtmlTextArea setName(String value) { attr("name", value); return this; }
	public HtmlTextArea setPlaceHolder(String value) { attr("placeHolder", value); return this; }
	public HtmlTextArea setReadOnly() { attr("readOnly", null); return this; }
	public HtmlTextArea setRequired() { attr("required", null); return this; }
	public HtmlTextArea setRows(Integer value) { attr("rows", value.toString()); return this; }
	public HtmlTextArea setWrap(Wrap value) { attr("wrap", value.getValue()); return this; }

	public HtmlTextArea(Html5Builder hb) {
		super(hb, "textarea");		
	}

}
