package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.elements.attrValues.Sandbox;

/**
 * A class representing an 'iframe' html element
 * 
 * @author simon
 *
 */
public class HtmlIFrame extends HtmlElement<HtmlIFrame> {
	
	/**
	 * set the 'height' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlIFrame setHeight(Integer value) { attr("height", value.toString()); return this; }
	/**
	 * set the 'name' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlIFrame setName(String value) { attr("name", value); return this; }
	/**
	 * set the 'sandbox' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlIFrame setSandbox(Sandbox value) { attr("sandbox", value.getValue()); return this; }
	/**
	 * set the 'src' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlIFrame setSrc(String value) { attr("src", value); return this; }
	/**
	 * set the 'srcDoc' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlIFrame setSrcDoc(String value) { attr("srcDoc", value); return this; }
	/**
	 * set the 'srcDoc' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	@SuppressWarnings("rawtypes")
	public HtmlIFrame setSrcDoc(HtmlElement value) { attr("srcDoc", value.toString()); return this; }
	/**
	 * set the 'width' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlIFrame setWidth(Integer value) { attr("width", value.toString()); return this; }


	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element 
	 * @param hb		The html builder that created the element
	 */
	public HtmlIFrame(Html5Builder hb) {
		super(hb, "iframe");	
		emptyTag();
	}

}
