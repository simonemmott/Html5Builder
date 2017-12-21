package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'q' html element
 * 
 * @author simon
 *
 */
public class HtmlQ extends HtmlPhrasingElement<HtmlQ> {
	
	/**
	 * set the 'cite' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlQ setCite(String value) { attr("cite", value); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlQ(Html5Builder hb) {
		super(hb, "q");		
	}

}
