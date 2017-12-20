package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.elements.attrValues.ARel;
import com.k2.Html5Builder.elements.attrValues.Sandbox;
import com.k2.Html5Builder.elements.attrValues.Target;

public class HtmlIFrame extends HtmlElement<HtmlIFrame> {
	
	public HtmlIFrame setHeight(Integer value) { attr("height", value.toString()); return this; }
	public HtmlIFrame setName(String value) { attr("name", value); return this; }
	public HtmlIFrame setSandbox(Sandbox value) { attr("sandbox", value.getValue()); return this; }
	public HtmlIFrame setSrc(String value) { attr("src", value); return this; }
	public HtmlIFrame setSrcDoc(String value) { attr("srcDoc", value); return this; }
	public HtmlIFrame setSrcDoc(HtmlElement value) { attr("srcDoc", value.toString()); return this; }
	public HtmlIFrame setWidth(Integer value) { attr("width", value.toString()); return this; }


	public HtmlIFrame(Html5Builder hb) {
		super(hb, "iframe");	
		emptyTag();
	}

}
