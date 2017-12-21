package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'bdi' html element
 * 
 * @author simon
 *
 */
public class HtmlBdi extends HtmlPhrasingElement<HtmlBdi> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining he html builder that
	 * created the element.
	 * @param hb		The html builder that created the element
	 */
	public HtmlBdi(Html5Builder hb) {
		super(hb, "bdi");
	}

}
