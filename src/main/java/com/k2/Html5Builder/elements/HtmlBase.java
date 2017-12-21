package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlGlobalElement;
import com.k2.Html5Builder.elements.attrValues.Target;

/**
 * A class representing an 'base' html element
 * 
 * @author simon
 *
 */
public class HtmlBase extends HtmlGlobalElement<HtmlBase> {
	
	/**
	 * set the 'href' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlBase setHref(String value) { attr("href", value); return this; }
	/**
	 * set the 'target' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlBase setTarget(Target value) { attr("target", value.getValue()); return this; }
	/**
	 * set the 'target' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlBase setTarget(String value) { attr("target", value); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining he html builder that
	 * created the element.
	 * @param hb		The html builder that created the element
	 */
	public HtmlBase(Html5Builder hb) {
		super(hb, "base");
		emptyTag();
	}

}
