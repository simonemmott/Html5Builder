package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlStyledFlowElement;

/**
 * A class representing an 'aside' html element
 * 
 * @author simon
 *
 */
public class HtmlAside extends HtmlStyledFlowElement<HtmlAside> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining he html builder that
	 * created the element.
	 * @param hb		The html builder that created the element
	 */
	public HtmlAside(Html5Builder hb) {
		super(hb, "aside");		
	}

}
