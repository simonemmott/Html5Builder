package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

/**
 * A class representing an 'picture' html element
 * 
 * @author simon
 *
 */
public class HtmlPicture extends HtmlElement<HtmlPicture> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlPicture(Html5Builder hb) {
		super(hb, "picture");		
	}

	/**
	 * Create an 'source' element as a child of this element
	 * @return The created child element
	 */
	public HtmlSource source() { return createAndAddChild(HtmlSource.class); }
	/**
	 * Create an 'img' element as a child of this element
	 * @return The created child element
	 */
	public HtmlImg img() { return createAndAddChild(HtmlImg.class); }
	/**
	 * Create an 'script' element as a child of this element
	 * @return The created child element
	 */
	public HtmlScript script() { return createAndAddChild(HtmlScript.class); }
	/**
	 * Create an 'noscript' element as a child of this element
	 * @return The created child element
	 */
	public HtmlNoScript noScript() { return createAndAddChild(HtmlNoScript.class); }

}
