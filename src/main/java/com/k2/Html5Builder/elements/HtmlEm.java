package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'em' html element
 * 
 * @author simon
 *
 */
public class HtmlEm extends HtmlPhrasingElement<HtmlEm> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlEm(Html5Builder hb) {
		super(hb, "em");		
	}

}
