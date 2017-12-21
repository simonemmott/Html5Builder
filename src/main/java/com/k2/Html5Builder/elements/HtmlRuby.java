package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'ruby' html element
 * 
 * @author simon
 *
 */
public class HtmlRuby extends HtmlPhrasingElement<HtmlRuby> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlRuby(Html5Builder hb) {
		super(hb, "ruby");		
	}

	/**
	 * Create an 'rp' element as a child of this element
	 * @return The created child element
	 */
	public HtmlRp rp() { return createAndAddChild(HtmlRp.class); }
	/**
	 * Create an 'rt' element as a child of this element
	 * @return The created child element
	 */
	public HtmlRt rt() { return createAndAddChild(HtmlRt.class); }

}
