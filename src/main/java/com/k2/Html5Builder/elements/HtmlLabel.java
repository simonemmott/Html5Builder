package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'label' html element
 * 
 * @author simon
 *
 */
public class HtmlLabel extends HtmlPhrasingElement<HtmlLabel> {
	
	/**
	 * set the 'for' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlLabel setFor(String value) { attr("for", value); return this; }
	/**
	 * set the 'form' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlLabel setForm(String value) { attr("form", value); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element and identifies it as an empty element
	 * @param hb		The html builder that created the element
	 */
	public HtmlLabel(Html5Builder hb) {
		super(hb, "label");		
	}

}
