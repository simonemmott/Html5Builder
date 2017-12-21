package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'del' html element
 * 
 * @author simon
 *
 */
public class HtmlDetails extends HtmlPhrasingElement<HtmlDetails> {
	
	/**
	 * set the 'open' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlDetails setOpen() { attr("open", null); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlDetails(Html5Builder hb) {
		super(hb, "details");		
	}

	/**
	 * Create a 'summary' element as a child of this element
	 * @return The created child element
	 */
	public HtmlSummary summary() { return createAndAddChild(HtmlSummary.class); }

}
