package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlFlowElement;
import com.k2.Html5Builder.MediaTypes.MediaType;

public class HtmlFigure extends HtmlFlowElement<HtmlFigure> {
	
	public HtmlFigure setAlt(String value) { attr("alt", value); return this; }
	public HtmlFigure setHeight(Integer value) { attr("height", value.toString()); return this; }
	public HtmlFigure setSrc(String value) { attr("src", value); return this; }
	public HtmlFigure setWidth(Integer value) { attr("width", value.toString()); return this; }

	public HtmlFigure(Html5Builder hb) {
		super(hb, "figure");		
	}
	
	public HtmlFigCaption figCaption() { return createAndAddChild(HtmlFigCaption.class); }

}
