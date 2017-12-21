package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 's' html element
 * 
 * @author simon
 *
 */
public class HtmlS extends HtmlPhrasingElement<HtmlS> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlS(Html5Builder hb) {
		super(hb, "s");		
	}

}
