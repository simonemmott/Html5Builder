package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlFlowElement;

/**
 * A class representing an 'body' html element
 * 
 * @author simon
 *
 */
public class HtmlBody extends HtmlFlowElement<HtmlBody> {
	
	/**
	 * set the 'onAfterPrint' event handler to the given java script
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlBody onAfterPrint(String value) { attr("onAfterPrint", value); return this; }
	/**
	 * set the 'onBeforePrint' event handler to the given java script
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlBody onBeforePrint(String value) { attr("onBeforePrint", value); return this; }
	/**
	 * set the 'onBeforeUnload' event handler to the given java script
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlBody onBeforeUnload(String value) { attr("onBeforeUnload", value); return this; }
	/**
	 * set the 'onError' event handler to the given java script
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlBody onError(String value) { attr("onError", value); return this; }
	/**
	 * set the 'onHashChange' event handler to the given java script
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlBody onHashChange(String value) { attr("onHashChange", value); return this; }
	/**
	 * set the 'onLoad' event handler to the given java script
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlBody onLoad(String value) { attr("onLoad", value); return this; }
	/**
	 * set the 'onMessage' event handler to the given java script
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlBody onMessage(String value) { attr("onMessage", value); return this; }
	/**
	 * set the 'onOffline' event handler to the given java script
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlBody onOffline(String value) { attr("onOffLine", value); return this; }
	/**
	 * set the 'onOnLine' event handler to the given java script
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlBody onOnLine(String value) { attr("onOnLine", value); return this; }
	/**
	 * set the 'onPageHide' event handler to the given java script
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlBody onPageHide(String value) { attr("onPageHide", value); return this; }
	/**
	 * set the 'onPageShow' event handler to the given java script
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlBody onPageShow(String value) { attr("onPageShow", value); return this; }
	/**
	 * set the 'onPopState' event handler to the given java script
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlBody onPopState(String value) { attr("onPopState", value); return this; }
	/**
	 * set the 'onResize' event handler to the given java script
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlBody onResize(String value) { attr("onResize", value); return this; }
	/**
	 * set the 'onStorage' event handler to the given java script
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlBody onStorage(String value) { attr("onStorage", value); return this; }
	/**
	 * set the 'onUnload' event handler to the given java script
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlBody onUnload(String value) { attr("onUnload", value); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining he html builder that
	 * created the element.
	 * @param hb		The html builder that created the element
	 */
	public HtmlBody(Html5Builder hb) {
		super(hb, "body");
		
	}
	
}
