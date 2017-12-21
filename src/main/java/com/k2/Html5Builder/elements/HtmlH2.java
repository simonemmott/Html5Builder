package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'h2' html element
 * 
 * @author simon
 *
 */
public class HtmlH2 extends HtmlPhrasingElement<HtmlH2> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element 
	 * @param hb		The html builder that created the element
	 */
	public HtmlH2(Html5Builder hb) {
		super(hb, "h2");		
	}

}
