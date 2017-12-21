package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'output' html element
 * 
 * @author simon
 *
 */
public class HtmlOutput extends HtmlPhrasingElement<HtmlOutput> {
	
	/**
	 * set the 'for' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlOutput setFor(String value) { attr("for", value); return this; }
	/**
	 * set the 'form' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlOutput setForm(String value) { attr("form", value); return this; }
	/**
	 * set the 'name' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlOutput setName(String value) { attr("name", value); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element and identifies it as an empty element
	 * @param hb		The html builder that created the element
	 */
	public HtmlOutput(Html5Builder hb) {
		super(hb, "output");		
	}

}
