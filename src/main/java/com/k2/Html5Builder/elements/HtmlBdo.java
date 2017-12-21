package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;
import com.k2.Html5Builder.elements.attrValues.Dir;

/**
 * A class representing an 'bdo' html element
 * 
 * @author simon
 *
 */
public class HtmlBdo extends HtmlPhrasingElement<HtmlBdo> {
	
	/**
	 * set the 'dir' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlBdo setDir(Dir value) { attr("dir", value.getValue()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining he html builder that
	 * created the element.
	 * @param hb		The html builder that created the element
	 */
	public HtmlBdo(Html5Builder hb) {
		super(hb, "bdo");		
	}

}
