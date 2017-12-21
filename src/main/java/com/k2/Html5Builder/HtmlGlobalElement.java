package com.k2.Html5Builder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Date;

import com.k2.Html5Builder.elements.attrValues.HtmlLanguageCode;
import com.k2.XMLBuilder.XMLElement;
import com.k2.XMLBuilder.XMLBuilder.NullAttributeHandling;

/**
 * This abstract class is and extension of XMLElement and is the basis for all Html elements except the 'html' element
 * 
 * The class defines methods to set the standard html attributes but not the html event attributes
 * 
 * @author simon
 *
 * @param <T> The type of the final implementing class for the element
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public abstract class HtmlGlobalElement<T extends XMLElement> extends XMLElement {
	
	/**
	 * A utility method create a warning message for attribute values
	 * 
	 * @param check	A value to compare to the attributes value
	 * @param value	The value of the attribute being checked
	 * @param attr The attribute that is invalid
	 */
	protected void warnValid(String check, String value, String attr) {
		if (!value.equalsIgnoreCase(this.get(check))) ((Html5Builder)xb).warning("The attribute "+attr+" is only valid for "+getTag()+"'s of "+check+" '"+value+"' at: "+getPath()); 
	}
	
	// Global Attributes
	/**
	 * Set the 'id' attribute
	 * @param value	The value to set for the attribute
	 * @return	This element for method chaining
	 */
	public T setId(String value) { attr("id", value); return (T) this; }
	/**
	 * Set the 'class' attribute
	 * @param value	The value to set for the attribute
	 * @return	This element for method chaining
	 */
	public T setClass(String value) { attr("class", value); return (T) this; }
	/**
	 * Set the 'accesskey' attribute
	 * @param value	The value to set for the attribute
	 * @return	This element for method chaining
	 */
	public T setAccesskey(String value) { attr("accesskey", value); return (T) this; }
	/**
	 * Set the 'contenteditable' attribute
	 * @param value	The value to set for the attribute
	 * @return	This element for method chaining
	 */
	public T setContentEditable(String value) { attr("contenteditable", value); return (T) this; }
	/**
	 * Set the 'contextmenu' attribute
	 * @param value	The value to set for the attribute
	 * @return	This element for method chaining
	 */
	public T setContextMenu(String value) { attr("contextmenu", value); return (T) this; }
	/**
	 * Set the 'dir' attribute
	 * @param value	The value to set for the attribute
	 * @return	This element for method chaining
	 */
	public T setDir(String value) { attr("dir", value); return (T) this; }
	/**
	 * Set the 'draggable' attribute
	 * @param value	The value to set for the attribute
	 * @return	This element for method chaining
	 */
	public T setDraggable(String value) { attr("draggable", value); return (T) this; }
	/**
	 * Set the 'dropzone' attribute
	 * @param value	The value to set for the attribute
	 * @return	This element for method chaining
	 */
	public T setDropzone(String value) { attr("dropzone", value); return (T) this; }
	/**
	 * Set the 'hidden' attribute
	 * @param value	The value to set for the attribute
	 * @return	This element for method chaining
	 */
	public T setHidden(String value) { attr("hidden", value); return (T) this; }
	/**
	 * Set the 'lang' attribute to a valid language code
	 * @param value	The value to set for the attribute
	 * @return	This element for method chaining
	 */
	public T setLang(HtmlLanguageCode value) { attr("lang", value.getValue()); return (T) this; }
	/**
	 * Set the 'spellcheck' attribute
	 * @param value	The value to set for the attribute
	 * @return	This element for method chaining
	 */
	public T setSpellCheck(String value) { attr("spellcheck", value); return (T) this; }
	/**
	 * Set the 'tabindex' attribute
	 * @param value	The value to set for the attribute
	 * @return	This element for method chaining
	 */
	public T setTabIndex(Integer value) { attr("tabindex", value.toString()); return (T) this; }
	/**
	 * Set the 'title' attribute
	 * @param value	The value to set for the attribute
	 * @return	This element for method chaining
	 */
	public T setTitle(String value) { attr("title", value); return (T) this; }
	/**
	 * Set the 'translate' attribute
	 * @param value	The value to set for the attribute
	 * @return	This element for method chaining
	 */
	public T setTranslate(String value) { attr("translate", value); return (T) this; }
	/**
	 * Set the 'style' attribute
	 * @param value	The value to set for the attribute
	 * @return	This element for method chaining
	 */
	public T setStyle(String value) { attr("style", value); return (T) this; }
	/**
	 * Add a class to the elements class list
	 * @param value	The class name to add to the elements classes list
	 * @return	This element for method chaining
	 */
	public T addClass(String value) { 
		String curVal = get("class");
		if (curVal == null || "".equals(curVal)) {
			attr("class", value);
			 return (T) this;
		}
		attr("class", curVal+" "+value); 
		 return (T) this;
	}
	/**
	 * Set a value for the defined data-* attribute
	 * @param id		The id of the data attribute. This will create a value for an attribute named 'data-&lt;id&gt;'
	 * @param value	The value to set for the data-* attribute
	 * @return	This element for method chaining
	 */
	public T addData(String id, String value) { attr("data-"+id, value); return (T) this; }
	/**
	 * Add a css style to the list of styles for this element
	 * @param label	The label of the style being set
	 * @param value The value of the style being set
	 * @return This element for method chaining
	 */
	public T addStyle(String label, String value) {
		String curVal = get("style");
		if (curVal==null || "".equals(curVal)) {
			attr("style", label+":"+value);
			 return (T) this;
		}
		attr("style", curVal+";"+label+":"+value);
		 return (T) this;
	}
	
	/**
	 * Pass the attributes through to the XMLElement constructor
	 * @param hb		The html builder that created this instance
	 * @param tag	The tag of the final html element
	 */
	protected HtmlGlobalElement(Html5Builder hb, String tag) {
		super(hb, tag);
	}
	
	/**
	 * A better named method for added text nodes to html elements
	 * @param text	The text for the text node
	 * @return	This element for method chaining 
	 */
	public T text(String text) { return (T)super.data(text); }
	/**
	 * A abbreviation named method for added text nodes to html elements
	 * @param text	The text for the text node
	 * @return	This element for method chaining 
	 */
	public T t(String text) { return (T)super.data(text); }
	/**
	 * Override the XMLElement method data to cast the return value into the this elements type
	 */
	@Override
	public T data(String text) { return (T)super.data(text); }
	/**
	 * Override the XMLElement method data to cast the return value into the this elements type
	 */
	@Override
	public T d(String text) { return (T)super.data(text); }
	
	/**
	 * Override the XMLElement method casting the return value into this elements type
	 */
	@Override
	public T setNullAttributeHandling(NullAttributeHandling nullAttributeHandling) {
		super.setNullAttributeHandling(nullAttributeHandling);
		return (T) this;
	}

	/**
	 * A utility method to cast this elements xml builder into an html builder
	 * @return  The html builder that created this element
	 */
	protected Html5Builder hb() { return (Html5Builder)xb; }
 	/**
 	 * A utilty method to return to the page on which this element is defined.
 	 * 
 	 * <strong>Note</strong> - If one of the page(...) methods was not used to start building html this method will
 	 * Throw a class cast exception
 	 * @return The HtmlPage instance that is the root of this html document
 	 */
	public HtmlPage page() { return (HtmlPage)root(); }
	
	/**
	 * This method returns the parent element cast into the appropriate type
	 * <strong>Note</strong> - If the class passed in does not match the class of this elements
	 * parent then a class cast exception is thrown
	 * @param parentClass The expected class of the parent element
	 * @param <P> The class implementing this elements parent
	 * @return The parent element cast into the given class
	 */
	public <P> P up(Class<P> parentClass) {
		return (P)super.up();
	}
	
	/**
	 * A better named method to generate the html for this document
	 * @param pw		The print writer that will be used to write the html page
	 * @return	The print writer passed in for method chaining
	 */
	public PrintWriter toHtml(PrintWriter pw) { return toXml(pw); }
	/**
	 * A better named method to generate html for this document
	 * @param w	The writer that will be used to writer the html page
	 * @return	The writer passed in for method chaining
	 */
	public Writer toHtml(Writer w) { return toXml(w); }
	/**
	 * A better named method to generate the html for this document
	 * @param file	The file into which to write the html document
	 * @return	The file passed in
	 * @throws FileNotFoundException If the given file cannot be opened for writing
	 */
	public File toHtml(File file) throws FileNotFoundException { return toXml(file); }

	/**
	 * A utility method to create and add a child element to this element
	 * @param elemClass	The class of the child element to create
	 * @param <E> The class representing the html element to be created as a child node
	 * @return	The newly created child element
	 */
	protected <E extends HtmlGlobalElement> E createAndAddChild(Class<E> elemClass) {
		HtmlGlobalElement el = ((Html5Builder)xb).element(elemClass); 
		add(el); 
		return (E) el;
	}
	
	/**
	 * A utilty method to write a warning message to the warning log
	 * @param message	The warning message to log
	 */
	protected void warning(String message) {
		((Html5Builder)xb).warning(message+ " at: "+getPath());
	}

	/**
	 * A utility method to format a date into html dateTime zone format
	 * @param date	The date to format
	 * @return	A string representing the given date in the html dateTime zone format
	 */
	protected String dateTimeZone(Date date) {
		return ((Html5Builder)xb).dateTimeZone(date);
	}

	/**
	 * A utility method to format a date into html dateTime format
	 * @param date	The date to format
	 * @return	A string representing the given date in the html dateTime format
	 */
	protected String dateTime(Date date) {
		return ((Html5Builder)xb).dateTime(date);
	}

	/**
	 * A utility method to format a date into html date format
	 * @param date	The date to format
	 * @return	A string representing the given date in the html date format
	 */
	protected String date(Date date) {
		return ((Html5Builder)xb).date(date);
	}
	
	/**
	 * Override the up() method casting the return type as an HtmlElement
	 */
	@Override
	public HtmlGlobalElement up() { return (HtmlGlobalElement)super.up(); }
	/**
	 * Override the getPreviousSibling method casting the return as an HtmlGlobalElement
	 */
	@Override
	public HtmlGlobalElement getPreviousSibling() {
		return (HtmlGlobalElement)super.getPreviousSibling();
	}
	/**
	 * Override the getNextSibling method casting the return as an HtmlGlobalElement
	 */
	@Override
	public HtmlGlobalElement getNextSibling() {
		return (HtmlGlobalElement)super.getNextSibling();
	}
	
	
	

}
