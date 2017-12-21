package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'abbr' html element
 * 
 * @author simon
 *
 */
public class HtmlAbbr extends HtmlPhrasingElement<HtmlAbbr> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining he html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlAbbr(Html5Builder hb) {
		super(hb, "abbr");		
	}

}
