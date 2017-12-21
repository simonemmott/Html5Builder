package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlStyledFlowElement;

/**
 * A class representing an 'article' html element
 * 
 * @author simon
 *
 */
public class HtmlArticle extends HtmlStyledFlowElement<HtmlArticle> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining he html builder that
	 * created the element.
	 * @param hb		The html builder that created the element
	 */
	public HtmlArticle(Html5Builder hb) {
		super(hb, "article");		
	}

}
