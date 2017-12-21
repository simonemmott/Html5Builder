package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'b' html element
 * 
 * @author simon
 *
 */
public class HtmlB extends HtmlPhrasingElement<HtmlB> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining he html builder that
	 * created the element.
	 * @param hb		The html builder that created the element
	 */
	public HtmlB(Html5Builder hb) {
		super(hb, "b");		
	}

}
