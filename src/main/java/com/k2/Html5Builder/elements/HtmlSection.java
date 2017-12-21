package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlStyledFlowElement;

/**
 * A class representing an 'section' html element
 * 
 * @author simon
 *
 */
public class HtmlSection extends HtmlStyledFlowElement<HtmlSection> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlSection(Html5Builder hb) {
		super(hb, "section");		
	}

}
