package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'pre' html element
 * 
 * @author simon
 *
 */
public class HtmlPre extends HtmlPhrasingElement<HtmlPre> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlPre(Html5Builder hb) {
		super(hb, "pre");		
	}

}
