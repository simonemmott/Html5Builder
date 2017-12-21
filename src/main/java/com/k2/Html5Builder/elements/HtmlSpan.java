package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'span' html element
 * 
 * @author simon
 *
 */
public class HtmlSpan extends HtmlPhrasingElement<HtmlSpan> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element and identifies it as empty
	 * @param hb		The html builder that created the element
	 */
	public HtmlSpan(Html5Builder hb) {
		super(hb, "span");		
	}

}
