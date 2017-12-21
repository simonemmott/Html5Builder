package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

/**
 * A class representing an 'select' html element
 * 
 * @author simon
 *
 */
public class HtmlSelect extends HtmlElement<HtmlSelect> {
	
	/**
	 * set the 'autofocus' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlSelect setAutofocus() { attr("autofocus", null); return this; }
	/**
	 * set the 'disabled' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlSelect setDisabled() { attr("disabled", null); return this; }
	/**
	 * set the 'form' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlSelect setForm(String value) { attr("form", value); return this; }
	/**
	 * set the 'multiple' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlSelect setMultiple() { attr("multiple", null); return this; }
	/**
	 * set the 'name' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlSelect setName(String value) { attr("name", value); return this; }
	/**
	 * set the 'required' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlSelect setRequired() { attr("required", null); return this; }
	/**
	 * set the 'size' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlSelect setSize(Integer value) { attr("size", value.toString()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlSelect(Html5Builder hb) {
		super(hb, "select");		
	}
	
	/**
	 * Create an 'optGroup' element as a child of this element
	 * @return The created child element
	 */
	public HtmlOptGroup optGroup() { return createAndAddChild(HtmlOptGroup.class); }
	/**
	 * Create an 'option' element as a child of this element
	 * @return The created child element
	 */
	public HtmlOption option() { return createAndAddChild(HtmlOption.class); }


}
