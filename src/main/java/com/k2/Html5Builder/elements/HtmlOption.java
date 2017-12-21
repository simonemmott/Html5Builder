package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

/**
 * A class representing an 'option' html element
 * 
 * @author simon
 *
 */
public class HtmlOption extends HtmlElement<HtmlOption> {
	
	/**
	 * set the 'disabled' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlOption setDisabled() { attr("disabled", null); return this; }
	/**
	 * set the 'label' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlOption setLabel(String value) { attr("label", value); return this; }
	/**
	 * set the 'selected' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlOption setSelected() { attr("selected", null); return this; }
	/**
	 * set the 'value' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlOption setValue(String value) { attr("value", value); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element and identifies it as an empty element
	 * @param hb		The html builder that created the element
	 */
	public HtmlOption(Html5Builder hb) {
		super(hb, "option");		
		emptyTag();
	}

}
