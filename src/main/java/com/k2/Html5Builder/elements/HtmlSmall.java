package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'small' html element
 * 
 * @author simon
 *
 */
public class HtmlSmall extends HtmlPhrasingElement<HtmlSmall> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlSmall(Html5Builder hb) {
		super(hb, "small");		
	}

}
