package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlFlowElement;
import com.k2.Html5Builder.MediaTypes.MediaType;

public class HtmlObject extends HtmlFlowElement<HtmlObject> {
	
	public HtmlObject setData(String value) { attr("data", value); return this; }
	public HtmlObject setForm(String value) { attr("form", value); return this; }
	public HtmlObject setHeight(Integer value) { attr("form", value.toString()); return this; }
	public HtmlObject setName(String value) { attr("name", value); return this; }
	public HtmlObject setType(MediaType value) { attr("name", value.getTemplate()); return this; }
	public HtmlObject setUseMap(String value) { attr("useMap", "#"+value); return this; }
	public HtmlObject setWidth(Integer value) { attr("width", value.toString()); return this; }

	public HtmlObject(Html5Builder hb) {
		super(hb, "object");		
	}

	public HtmlParam param() { return createAndAddChild(HtmlParam.class); }

}
