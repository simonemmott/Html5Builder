package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'h6' html element
 * 
 * @author simon
 *
 */
public class HtmlH6 extends HtmlPhrasingElement<HtmlH6> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element 
	 * @param hb		The html builder that created the element
	 */
	public HtmlH6(Html5Builder hb) {
		super(hb, "h6");		
	}

}
