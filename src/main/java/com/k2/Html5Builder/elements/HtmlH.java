package com.k2.Html5Builder.elements;

import java.io.PrintWriter;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlGlobalElement;
import com.k2.Html5Builder.HtmlPhrasingElement;

/**
 * A class representing an 'h&lt;1-6&gt;' html element
 * 
 * This is a special html heading element in that it inherits it level from its nearest parent heading.
 * 
 * Note this element identifies its nearest heading element by searching for a heading element that is the
 * previous sibling of one of this elements parent elements
 * 
 * @author simon
 *
 */
public class HtmlH extends HtmlPhrasingElement<HtmlH> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element 
	 * @param hb		The html builder that created the element
	 */
	public HtmlH(Html5Builder hb) {
		super(hb, "h");		
	}
		
	@SuppressWarnings("rawtypes")
	private void overrideTag() {
		HtmlElement nearest = (HtmlElement)nearest("h1 + *, h2 + *, h3 + *, h4 + *, h5 + *, h6 + *");
		if (nearest != null) {
			HtmlGlobalElement header = nearest.getPreviousSibling();
			String tag = header.getTag();
			String levelCh = tag.substring(1);
			Integer level = new Integer(levelCh);
			if (level.intValue() < 6) {
				overrideTag("h"+(level+1));
			} else {
				overrideTag("h6");
			}
		} else {
			overrideTag("h1");
		}
	}
	
	/**
	 * Override the toXml method to update the heading level to one less than its nearest parent heading.
	 */
	@Override
	public PrintWriter toXml(PrintWriter pw) { 
		overrideTag();
		return super.toXml(pw); 
	}

}
