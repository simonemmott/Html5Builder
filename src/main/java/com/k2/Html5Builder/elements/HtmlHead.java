package com.k2.Html5Builder.elements;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlGlobalElement;
import com.k2.Html5Builder.elements.attrValues.HttpEquiv;
import com.k2.Html5Builder.elements.attrValues.MetaName;
import com.k2.XMLBuilder.XMLNode;

/**
 * A class representing an 'head' html element
 * 
 * @author simon
 *
 */
public class HtmlHead extends HtmlGlobalElement<HtmlHead> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element 
	 * @param hb		The html builder that created the element
	 */
	public HtmlHead(Html5Builder hb) {
		super(hb, "head");		
	}
	
	/**
	 * This method sets the key words for this page
	 * 
	 * If there are already keywords set for this page then the keywords passed to this method are added to the existing keywords
	 * @param keywords	The keywords for this page
	 * @return	This head element for method chaining
	 */
	@SuppressWarnings("rawtypes")
	public HtmlHead keywords(String ... keywords) {
		XMLNode node = null;
		if (contents != null) {
			for (XMLNode el : contents) {
				HtmlGlobalElement html = (HtmlGlobalElement)el;
				if (html.matches("meta[name="+MetaName.KEYWORDS.getValue()+"]")) { node = el; break; }
			}
		}
		Set<String> words = new HashSet<String>();
		if (node != null) {
			HtmlMeta meta = (HtmlMeta)node;
			String current = meta.get("content");
			if (current != null && !"".equals(current)) {
				for (String word: current.split(",\\s*")) words.add(word);
			}
		}
		for (String keyword : keywords) {
			for (String word: keyword.split(",\\s*")) words.add(word);
		}
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for (String word : words) {
			if (!first) sb.append(", ");
			sb.append(word);
			first = false;
		}
		if (node != null) {
			((HtmlMeta)node).setContent(sb.toString());
		} else {
			add(((Html5Builder)xb).element(HtmlMeta.class).setName(MetaName.KEYWORDS).setContent(sb.toString()));
		}
		return this;
	}
	
	/**
	 * This method sets the description for this html page
	 * @param description	The description for this html page
	 * @return	This head element for method chaining
	 */
	@SuppressWarnings("rawtypes")
	public HtmlHead description(String description) {
		if (contents != null) {
			XMLNode node = null;
			for (XMLNode el : contents) {
				HtmlGlobalElement html = (HtmlGlobalElement)el;
				if (html.matches("meta[name="+MetaName.DESCRIPTION.getValue()+"]")) { node = el; break; }
			}
			if (node != null) contents.remove(node);
		}
		add(((Html5Builder)xb).element(HtmlMeta.class).setName(MetaName.DESCRIPTION).setContent(description));
		return this;
	}
	
	/**
	 * This method sets the title for this html page
	 * @param title	The title for this html page
	 * @return	This head element for method chaining
	 */
	@SuppressWarnings("rawtypes")
	public HtmlHead title(String title) {
		if (contents != null) {
			XMLNode node = null;
			for (XMLNode el : contents) {
				HtmlGlobalElement html = (HtmlGlobalElement)el;
				if (html.matches("title")) { node = el; break; }
			}
			if (node != null) contents.remove(node);
		}
		add(((Html5Builder)xb).element(HtmlTitle.class).text(title));
		return this;
	}
	
	/**
	 * This method sets the author for this html page
	 * @param author		The author for this html page
	 * @return	This head element for method chaining
	 */
	@SuppressWarnings("rawtypes")
	public HtmlHead author(String author) {
		if (contents != null) {
			XMLNode node = null;
			for (XMLNode el : contents) {
				HtmlGlobalElement html = (HtmlGlobalElement)el;
				if (html.matches("meta[name="+MetaName.AUTHOR.getValue()+"]")) { node = el; break; }
			}
			if (node != null) contents.remove(node);
		}
		add(((Html5Builder)xb).element(HtmlMeta.class).setName(MetaName.AUTHOR).setContent(author));
		return this;
	}
	
	/**
	 * This method sets the author for this html page
	 * @param author		The author for this html page
	 * @return	This head element for method chaining
	 */
	@SuppressWarnings("rawtypes")
	public HtmlHead base(String href) {
		if (contents != null) {
			XMLNode node = null;
			for (XMLNode el : contents) {
				HtmlGlobalElement html = (HtmlGlobalElement)el;
				if (html.matches("base")) { node = el; break; }
			}
			if (node != null) contents.remove(node);
		}
		add(((Html5Builder)xb).element(HtmlBase.class).setHref(href));
		return this;
	}
	
	/**
	 * This method sets the refresh rate for this html page.
	 * @param refreshRate  The number of seconds after which this page will automatically refresh
	 * @return	This html head element for method chaining
	 */
	@SuppressWarnings("rawtypes")
	public HtmlHead refreshRate(Integer refreshRate) {
		if (contents != null) {
			XMLNode node = null;
			for (XMLNode el : contents) {
				HtmlGlobalElement html = (HtmlGlobalElement)el;
				if (html.matches("meta[http-equiv="+HttpEquiv.REFRESH.getValue()+"]")) { node = el; break; }
			}
			if (node != null) contents.remove(node);
		}
		add(((Html5Builder)xb).element(HtmlMeta.class).setHttpEquiv(HttpEquiv.REFRESH).setContent(refreshRate.toString()));
		return this;
	}
	
	/**
	 * This method sets the viewport details for this html page
	 * @param viewport	The viewport details for this html page
	 * @return	This html head element for method chaining
	 */
	@SuppressWarnings("rawtypes")
	public HtmlHead viewport(String viewport) {
		if (contents != null) {
			XMLNode node = null;
			for (XMLNode el : contents) {
				HtmlGlobalElement html = (HtmlGlobalElement)el;
				if (html.matches("meta[name="+MetaName.VIEWPORT.getValue()+"]")) { node = el; break; }
			}
			if (node != null) contents.remove(node);
		}
		add(((Html5Builder)xb).element(HtmlMeta.class).setName(MetaName.VIEWPORT).setContent(viewport));
		return this;
	}
	
	/**
	 * This method sets the default viewport metatag.
	 * 
	 * If the viewport meta tag is not set manaully the default viewport meta tag is used.
	 * @return	This html head element for method chaining
	 */
	@SuppressWarnings("rawtypes")
	public HtmlHead viewport() {
		if (contents != null) {
			XMLNode node = null;
			for (XMLNode el : contents) {
				HtmlGlobalElement html = (HtmlGlobalElement)el;
				if (html.matches("meta[name="+MetaName.VIEWPORT.getValue()+"]")) { node = el; break; }
			}
			if (node != null) contents.remove(node);
		}
		add(((Html5Builder)xb).element(HtmlMeta.class).setName(MetaName.VIEWPORT).setContent("width=device-width, initial-scale=1.0"));
		return this;
	}
	
	/**
	 * Create an 'base' element as a child of this element
	 * @return The created child element
	 */
	public HtmlBase base() { return createAndAddChild(HtmlBase.class); }
	/**
	 * Create an 'title' element as a child of this element
	 * @return The created child element
	 */
	public HtmlTitle title() { return createAndAddChild(HtmlTitle.class); }
	/**
	 * Create an 'link' element as a child of this element
	 * @return The created child element
	 */
	public HtmlLink link() { return createAndAddChild(HtmlLink.class); }
	/**
	 * Create an 'style' element as a child of this element
	 * @return The created child element
	 */
	public HtmlStyle style() { return createAndAddChild(HtmlStyle.class); }
	/**
	 * Create an 'mata' element as a child of this element
	 * @return The created child element
	 */
	public HtmlMeta meta() { return createAndAddChild(HtmlMeta.class); }
	/**
	 * Create an 'script' element as a child of this element
	 * @return The created child element
	 */
	public HtmlScript script() { return createAndAddChild(HtmlScript.class); }
	/**
	 * Create an 'noscript' element as a child of this element
	 * @return The created child element
	 */
	public HtmlNoScript noScript() { return createAndAddChild(HtmlNoScript.class); }
	
	/**
	 * Override the toXml method to ensure that the viewport tag is set to the default value if it has not already been set.
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public PrintWriter toXml(PrintWriter pw) {
		boolean found = false;
		if (contents != null) {
			for (XMLNode el : contents) {
				HtmlGlobalElement html = (HtmlGlobalElement)el;
				if (html.matches("meta[name="+MetaName.VIEWPORT.getValue()+"]")) {
					found = true;
					break;
				}
			}
		}
		
		if (!found) viewport();
		
		return super.toXml(pw);
	}


}
