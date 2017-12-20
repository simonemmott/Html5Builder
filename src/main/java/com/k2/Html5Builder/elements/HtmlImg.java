package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.elements.attrValues.CrossOrigin;
import com.k2.Html5Builder.elements.attrValues.ARel;
import com.k2.Html5Builder.elements.attrValues.Sandbox;
import com.k2.Html5Builder.elements.attrValues.Target;

public class HtmlImg extends HtmlElement<HtmlImg> {
	
	public HtmlImg setAlt(String value) { attr("alt", value); return this; }
	public HtmlImg setCrossOrigin(CrossOrigin value) { attr("crossOrigin", value.getValue()); return this; }
	public HtmlImg setHeight(Integer value) { attr("height", value.toString()); return this; }
	public HtmlImg setIsMap() { attr("name", null); return this; }
	public HtmlImg setLongDesc(String value) { attr("longDesc", value); return this; }
	public HtmlImg setSizes(String value) { attr("sizes", value); return this; }
	public HtmlImg setSrc(String value) { attr("src", value); return this; }
	public HtmlImg setSrcSet(String value) { attr("srcSet", value); return this; }
	public HtmlImg setUseMap(String value) { attr("useMap", "#"+value); return this; }
	public HtmlImg setWidth(Integer value) { attr("width", value.toString()); return this; }


	public HtmlImg(Html5Builder hb) {
		super(hb, "img");
		emptyTag();
	}

}
