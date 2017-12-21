package com.k2.Html5Builder.elements;

import java.util.Date;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlFlowElement;

/**
 * A class representing an 'ins' html element
 * 
 * @author simon
 *
 */
public class HtmlIns extends HtmlFlowElement<HtmlIns> {
	
	/**
	 * set the 'cite' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlIns setCite(String value) { attr("cite", value); return this; }
	/**
	 * set the 'dateTime' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlIns setDateTime(Date value) { attr("dateTime", hb().dateTimeZone(value)); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element and identifies it as an empty element
	 * @param hb		The html builder that created the element
	 */
	public HtmlIns(Html5Builder hb) {
		super(hb, "ins");		
	}

}
