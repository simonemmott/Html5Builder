package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'progress' html element
 * 
 * @author simon
 *
 */
public class HtmlProgress extends HtmlPhrasingElement<HtmlProgress> {
	
	/**
	 * set the 'max' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlProgress setMax(Double value) { attr("max", value.toString()); return this; }
	/**
	 * set the 'max' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlProgress setMax(Integer value) { attr("max", value.toString()); return this; }
	/**
	 * set the 'value' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlProgress setValue(Double value) { attr("value", value.toString()); return this; }
	/**
	 * set the 'value' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlProgress setValue(Integer value) { attr("value", value.toString()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlProgress(Html5Builder hb) {
		super(hb, "progress");		
	}

}
