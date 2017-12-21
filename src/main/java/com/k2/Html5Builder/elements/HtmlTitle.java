package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

/**
 * A class representing an 'title' html element
 * 
 * @author simon
 *
 */
public class HtmlTitle extends HtmlElement<HtmlTitle> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlTitle(Html5Builder hb) {
		super(hb, "title");		
	}

}
