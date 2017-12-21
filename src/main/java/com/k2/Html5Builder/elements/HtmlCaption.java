package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlFlowElement;

/**
 * A class representing an 'caption' html element
 * 
 * @author simon
 *
 */
public class HtmlCaption extends HtmlFlowElement<HtmlCaption> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlCaption(Html5Builder hb) {
		super(hb, "caption");		
	}

}
