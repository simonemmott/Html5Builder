package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

/**
 * A class representing an 'wbr' html element
 * 
 * @author simon
 *
 */
public class HtmlWbr extends HtmlElement<HtmlWbr> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element and identifies it as an empty element
	 * @param hb		The html builder that created the element
	 */
	public HtmlWbr(Html5Builder hb) {
		super(hb, "wbr");		
		emptyTag();
	}

}
