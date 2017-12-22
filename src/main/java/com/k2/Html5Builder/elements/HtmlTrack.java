package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.elements.attrValues.HtmlLanguageCode;
import com.k2.Html5Builder.elements.attrValues.Kind;

/**
 * A class representing an 'track' html element
 * 
 * @author simon
 *
 */
public class HtmlTrack extends HtmlElement<HtmlTrack> {
	
	/**
	 * set the 'default' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlTrack setDefault() { attr("default", null); return this; }
	/**
	 * set the 'kind' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlTrack setKind(Kind value) { attr("kind", value.getValue()); return this; }
	/**
	 * set the 'label' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlTrack setLabel(String value) { attr("label", value); return this; }
	/**
	 * set the 'src' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlTrack setSrc(String value) { attr("src", value); return this; }
	/**
	 * set the 'srcLang' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlTrack setSrcLang(HtmlLanguageCode value) { attr("srcLang", value.getValue()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlTrack(Html5Builder hb) {
		super(hb, "track");	
		emptyTag();
	}

}
