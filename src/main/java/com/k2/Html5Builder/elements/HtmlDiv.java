package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlStyledFlowElement;

/**
 * A class representing an 'div' html element
 * 
 * @author simon
 *
 */
public class HtmlDiv extends HtmlStyledFlowElement<HtmlDiv> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlDiv(Html5Builder hb) {
		super(hb, "div");		
	}
	
}
