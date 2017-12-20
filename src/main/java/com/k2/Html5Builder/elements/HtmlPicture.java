package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlFlowElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.elements.attrValues.OlType;

public class HtmlPicture extends HtmlElement<HtmlPicture> {
	
	public HtmlPicture(Html5Builder hb) {
		super(hb, "picture");		
	}

	public HtmlSource source() { return createAndAddChild(HtmlSource.class); }
	public HtmlImg img() { return createAndAddChild(HtmlImg.class); }
	public HtmlScript script() { return createAndAddChild(HtmlScript.class); }
	public HtmlNoScript noScript() { return createAndAddChild(HtmlNoScript.class); }

}
