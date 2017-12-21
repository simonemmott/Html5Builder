package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

/**
 * A class representing an 'ul' html element
 * 
 * @author simon
 *
 */
public class HtmlUl extends HtmlElement<HtmlUl> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlUl(Html5Builder hb) {
		super(hb, "ul");		
	}

	/**
	 * Create an 'li' element as a child of this element
	 * @return The created child element
	 */
	public HtmlLi li() { return createAndAddChild(HtmlLi.class); }

}
