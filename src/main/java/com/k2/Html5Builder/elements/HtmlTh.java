package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlFlowElement;
import com.k2.Html5Builder.elements.attrValues.Scope;

/**
 * A class representing an 'th' html element
 * 
 * @author simon
 *
 */
public class HtmlTh extends HtmlFlowElement<HtmlTh> {
	
	/**
	 * set the 'abbr' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlTh setAbbr(String value) { attr("abbr", value); return this; }
	/**
	 * set the 'colSpan' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlTh setColSpan(Integer value) { attr("colSpan", value.toString()); return this; }
	/**
	 * set the 'headers' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlTh setHeaders(String value) { attr("headers", value); return this; }
	/**
	 * set the 'rowSpan' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlTh setRowSpan(Integer value) { attr("rowSpan", value.toString()); return this; }
	/**
	 * set the 'scope' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlTh setScope(Scope value) { attr("scope", value.getValue()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlTh(Html5Builder hb) {
		super(hb, "th");		
	}

}
