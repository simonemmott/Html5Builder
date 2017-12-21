package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlFlowElement;

/**
 * A class representing an 'fieldset' html element
 * 
 * @author simon
 *
 */
public class HtmlFieldSet extends HtmlFlowElement<HtmlFieldSet> {
	
	/**
	 * set the 'disabled' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlFieldSet setDisabled() { attr("disabled", null); return this; }
	/**
	 * set the 'form' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlFieldSet setForm(String value) { attr("form", value); return this; }	
	/**
	 * set the 'name' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlFieldSet setName(String value) { attr("name", value); return this; }
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlFieldSet(Html5Builder hb) {
		super(hb, "fieldset");		
	}

	/**
	 * Create an 'legend' element as a child of this element
	 * @return The created child element
	 */
	public HtmlLegend legend() { return createAndAddChild(HtmlLegend.class); }

}
