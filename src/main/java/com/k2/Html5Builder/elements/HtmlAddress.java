package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlVeryRestrictedFlowElement;

/**
 * A class representing an 'address' html element
 * 
 * @author simon
 *
 */
public class HtmlAddress extends HtmlVeryRestrictedFlowElement<HtmlAddress> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining he html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlAddress(Html5Builder hb) {
		super(hb, "address");		
	}

}
