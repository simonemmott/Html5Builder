package com.k2.Html5Builder.elements;

import java.util.Date;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElementNoTime;

/**
 * A class representing an 'time' html element
 * 
 * @author simon
 *
 */
public class HtmlTime extends HtmlPhrasingElementNoTime<HtmlTime> {
	
	/**
	 * set the 'dateTime' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlTime setDateTime(Date value) { attr("dateTime", dateTimeZone(value)); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlTime(Html5Builder hb) {
		super(hb, "time");	
	}

}
