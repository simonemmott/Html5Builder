package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'h4' html element
 * 
 * @author simon
 *
 */
public class HtmlH4 extends HtmlPhrasingElement<HtmlH4> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element 
	 * @param hb		The html builder that created the element
	 */
	public HtmlH4(Html5Builder hb) {
		super(hb, "h4");		
	}

}
