package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlFlowElement;

/**
 * A class representing an 'bdo' html element
 * 
 * @author simon
 *
 */
public class HtmlBlockQuote extends HtmlFlowElement<HtmlBlockQuote> {
	
	/**
	 * set the 'cite' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlBlockQuote setCite(String value) { attr("cite", value); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining he html builder that
	 * created the element.
	 * @param hb		The html builder that created the element
	 */
	public HtmlBlockQuote(Html5Builder hb) {
		super(hb, "blockquote");		
	}

}
