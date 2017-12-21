package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.MediaTypes.MediaType;

/**
 * A class representing an 'embed' html element
 * 
 * @author simon
 *
 */
public class HtmlEmbed extends HtmlElement<HtmlEmbed> {
	
	/**
	 * set the 'height' attribute on
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlEmbed setHeight(Integer value) { attr("height", value.toString()); return this; }
	/**
	 * set the 'url' attribute on
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlEmbed setUrl(String value) { attr("src", value); return this; }	
	/**
	 * set the 'width' attribute on
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlEmbed setWidth(Integer value) { attr("width", value.toString()); return this; }
	/**
	 * set the 'type' attribute on
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlEmbed setType(MediaType value) { attr("type", value.getTemplate()); return this; }
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element and identify it as an empty element
	 * @param hb		The html builder that created the element
	 */
	public HtmlEmbed(Html5Builder hb) {
		super(hb, "embed");	
		emptyTag();
	}

}
