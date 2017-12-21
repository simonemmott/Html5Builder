package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQuery;
import com.k2.Html5Builder.elements.attrValues.*;

/**
 * A class representing an 'address' html element
 * 
 * @author simon
 *
 */
public class HtmlArea extends HtmlElement<HtmlArea> {
	
	/**
	 * set the 'alt' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlArea setAlt(String value) { attr("alt", value); return this; }
	/**
	 * set the 'coords' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlArea setCoords(String value) { attr("coords", value); return this; }
	/**
	 * set the 'download' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlArea setDownload(String value) { attr("download", value); return this; }
	/**
	 * set the 'href' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlArea setHref(String value) { attr("href", value); return this; }
	/**
	 * set the 'media' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlArea setMedia(MediaQuery value) { attr("media", value.query()); return this; }
	/**
	 * set the 'rel' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlArea setRel(ARel value) { attr("rel", value.getValue()); return this; }
	/**
	 * set the 'shape' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlArea setShape(Shape value) { attr("shape", value.getValue()); return this; }
	/**
	 * set the 'target' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlArea setTarget(Target value) { attr("target", value.getValue()); return this; }
	/**
	 * set the 'target' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlArea setTarget(String value) { attr("target", value); return this; }
	/**
	 * set the 'target' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlArea setType(MediaType value) { attr("type", value.getTemplate()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining he html builder that
	 * created the element and identifying the element as empty.
	 * @param hb		The html builder that created the element
	 */
	public HtmlArea(Html5Builder hb) {
		super(hb, "area");	
		emptyTag();
	}

}
