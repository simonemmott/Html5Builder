package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.MediaTypes.MediaType;

/**
 * A class representing an 'script' html element
 * 
 * @author simon
 *
 */
public class HtmlScript extends HtmlElement<HtmlScript> {
	
	/**
	 * set the 'async' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlScript setAsync() { attr("async",null); return this; }
	/**
	 * set the 'charSet' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlScript setCharSet(String value) { attr("charSet", value); return this; }
	/**
	 * set the 'defer' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlScript setDefer() { attr("defer", null); return this; }
	/**
	 * set the 'src' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlScript setSrc(String value) { attr("src", value); return this; }
	/**
	 * set the 'type' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlScript setType(MediaType value) { attr("type", value.getTemplate()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlScript(Html5Builder hb) {
		super(hb, "script");		
	}

}
