package com.k2.Html5Builder.elements;

import java.io.PrintWriter;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlFlowElement;

/**
 * A class representing an 'map' html element
 * 
 * @author simon
 *
 */
public class HtmlMap extends HtmlFlowElement<HtmlMap> {
	
	/**
	 * set the 'name' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlMap setName(String value) { attr("name", value); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element and identifies it as an empty element
	 * @param hb		The html builder that created the element
	 */
	public HtmlMap(Html5Builder hb) {
		super(hb, "map");		
	}

	/**
	 * Override the toXml method to warn if the name attribute is note set when the output is generated
	 */
	@Override
	public PrintWriter toXml(PrintWriter pw) { 
		if (get("name") == null) warning("'name' is required for 'map' elements");
		return super.toXml(pw); 
	}

}
