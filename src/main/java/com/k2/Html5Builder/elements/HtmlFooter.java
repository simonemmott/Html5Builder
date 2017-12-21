package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlRestrictedFlowElement;

/**
 * A class representing an 'footer' html element
 * 
 * @author simon
 *
 */
public class HtmlFooter extends HtmlRestrictedFlowElement<HtmlFooter> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element 
	 * @param hb		The html builder that created the element
	 */
	public HtmlFooter(Html5Builder hb) {
		super(hb, "footer");		
	}

}
