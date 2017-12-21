package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlFlowElement;
import com.k2.Html5Builder.elements.attrValues.FormEncType;
import com.k2.Html5Builder.elements.attrValues.FormMethod;
import com.k2.Html5Builder.elements.attrValues.Target;

/**
 * A class representing an 'form' html element
 * 
 * @author simon
 *
 */
public class HtmlForm extends HtmlFlowElement<HtmlForm> {
	
	/**
	 * set the 'accept-charset' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlForm setAcceptCharset(String value) { attr("accept-charset", value); return this; }
	/**
	 * set the 'action' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlForm setAction(String value) { attr("action", value); return this; }
	/**
	 * set the 'autocomplete' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlForm setAutocomplete() { attr("autocomplete", null); return this; }
	/**
	 * set the 'encType' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlForm setEncType(FormEncType value) { attr("encType", value.getValue()); return this; }
	/**
	 * set the 'method' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlForm setMethod(FormMethod value) { attr("method", value.getValue()); return this; }
	/**
	 * set the 'name' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlForm setName(String value) { attr("name", value); return this; }
	/**
	 * set the 'noValidate' attribute to the given value
	 * 
	 * @return This element for method chaining
	 */
	public HtmlForm setNoValidate() { attr("noValidate", null); return this; }
	/**
	 * set the 'target' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlForm setTarget(Target value) { attr("target", value.getValue()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element 
	 * @param hb		The html builder that created the element
	 */
	public HtmlForm(Html5Builder hb) {
		super(hb, "form");		
	}

}
