package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

/**
 * A class representing an 'col' html element
 * 
 * @author simon
 *
 */
public class HtmlCol extends HtmlElement<HtmlCol> {
	
	/**
	 * set the 'span' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlCol setSpan(Integer value) { attr("span", value.toString()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element and defining the element as empty
	 * @param hb		The html builder that created the element
	 */
	public HtmlCol(Html5Builder hb) {
		super(hb, "col");
		emptyTag();
	}

}
