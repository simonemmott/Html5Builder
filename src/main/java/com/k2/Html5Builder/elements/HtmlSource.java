package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQuery;

/**
 * A class representing an 'source' html element
 * 
 * @author simon
 *
 */
public class HtmlSource extends HtmlElement<HtmlSource> {
	
	/**
	 * set the 'src' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlSource setSrc(String value) { attr("src", value); return this; }
	/**
	 * set the 'srcSet' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlSource setSrcSet(String value) { attr("srcSet", value); return this; }
	/**
	 * set the 'media' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlSource setMedia(MediaQuery value) { attr("media", value.query()); return this; }
	/**
	 * set the 'multiple' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlSource setMultiple() { attr("multiple", null); return this; }
	/**
	 * set the 'sizes' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlSource setSizes(String value) { attr("sizes", value); return this; }
	/**
	 * set the 'type' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlSource setType(MediaType value) { attr("type", value.getTemplate()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element and identifies it as empty
	 * @param hb		The html builder that created the element
	 */
	public HtmlSource(Html5Builder hb) {
		super(hb, "source");	
		emptyTag();
	}

}
