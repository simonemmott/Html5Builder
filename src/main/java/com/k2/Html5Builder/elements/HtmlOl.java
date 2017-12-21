package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.elements.attrValues.OlType;

/**
 * A class representing an 'ol' html element
 * 
 * @author simon
 *
 */
public class HtmlOl extends HtmlElement<HtmlOl> {
	
	/**
	 * set the 'reversed' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlOl setReversed() { attr("reversed", null); return this; }
	/**
	 * set the 'start' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlOl setStart(Integer value) { attr("start", value.toString()); return this; }
	/**
	 * set the 'type' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlOl setType(OlType value) { attr("type", value.getValue()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element and identifies it as an empty element
	 * @param hb		The html builder that created the element
	 */
	public HtmlOl(Html5Builder hb) {
		super(hb, "ol");		
	}

	/**
	 * Create an 'li' element as a child of this element
	 * @return The created child element
	 */
	public HtmlLi li() { return createAndAddChild(HtmlLi.class); }

}
