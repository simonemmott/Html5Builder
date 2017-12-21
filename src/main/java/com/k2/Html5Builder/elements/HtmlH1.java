package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'h1' html element
 * 
 * @author simon
 *
 */
public class HtmlH1 extends HtmlPhrasingElement<HtmlH1> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element 
	 * @param hb		The html builder that created the element
	 */
	public HtmlH1(Html5Builder hb) {
		super(hb, "h1");		
	}

}
