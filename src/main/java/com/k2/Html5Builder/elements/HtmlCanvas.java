package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlFlowElement;

/**
 * A class representing an 'canvas' html element
 * 
 * @author simon
 *
 */
public class HtmlCanvas extends HtmlFlowElement<HtmlCanvas> {
	
	/**
	 * set the 'height' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlCanvas setHeight(Integer value) { attr("height", value.toString()); return this; }
	/**
	 * set the 'width' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlCanvas setWidth(Integer value) { attr("width", value.toString()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining he html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlCanvas(Html5Builder hb) {
		super(hb, "canvas");		
	}

}
