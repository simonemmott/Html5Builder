package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'sub' html element
 * 
 * @author simon
 *
 */
public class HtmlSub extends HtmlPhrasingElement<HtmlSub> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlSub(Html5Builder hb) {
		super(hb, "sub");		
	}

}
