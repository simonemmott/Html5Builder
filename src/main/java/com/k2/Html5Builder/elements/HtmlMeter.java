package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'meter' html element
 * 
 * @author simon
 *
 */
public class HtmlMeter extends HtmlPhrasingElement<HtmlMeter> {
	
	/**
	 * set the 'form' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlMeter setForm(String value) { attr("form", value); return this; }
	/**
	 * set the 'high' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlMeter setHigh(Double value) { attr("high", value.toString()); return this; }
	/**
	 * set the 'high' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlMeter setHigh(Integer value) { attr("high", value.toString()); return this; }
	/**
	 * set the 'low' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlMeter setLow(Double value) { attr("low", value.toString()); return this; }
	/**
	 * set the 'low' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlMeter setLow(Integer value) { attr("low", value.toString()); return this; }
	/**
	 * set the 'max' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlMeter setMax(Double value) { attr("max", value.toString()); return this; }
	/**
	 * set the 'max' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlMeter setMax(Integer value) { attr("max", value.toString()); return this; }
	/**
	 * set the 'min' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlMeter setMin(Double value) { attr("min", value.toString()); return this; }
	/**
	 * set the 'min' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlMeter setMin(Integer value) { attr("min", value.toString()); return this; }
	/**
	 * set the 'optimum' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlMeter setOptimum(Double value) { attr("optimum", value.toString()); return this; }
	/**
	 * set the 'optimum' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlMeter setOptimum(Integer value) { attr("optimum", value.toString()); return this; }
	/**
	 * set the 'value' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlMeter setValue(Double value) { attr("value", value.toString()); return this; }
	/**
	 * set the 'value' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlMeter setValue(Integer value) { attr("value", value.toString()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element and identifies it as an empty element
	 * @param hb		The html builder that created the element
	 */
	public HtmlMeter(Html5Builder hb) {
		super(hb, "meter");		
	}

}
