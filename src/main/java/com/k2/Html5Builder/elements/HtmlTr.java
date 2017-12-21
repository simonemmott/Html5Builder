package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

/**
 * A class representing an 'tr' html element
 * 
 * @author simon
 *
 */
public class HtmlTr extends HtmlElement<HtmlTr> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlTr(Html5Builder hb) {
		super(hb, "tr");		
	}

	/**
	 * Create an 'td' element as a child of this element
	 * @return The created child element
	 */
	public HtmlTd td() { return createAndAddChild(HtmlTd.class); }
	/**
	 * Create an 'th' element as a child of this element
	 * @return The created child element
	 */
	public HtmlTh th() { return createAndAddChild(HtmlTh.class); }

}
