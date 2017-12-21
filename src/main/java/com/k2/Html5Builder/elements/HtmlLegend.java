package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'legend' html element
 * 
 * @author simon
 *
 */
public class HtmlLegend extends HtmlPhrasingElement<HtmlLegend> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element and identifies it as an empty element
	 * @param hb		The html builder that created the element
	 */
	public HtmlLegend(Html5Builder hb) {
		super(hb, "legend");		
	}

}
