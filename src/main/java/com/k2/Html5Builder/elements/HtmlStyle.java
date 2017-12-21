package com.k2.Html5Builder.elements;

import java.io.PrintWriter;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQuery;

/**
 * A class representing an 'style' html element
 * 
 * @author simon
 *
 */
public class HtmlStyle extends HtmlElement<HtmlStyle> {
	
	/**
	 * set the 'media' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlStyle setMedia(MediaQuery value) { attr("media", value.query()); return this; }
	/**
	 * set the 'scoped' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlStyle setScoped() { attr("scoped", null); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element and setting the type to 'text/css'
	 * @param hb		The html builder that created the element
	 */
	public HtmlStyle(Html5Builder hb) {
		super(hb, "style");	
		attr("type", "text/css");
	}
	
	@Override
	public PrintWriter toXml(PrintWriter pw) {
		if (!has("scoped") && !parent().getClass().equals(HtmlHead.class)) {
			warning("style elemnts can only be added within the body of an Html document if the 'scoped' attribute is set");
		}
		return super.toXml(pw);
	}

}
