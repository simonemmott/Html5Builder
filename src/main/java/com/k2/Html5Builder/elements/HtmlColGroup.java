package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

/**
 * A class representing an 'colgroup' html element
 * 
 * @author simon
 *
 */
public class HtmlColGroup extends HtmlElement<HtmlColGroup> {
	
	/**
	 * set the 'span' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlColGroup setSpan(Integer value) { attr("span", value.toString()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlColGroup(Html5Builder hb) {
		super(hb, "colgroup");		
	}
	
	/**
	 * Create an 'col' element as a child of this element
	 * @return The created child element
	 */
	public HtmlCol col() { return createAndAddChild(HtmlCol.class); }


}
