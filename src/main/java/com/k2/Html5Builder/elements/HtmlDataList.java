package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'datalist' html element
 * 
 * @author simon
 *
 */
public class HtmlDataList extends HtmlPhrasingElement<HtmlDataList> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlDataList(Html5Builder hb) {
		super(hb, "datalist");		
	}

	/**
	 * Create an 'option' element as a child of this element
	 * @return The created child element
	 */
	public HtmlOption option() { return createAndAddChild(HtmlOption.class); }

}
