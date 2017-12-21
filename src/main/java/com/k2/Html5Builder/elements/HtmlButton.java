package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;
import com.k2.Html5Builder.elements.attrValues.ButtonType;
import com.k2.Html5Builder.elements.attrValues.FormEncType;
import com.k2.Html5Builder.elements.attrValues.FormMethod;
import com.k2.Html5Builder.elements.attrValues.Target;

/**
 * A class representing an 'button' html element
 * 
 * @author simon
 *
 */
public class HtmlButton extends HtmlPhrasingElement<HtmlButton> {
	
	/**
	 * set the 'autofocus' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlButton setAutoFocus() { attr("autoFocus", null); return this; }
	/**
	 * set the 'disabled' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlButton setDisabled() { attr("disabled", null); return this; }
	/**
	 * set the 'form' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlButton setForm(String value) { attr("form", value); return this; }
	/**
	 * set the 'formAction' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlButton setFormAction(String value) { warnValid("type", "submit", "formAction"); attr("formAction", value); return this; }
	/**
	 * set the 'formEncType' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlButton setFormEncType(FormEncType value) { warnValid("type", "submit", "formEncType"); attr("formEncType", value.getValue()); return this; }
	/**
	 * set the 'formMethod' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlButton setFormMethod(FormMethod value) { warnValid("type", "submit", "formMethod"); attr("formMethod", value.getValue()); return this; }
	/**
	 * set the 'formNoValidate' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlButton setFormNoValidate() { warnValid("type", "submit", "formNoValidate"); attr("formNoValidate", null); return this; }
	/**
	 * set the 'formTarget' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlButton setFormTarget(Target value) { warnValid("type", "submit", "formTarget"); attr("formTarget", value.getValue()); return this; }
	/**
	 * set the 'formTarget' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlButton setFormTarget(String value) { warnValid("type", "submit", "formTarget"); attr("formTarget", value); return this; }
	/**
	 * set the 'name' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlButton setName(String value) { attr("name", value); return this; }
	/**
	 * set the 'type' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlButton setType(ButtonType value) { attr("type", value.getValue()); return this; }
	/**
	 * set the 'value' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlButton setValue(String value) { attr("value", value); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining he html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlButton(Html5Builder hb) {
		super(hb, "button");		
	}

}
