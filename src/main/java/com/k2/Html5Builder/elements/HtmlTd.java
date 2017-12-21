package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlFlowElement;

/**
 * A class representing an 'td' html element
 * 
 * @author simon
 *
 */
public class HtmlTd extends HtmlFlowElement<HtmlTd> {
	
	/**
	 * set the 'colSpan' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlTd setColSpan(Integer value) { attr("colSpan", value.toString()); return this; }
	/**
	 * set the 'headers' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlTd setHeaders(String value) { attr("headers", value); return this; }
	/**
	 * set the 'rowSpan' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlTd setRowSpan(Integer value) { attr("rowSpan", value.toString()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlTd(Html5Builder hb) {
		super(hb, "td");		
	}

}
