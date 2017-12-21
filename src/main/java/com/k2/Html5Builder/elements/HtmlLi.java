package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlFlowElement;
import com.k2.XMLBuilder.XMLElement;

/**
 * A class representing an 'li' html element
 * 
 * @author simon
 *
 */
public class HtmlLi extends HtmlFlowElement<HtmlLi> {
	
	/**
	 * set the 'value' attribute to the given value
	 * 
	 * If the parent of this list item is not an ordered list a warning is logged to the warning log
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlLi setValue(Integer value) { 
		if (((XMLElement)parent).getTag().equals("ol")) {
			attr("value", value.toString());  
		} else {
			warning("value is only applicable to 'li' elements that are children of 'ol' elements");
		}
		return this;
	}

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element and identifies it as an empty element
	 * @param hb		The html builder that created the element
	 */
	public HtmlLi(Html5Builder hb) {
		super(hb, "li");		
	}

}
