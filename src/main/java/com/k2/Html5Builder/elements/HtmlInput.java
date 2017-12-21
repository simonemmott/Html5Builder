package com.k2.Html5Builder.elements;

import java.util.Date;

import com.k2.Html5Builder.DateFormat;
import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.elements.attrValues.Accept;
import com.k2.Html5Builder.elements.attrValues.FormEncType;
import com.k2.Html5Builder.elements.attrValues.FormMethod;
import com.k2.Html5Builder.elements.attrValues.OnOff;
import com.k2.Html5Builder.elements.attrValues.Target;
import com.k2.Html5Builder.elements.attrValues.Type;

/**
 * A class representing an 'img' html element
 * 
 * @author simon
 *
 */
public class HtmlInput extends HtmlElement<HtmlInput> {
	
	private Type type = Type.TEXT;
	
	/**
	 * set the 'accept' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setAccept(String value) { attr("accept", "."+value); return this; }
	/**
	 * set the 'accept' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setAccept(MediaType value) { attr("accept", value.getTemplate()); return this; }
	/**
	 * set the 'accept' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setAccept(Accept value) { attr("accept", value.getValue()); return this; }
	/**
	 * set the 'alt' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setAlt(String value) { attr("alt", value); return this; }
	/**
	 * set the 'autocomplete' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setAutoComplete(OnOff value) { attr("autocomplete", value.getValue()); return this; }
	/**
	 * set the 'autofocus' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlInput setAutofocus() { attr("autofocus", null); return this; }
	/**
	 * set the 'checked' attribute on
	 * 
	 * If the checked attribute is not applicable to the input type a warning is logged to the warning log
	 * 
	 * @return This element for method chaining
	 */
	public HtmlInput setChecked() { 
		switch(type) {
		case CHECKBOX: case RADIO: attr("checked", null); break; 
		default: warning("Checked is only applicable to inputs of type 'checkbox' or 'radio'");
		} 
		return this; 
	}
	/**
	 * set the 'dirName' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setDirName(String value) { attr("dirName", value); return this; }
	/**
	 * set the 'disabled' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlInput setDisabled() { attr("disabled", null); return this; }
	/**
	 * set the 'form' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setForm(String value) { attr("form", value); return this; }
	/**
	 * set the 'formAction' attribute to the given value
	 * 
	 * If the input type is not 'submit' or 'image' This method will log a warning to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setFormAction(String value) { 
		switch(type) {
		case SUBMIT: case IMAGE: attr("formAction", value); break; 
		default: warning("formAction is only applicable to inputs of type 'submit' or 'image'");
		} 
		return this; 
	}
	/**
	 * set the 'formEncType' attribute to the given value
	 * 
	 * If the input type is not 'submit' or 'image' This method will log a warning to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setFormEncType(FormEncType value) { 
		switch(type) {
		case SUBMIT: case IMAGE: attr("formEncType", value.getValue()); break; 
		default: warning("formEncType is only applicable to inputs of type 'submit' or 'image'");
		} 
		return this; 
	}
	/**
	 * set the 'formMathod' attribute to the given value
	 * 
	 * If the input type is not 'submit' or 'image' This method will log a warning to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setFormMethod(FormMethod value) { 
		switch(type) {
		case SUBMIT: case IMAGE: attr("formMethod", value.getValue()); break; 
		default: warning("formMethod is only applicable to inputs of type 'submit' or 'image'");
		} 
		return this; 
	}
	/**
	 * set the 'formNoValidate' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlInput setFormNoValidate() { attr("formNoValidate", null); return this; }
	/**
	 * set the 'formTarget' attribute to the given value
	 * 
	 * If the input type is not 'submit' or 'image' This method will log a warning to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setFormTarget(String value) { 
		switch(type) {
		case SUBMIT: case IMAGE: attr("formTarget", value); break; 
		default: warning("formTargetis only applicable to inputs of type 'submit' or 'image'");
		} 
		return this; 
	}
	/**
	 * set the 'formTarget' attribute to the given value
	 * 
	 * If the input type is not 'submit' or 'image' This method will log a warning to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setFormTarget(Target value) { 
		switch(type) {
		case SUBMIT: case IMAGE: attr("formTarget", value.getValue()); break; 
		default: warning("formTargetis only applicable to inputs of type 'submit' or 'image'");
		} 
		return this; 
	}
	/**
	 * set the 'height' attribute to the given value
	 * 
	 * If the input type is not 'image' This method will log a warning to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setHeight(Integer value) { 
		switch(type) {
		case IMAGE: attr("height", value.toString()); break; 
		default: warning("height is only applicable to inputs of type 'image'");
		} 
		return this; 
	}
	/**
	 * set the 'list' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setList(String value) { attr("list", value); return this; }
	/**
	 * set the 'max' attribute to the given value
	 * 
	 * If the input type is not 'number' This method will log a warning to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setMax(Integer value) { 
		switch(type) {
		case NUMBER: attr("max", value.toString()); break; 
		default: warning("max(number) is only applicable to inputs of type 'number'");
		} 
		return this; 
	}
	/**
	 * set the 'max' attribute to the given value
	 * 
	 * If the input type is not 'number' This method will log a warning to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setMax(Long value) { 
		switch(type) {
		case NUMBER: attr("max", value.toString()); break; 
		default: warning("max(number) is only applicable to inputs of type 'number'");
		} 
		return this; 
	}
	/**
	 * set the 'max' attribute to the given value
	 * 
	 * If the input type is not 'number' This method will log a warning to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setMax(Float value) { 
		switch(type) {
		case NUMBER: attr("max", value.toString()); break; 
		default: warning("max(number) is only applicable to inputs of type 'number'");
		} 
		return this; 
	}
	/**
	 * set the 'max' attribute to the given value
	 * 
	 * If the input type is not 'number' This method will log a warning to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setMax(Double value) { 
		switch(type) {
		case NUMBER: attr("max", value.toString()); break; 
		default: warning("max(number) is only applicable to inputs of type 'number'");
		} 
		return this; 
	}
	/**
	 * set the 'max' attribute to the given value
	 * 
	 * If the input type is not 'date' This method will log a warning to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setMax(Date value) { 
		switch(type) {
		case DATE: attr("max", dateTimeZone(value)); break; 
		default: warning("max(date) is only applicable to inputs of type 'date'");
		} 
		return this; 
	}
	/**
	 * set the 'max' attribute to the date value formatted using the given data format
	 * 
	 * If the input type is not 'date' This method will log a warning to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @param dateFormat The format to output the given date
	 * @return This element for method chaining
	 */
	public HtmlInput setMax(Date value, DateFormat dateFormat) { 
		switch(type) {
		case DATE: 
			switch(dateFormat) {
			case DATE_TIME_ZONE:
				attr("max", dateTimeZone(value)); 
				break;
			case DATE_TIME:
				attr("max", dateTime(value));
				break;
			case DATE:
				attr("max", date(value));
				break;
			default:
				warning("Unsupported date format");
				break; 
			}
		default: warning("max(date) is only applicable to inputs of type 'date'");
		} 
		return this; 
	}
	/**
	 * set the 'maxLength' attribute to the given value
	 * 
	 * If the attribute is not applicable to the input type a warning is logged to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setMaxLength(Integer value) { 
		switch(type) {
		case EMAIL: case PASSWORD: case SEARCH: case TEXT: case URL: attr("maxLength", value.toString()); break; 
		default: warning("maxLength only applicable to inputs of type 'email', 'password', 'search', 'text' or 'url'");
		} 
		return this; 
	}
	/**
	 * set the 'min' attribute to the given value
	 * 
	 * If the attribute is not applicable to the input type a warning is logged to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setMin(Integer value) { 
		switch(type) {
		case NUMBER: attr("min", value.toString()); break; 
		default: warning("min(number) is only applicable to inputs of type 'number'");
		} 
		return this; 
	}
	/**
	 * set the 'min' attribute to the given value
	 * 
	 * If the attribute is not applicable to the input type a warning is logged to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setMin(Long value) { 
		switch(type) {
		case NUMBER: attr("min", value.toString()); break; 
		default: warning("min(number) is only applicable to inputs of type 'number'");
		} 
		return this; 
	}
	/**
	 * set the 'min' attribute to the given value
	 * 
	 * If the attribute is not applicable to the input type a warning is logged to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setMin(Float value) { 
		switch(type) {
		case NUMBER: attr("min", value.toString()); break; 
		default: warning("min(number) is only applicable to inputs of type 'number'");
		} 
		return this; 
	}
	/**
	 * set the 'min' attribute to the given value
	 * 
	 * If the attribute is not applicable to the input type a warning is logged to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setMin(Double value) { 
		switch(type) {
		case NUMBER: attr("min", value.toString()); break; 
		default: warning("min(number) is only applicable to inputs of type 'number'");
		} 
		return this; 
	}
	/**
	 * set the 'min' attribute to the given value
	 * 
	 * If the attribute is not applicable to the input type a warning is logged to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setMin(Date value) { 
		switch(type) {
		case DATE: attr("min", dateTimeZone(value)); break; 
		default: warning("min(date) is only applicable to inputs of type 'date'");
		} 
		return this; 
	}
	/**
	 * set the 'min' attribute to the given date value formatted using the given date format
	 * 
	 * If the attribute is not applicable to the input type a warning is logged to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @param dateFormat The date format to format the given date
	 * @return This element for method chaining
	 */
	public HtmlInput setMin(Date value, DateFormat dateFormat) { 
		switch(type) {
		case DATE: 
			switch(dateFormat) {
			case DATE_TIME_ZONE:
				attr("min", dateTimeZone(value)); 
				break;
			case DATE_TIME:
				attr("min", dateTime(value));
				break;
			case DATE:
				attr("min", date(value));
				break;
			default:
				warning("Unsupported date format");
				break; 
			}
		default: warning("min(date) is only applicable to inputs of type 'date'");
		} 
		return this; 
	}
	/**
	 * set the 'multiple' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlInput setMultiple() { attr("multiple", null); return this; }
	/**
	 * set the 'name' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setName(String value) { attr("name", value); return this; }
	/**
	 * set the 'pattern' attribute to the given value
	 * 
	 * If the attribute is not applicable to the input type a warning is logged to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setPattern(String value) { 
		switch(type) {
		case EMAIL: case PASSWORD: case SEARCH: case TEXT: case URL: attr("pattern", value); break; 
		default: warning("pattern only applicable to inputs of type 'email', 'password', 'search', 'text' or 'url'");
		} 
		return this; 
	}
	/**
	 * set the 'placeholder' attribute to the given value
	 * 
	 * If the attribute is not applicable to the input type a warning is logged to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setPlaceHolder(String value) { 
		switch(type) {
		case EMAIL: case NUMBER: case DATE: case DATETIME_LOCAL: case FILE: case IMAGE: case COLOR: case MONTH: case RANGE: case TEL: case WEEK: case SEARCH: case TEXT: case URL: attr("placeHolder", value); break; 
		default: warning("placeHolder only applicable to inputs of type 'email', 'number', 'data', 'datetime-local', 'file', 'image', 'color', 'month', 'range', 'tel', 'week', 'search', 'text' or 'url'");
		} 
		return this; 
	}
	/**
	 * set the 'readonly' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlInput setReadOnly() { attr("readOnly", null); return this; }
	/**
	 * set the 'required' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlInput setRequired() { attr("required", null); return this; }
	/**
	 * set the 'size' attribute to the given value
	 * 
	 * If the attribute is not applicable to the input type a warning is logged to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setSize(Integer value) { 
		switch(type) {
		case EMAIL: case NUMBER: case DATE: case DATETIME_LOCAL: case FILE: case IMAGE: case COLOR: case MONTH: case RANGE: case TEL: case WEEK: case SEARCH: case TEXT: case URL: attr("size", value.toString()); break; 
		default: warning("size only applicable to inputs of type 'email', 'number', 'data', 'datetime-local', 'file', 'image', 'color', 'month', 'range', 'tel', 'week', 'search', 'text' or 'url'");
		} 
		return this; 
	}
	/**
	 * set the 'src' attribute to the given value
	 * 
	 * If input type is not 'image' a warning is logged to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setSrc(String value) { 
		switch(type) {
		case IMAGE: attr("src", value); break; 
		default: warning("src is only applicable to inputs of type 'image'");
		} 
		return this; 
	}
	/**
	 * set the 'step' attribute to the given value
	 * 
	 * If the attribute is not applicable to the input type a warning is logged to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setStep(Integer value) { 
		switch(type) {
		case NUMBER: case DATE: case DATETIME_LOCAL: case RANGE: attr("step", value.toString()); break; 
		default: warning("step is only applicable to inputs of type 'number', 'date', 'datetime-local' or 'range'");
		} 
		return this; 
	}
	/**
	 * set the 'value' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setValue(String value) { attr("value", value); return this; }
	/**
	 * set the 'width' attribute to the given value
	 * 
	 * If input type is not 'image' a warning is logged to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlInput setWidth(Integer value) { 
		switch(type) {
		case IMAGE: attr("width", value.toString()); break; 
		default: warning("width is only applicable to inputs of type 'image'");
		} 
		return this; 
	}

	
	public HtmlInput setType(Type value) { type = value; attr("type", value.getValue()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element and identifies it as an empty element
	 * @param hb		The html builder that created the element
	 */
	public HtmlInput(Html5Builder hb) {
		super(hb, "input");		
		emptyTag();
	}

}
