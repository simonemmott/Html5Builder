package com.k2.Html5Builder.elements;

import java.io.PrintWriter;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlFlowElement;
import com.k2.Html5Builder.MediaTypes.MediaType;

public class HtmlFigCaption extends HtmlFlowElement<HtmlFigCaption> {
	
	public HtmlFigCaption(Html5Builder hb) {
		super(hb, "figcaption");		
	}
	
	@Override
	public PrintWriter toXml(PrintWriter pw) {
		
		Integer indexOf = indexOf();
		if (indexOf != null && !indexOf.equals(0)) { 
			warning("The element 'figCaption' must be the first element in its parent. This element has been skipped");
			return pw;
		}
		
		return super.toXml(pw);
	}

}
