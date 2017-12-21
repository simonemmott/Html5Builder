package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.elements.attrValues.CrossOrigin;

/**
 * A class representing an 'img' html element
 * 
 * @author simon
 *
 */
public class HtmlImg extends HtmlElement<HtmlImg> {
	
	/**
	 * set the 'alt' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlImg setAlt(String value) { attr("alt", value); return this; }
	/**
	 * set the 'crossOrigin' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlImg setCrossOrigin(CrossOrigin value) { attr("crossOrigin", value.getValue()); return this; }
	/**
	 * set the 'height' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlImg setHeight(Integer value) { attr("height", value.toString()); return this; }
	/**
	 * set the 'isMap' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlImg setIsMap() { attr("isMap", null); return this; }
	/**
	 * set the 'longDesc' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlImg setLongDesc(String value) { attr("longDesc", value); return this; }
	/**
	 * set the 'sizes' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlImg setSizes(String value) { attr("sizes", value); return this; }
	/**
	 * set the 'src' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlImg setSrc(String value) { attr("src", value); return this; }
	/**
	 * set the 'srcSet' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlImg setSrcSet(String value) { attr("srcSet", value); return this; }
	/**
	 * set the 'useMap' attribute to the given value prefixed with the '#' symbol
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlImg setUseMap(String value) { attr("useMap", "#"+value); return this; }
	/**
	 * set the 'width' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlImg setWidth(Integer value) { attr("width", value.toString()); return this; }


	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element and identifies it as an empty element
	 * @param hb		The html builder that created the element
	 */
	public HtmlImg(Html5Builder hb) {
		super(hb, "img");
		emptyTag();
	}

}
