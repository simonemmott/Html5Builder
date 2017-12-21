package com.k2.Html5Builder.elements;

import java.io.PrintWriter;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlFlowElement;

/**
 * A class representing an 'figcaption' html element
 * 
 * @author simon
 *
 */
public class HtmlFigCaption extends HtmlFlowElement<HtmlFigCaption> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element 
	 * @param hb		The html builder that created the element
	 */
	public HtmlFigCaption(Html5Builder hb) {
		super(hb, "figcaption");		
	}
	
	/**
	 * Override output to xml to check whether the figcaption is the first child of its parent.
	 */
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
