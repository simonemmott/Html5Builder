package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlFlowElement;

/**
 * A class representing an 'figure' html element
 * 
 * @author simon
 *
 */
public class HtmlFigure extends HtmlFlowElement<HtmlFigure> {
	
	/**
	 * set the 'alt' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlFigure setAlt(String value) { attr("alt", value); return this; }
	/**
	 * set the 'height' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlFigure setHeight(Integer value) { attr("height", value.toString()); return this; }
	/**
	 * set the 'src' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlFigure setSrc(String value) { attr("src", value); return this; }
	/**
	 * set the 'width' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlFigure setWidth(Integer value) { attr("width", value.toString()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element 
	 * @param hb		The html builder that created the element
	 */
	public HtmlFigure(Html5Builder hb) {
		super(hb, "figure");		
	}
	
	/**
	 * Create an 'figcaption' element as a child of this element
	 * @return The created child element
	 */
	public HtmlFigCaption figCaption() { return createAndAddChild(HtmlFigCaption.class); }

}
