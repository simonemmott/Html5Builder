package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

/**
 * A class representing an 'dl' html element
 * 
 * @author simon
 *
 */
public class HtmlDl extends HtmlElement<HtmlDl> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlDl(Html5Builder hb) {
		super(hb, "dl");		
	}

	/**
	 * Create an 'dd' element as a child of this element
	 * @return The created child element
	 */
	public HtmlDd dd() { return createAndAddChild(HtmlDd.class); }
	/**
	 * Create an 'dt' element as a child of this element
	 * @return The created child element
	 */
	public HtmlDt dt() { return createAndAddChild(HtmlDt.class); }

}
