package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'i' html element
 * 
 * @author simon
 *
 */
public class HtmlI extends HtmlPhrasingElement<HtmlI> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element 
	 * @param hb		The html builder that created the element
	 */
	public HtmlI(Html5Builder hb) {
		super(hb, "i");		
	}

}
