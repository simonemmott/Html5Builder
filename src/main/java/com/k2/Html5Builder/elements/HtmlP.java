package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'p' html element
 * 
 * @author simon
 *
 */
public class HtmlP extends HtmlPhrasingElement<HtmlP> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlP(Html5Builder hb) {
		super(hb, "p");		
	}

}
