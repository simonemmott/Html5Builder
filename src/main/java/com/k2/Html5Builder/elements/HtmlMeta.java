package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.elements.attrValues.HttpEquiv;
import com.k2.Html5Builder.elements.attrValues.MetaName;

/**
 * A class representing an 'meta' html element
 * 
 * @author simon
 *
 */
public class HtmlMeta extends HtmlElement<HtmlMeta> {
	
	/**
	 * set the 'charSet' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlMeta setCharSet(String value) { attr("charSet", value); return this; }
	/**
	 * set the 'content' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlMeta setContent(String value) { attr("content", value); return this; }
	/**
	 * set the 'http-equiv' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlMeta setHttpEquiv(HttpEquiv value) { attr("http-equiv", value.getValue()); return this; }
	/**
	 * set the 'name' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlMeta setName(MetaName value) { attr("name", value.getValue()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element and identifies it as an empty element
	 * @param hb		The html builder that created the element
	 */
	public HtmlMeta(Html5Builder hb) {
		super(hb, "meta");
		emptyTag();
	}

}
