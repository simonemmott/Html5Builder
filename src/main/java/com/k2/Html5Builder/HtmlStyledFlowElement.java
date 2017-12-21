package com.k2.Html5Builder;


import com.k2.Html5Builder.elements.*;
import com.k2.XMLBuilder.XMLElement;

/**
 * This abstract class defines styled flow elements
 * 
 * This class adds the methods to create the child elements appropriate to flow elements plus the style element
 * 
 * @author simon
 *
 * @param <T> The final class implementing the html element
 */
public abstract class HtmlStyledFlowElement<T extends XMLElement> extends HtmlFlowElement<T> {

	
	/**
	 * Pass the attributes through to the HtmlElement constructor
	 * @param hb		The html builder that created this instance
	 * @param tag	The tag of the final html element
	 */
	protected HtmlStyledFlowElement(Html5Builder hb, String tag) {
		super(hb, tag);
	}
		
	/**
	 * Create a 'style' element as a child of this element
	 * @return The created child element
	 */
	public HtmlStyle style() { return createAndAddChild(HtmlStyle.class); }


}
