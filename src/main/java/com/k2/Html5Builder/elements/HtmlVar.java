package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'var' html element
 * 
 * @author simon
 *
 */
public class HtmlVar extends HtmlPhrasingElement<HtmlVar> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlVar(Html5Builder hb) {
		super(hb, "var");		
	}

}
