package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

/**
 * A class representing an 'optgroup' html element
 * 
 * @author simon
 *
 */
public class HtmlOptGroup extends HtmlElement<HtmlOptGroup> {
	
	/**
	 * set the 'disabled' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlOptGroup setDisabled() { attr("disabled", null); return this; }
	/**
	 * set the 'label' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlOptGroup setLabel(String value) { attr("label", value); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlOptGroup(Html5Builder hb) {
		super(hb, "optgroup");		
	}

	/**
	 * Create an 'option' element as a child of this element
	 * @return The created child element
	 */
	public HtmlOption option() { return createAndAddChild(HtmlOption.class); }

}
