package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlFlowElement;

/**
 * A class representing an 'dd' html element
 * 
 * @author simon
 *
 */
public class HtmlDd extends HtmlFlowElement<HtmlDd> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlDd(Html5Builder hb) {
		super(hb, "dd");		
	}

}
