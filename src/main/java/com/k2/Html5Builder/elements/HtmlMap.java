package com.k2.Html5Builder.elements;

import java.io.PrintWriter;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlFlowElement;

public class HtmlMap extends HtmlFlowElement<HtmlMap> {
	
	public HtmlMap setName(String value) { attr("name", value); return this; }

	public HtmlMap(Html5Builder hb) {
		super(hb, "map");		
	}

	@Override
	public PrintWriter toXml(PrintWriter pw) { 
		if (get("name") == null) warning("'name' is required for 'map' elements");
		return super.toXml(pw); 
	}

}
