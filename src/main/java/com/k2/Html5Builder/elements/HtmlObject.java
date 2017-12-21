package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlFlowElement;
import com.k2.Html5Builder.MediaTypes.MediaType;

/**
 * A class representing an 'object' html element
 * 
 * @author simon
 *
 */
public class HtmlObject extends HtmlFlowElement<HtmlObject> {
	
	/**
	 * set the 'data' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlObject setData(String value) { attr("data", value); return this; }
	/**
	 * set the 'form' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlObject setForm(String value) { attr("form", value); return this; }
	/**
	 * set the 'height' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlObject setHeight(Integer value) { attr("height", value.toString()); return this; }
	/**
	 * set the 'name' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlObject setName(String value) { attr("name", value); return this; }
	/**
	 * set the 'type' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlObject setType(MediaType value) { attr("type", value.getTemplate()); return this; }
	/**
	 * set the 'useMap' attribute to the given value prefixed with the '#' symbol
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlObject setUseMap(String value) { attr("useMap", "#"+value); return this; }
	/**
	 * set the 'width' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlObject setWidth(Integer value) { attr("width", value.toString()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element and identifies it as an empty element
	 * @param hb		The html builder that created the element
	 */
	public HtmlObject(Html5Builder hb) {
		super(hb, "object");		
	}

	/**
	 * Create an 'param' element as a child of this element
	 * @return The created child element
	 */
	public HtmlParam param() { return createAndAddChild(HtmlParam.class); }

}
