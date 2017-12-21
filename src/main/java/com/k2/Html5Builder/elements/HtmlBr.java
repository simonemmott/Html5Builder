package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

/**
 * A class representing an 'br' html element
 * 
 * @author simon
 *
 */
public class HtmlBr extends HtmlElement<HtmlBr> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining he html builder that
	 * created the element and identify it as an empty element
	 * @param hb		The html builder that created the element
	 */
	public HtmlBr(Html5Builder hb) {
		super(hb, "br");		
		emptyTag();
	}

}
