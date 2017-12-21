package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlFlowElement;

/**
 * A class representing an 'main' html element
 * 
 * @author simon
 *
 */
public class HtmlMain extends HtmlFlowElement<HtmlMain> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element and identifies it as an empty element
	 * @param hb		The html builder that created the element
	 */
	public HtmlMain(Html5Builder hb) {
		super(hb, "main");		
	}

}
