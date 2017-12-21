package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

/**
 * A class representing an 'hr' html element
 * 
 * @author simon
 *
 */
public class HtmlHr extends HtmlElement<HtmlHr> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element and identifies the element as empty
	 * @param hb		The html builder that created the element
	 */
	public HtmlHr(Html5Builder hb) {
		super(hb, "hr");		
		emptyTag();
	}

}
