package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

/**
 * A class representing an 'tbody' html element
 * 
 * @author simon
 *
 */
public class HtmlTBody extends HtmlElement<HtmlTBody> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlTBody(Html5Builder hb) {
		super(hb, "tbody");	
	}
	
	/**
	 * Create an 'tr' element as a child of this element
	 * @return The created child element
	 */
	public HtmlTr tr() { return createAndAddChild(HtmlTr.class); }

}
