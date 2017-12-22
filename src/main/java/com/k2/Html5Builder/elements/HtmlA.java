package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlFlowElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQuery;
import com.k2.Html5Builder.elements.attrValues.ARel;
import com.k2.Html5Builder.elements.attrValues.HtmlLanguageCode;
import com.k2.Html5Builder.elements.attrValues.Target;
import com.k2.Html5Builder.elements.attrValues.Type;

/**
 * A class representing an 'a' html element
 * 
 * @author simon
 *
 */
public class HtmlA extends HtmlFlowElement<HtmlA> {
	
	/**
	 * set the 'download' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlA setDownload(String value) { attr("download", value); return this; }
	/**
	 * set the 'href' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlA setHref(String value) { attr("href", value); return this; }
	/**
	 * set the 'hreflang' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlA setHrefLang(HtmlLanguageCode value) { attr("hrefLang", value.getValue()); return this; }
	/**
	 * set the 'media' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlA setMedia(MediaQuery value) { attr("media", value.query()); return this; }
	/**
	 * set the 'rel' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlA setRel(ARel value) { attr("rel", value.getValue()); return this; }
	/**
	 * set the 'target' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlA setTarget(Target value) { attr("target", value.getValue()); return this; }
	/**
	 * set the 'target' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlA setTarget(String value) { attr("target", value); return this; }
	/**
	 * set the 'typ' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlA setType(MediaType value) { attr("type", value.getTemplate()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining he html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlA(Html5Builder hb) {
		super(hb, "a");		
	}

}
