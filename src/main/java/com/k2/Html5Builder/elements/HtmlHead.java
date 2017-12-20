package com.k2.Html5Builder.elements;

import java.io.PrintWriter;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlGlobalElement;
import com.k2.Html5Builder.elements.attrValues.HttpEquiv;
import com.k2.Html5Builder.elements.attrValues.MetaName;
import com.k2.XMLBuilder.XMLNode;

public class HtmlHead extends HtmlGlobalElement<HtmlHead> {
	
	public HtmlHead(Html5Builder hb) {
		super(hb, "head");		
	}
	
	public HtmlHead keywords(String ... keywords) {
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for (String keyword : keywords) {
			if (!first) sb.append(", ");
			sb.append(keyword);
			first = false;
		}
		XMLNode node = null;
		if (contents != null) {
			for (XMLNode el : contents) {
				HtmlGlobalElement html = (HtmlGlobalElement)el;
				if (html.matches("meta[name="+MetaName.KEYWORDS.getValue()+"]")) { node = el; break; }
			}
		}
		if (node != null) {
			HtmlMeta meta = (HtmlMeta)node;
			String current = meta.get("content");
			if (current != null && !"".equals(current)) {
				sb.append(", ").append(current);
			}
			meta.setContent(sb.toString());
		} else {
			add(((Html5Builder)xb).element(HtmlMeta.class).setName(MetaName.KEYWORDS).setContent(sb.toString()));
		}
		return this;
	}
	
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
	
	public HtmlBase base() { return createAndAddChild(HtmlBase.class); }
	public HtmlTitle title() { return createAndAddChild(HtmlTitle.class); }
	public HtmlLink link() { return createAndAddChild(HtmlLink.class); }
	public HtmlStyle style() { return createAndAddChild(HtmlStyle.class); }
	public HtmlMeta meta() { return createAndAddChild(HtmlMeta.class); }
	public HtmlScript script() { return createAndAddChild(HtmlScript.class); }
	public HtmlNoScript noScript() { return createAndAddChild(HtmlNoScript.class); }
	
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
