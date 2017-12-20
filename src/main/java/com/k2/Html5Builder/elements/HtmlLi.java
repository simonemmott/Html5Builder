package com.k2.Html5Builder.elements;

import java.util.Date;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlFlowElement;
import com.k2.XMLBuilder.XMLElement;

public class HtmlLi extends HtmlFlowElement<HtmlLi> {
	
	public HtmlLi setValue(Integer value) { 
		if (((XMLElement)parent).getTag().equals("ol")) {
			attr("value", value.toString());  
		} else {
			warning("value is only applicable to 'li' elements that are children of 'ol' elements");
		}
		return this;
	}

	public HtmlLi(Html5Builder hb) {
		super(hb, "li");		
	}

}
