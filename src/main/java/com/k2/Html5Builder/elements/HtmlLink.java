package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlGlobalElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQuery;
import com.k2.Html5Builder.elements.attrValues.CrossOrigin;
import com.k2.Html5Builder.elements.attrValues.HtmlLanguageCode;
import com.k2.Html5Builder.elements.attrValues.LinkRel;

/**
 * A class representing an 'link' html element
 * 
 * @author simon
 *
 */
public class HtmlLink extends HtmlGlobalElement<HtmlLink> {
	
	private LinkRel rel = null;
	
	/**
	 * set the 'crossOrigin' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlLink setCrossOrigin(CrossOrigin value) { attr("crossOrigin", value.getValue()); return this; }
	/**
	 * set the 'href' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlLink setHRef(String value) { attr("href", value); return this; }
	/**
	 * set the 'hrefLang' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlLink setHRefLang(HtmlLanguageCode value) { attr("hrefLang", value.getValue()); return this; }
	/**
	 * set the 'media' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlLink setMedia(MediaQuery value) { attr("media", value.query()); return this; }
	/**
	 * set the 'media' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlLink setMedia(String value) { attr("media", value); return this; }
	/**
	 * set the 'rel' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlLink setRel(LinkRel value) { rel = value; attr("rel", value.getValue()); return this; }
	/**
	 * set the 'sizes' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlLink setSizes(String value) { if (rel == LinkRel.ICON) attr("sizes", value); else warning("sizes is only applcable for link elements with rel: 'icon'"); return this; }
	/**
	 * set the 'type' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlLink setType(MediaType value) { attr("type", value.getTemplate()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element and identifies it as an empty element
	 * @param hb		The html builder that created the element
	 */
	public HtmlLink(Html5Builder hb) {
		super(hb, "link");
		emptyTag();
	}

}
