package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlRestrictedFlowElement;

/**
 * A class representing an 'header' html element
 * 
 * @author simon
 *
 */
public class HtmlHeader extends HtmlRestrictedFlowElement<HtmlHeader> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element 
	 * @param hb		The html builder that created the element
	 */
	public HtmlHeader(Html5Builder hb) {
		super(hb, "header");		
	}

}
