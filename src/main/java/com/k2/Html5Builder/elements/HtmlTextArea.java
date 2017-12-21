package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.elements.attrValues.Wrap;

/**
 * A class representing an 'textarea' html element
 * 
 * @author simon
 *
 */
public class HtmlTextArea extends HtmlElement<HtmlTextArea> {
	
	/**
	 * set the 'autofocus' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlTextArea setAutofocus() { attr("autofocus", null); return this; }
	/**
	 * set the 'cols' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlTextArea setCols(Integer value) { attr("cols", value.toString()); return this; }
	/**
	 * set the 'dirName' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlTextArea setDirName(String value) { attr("dirName", value); return this; }
	/**
	 * set the 'disabled' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlTextArea setDisabled() { attr("disabled", null); return this; }
	/**
	 * set the 'form' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlTextArea setForm(String value) { attr("form", value); return this; }
	/**
	 * set the 'maxLength' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlTextArea setMaxLength(Integer value) { attr("maxLength", value.toString()); return this; }
	/**
	 * set the 'name' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlTextArea setName(String value) { attr("name", value); return this; }
	/**
	 * set the 'placeholder' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlTextArea setPlaceHolder(String value) { attr("placeHolder", value); return this; }
	/**
	 * set the 'readonly' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlTextArea setReadOnly() { attr("readOnly", null); return this; }
	/**
	 * set the 'required' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlTextArea setRequired() { attr("required", null); return this; }
	/**
	 * set the 'rows' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlTextArea setRows(Integer value) { attr("rows", value.toString()); return this; }
	/**
	 * set the 'wrap' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlTextArea setWrap(Wrap value) { attr("wrap", value.getValue()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlTextArea(Html5Builder hb) {
		super(hb, "textarea");		
	}

}
