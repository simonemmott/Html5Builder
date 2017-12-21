package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'h3' html element
 * 
 * @author simon
 *
 */
public class HtmlH3 extends HtmlPhrasingElement<HtmlH3> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element 
	 * @param hb		The html builder that created the element
	 */
	public HtmlH3(Html5Builder hb) {
		super(hb, "h3");		
	}

}
