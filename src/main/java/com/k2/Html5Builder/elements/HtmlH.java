package com.k2.Html5Builder.elements;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlPhrasingElement;
import com.k2.XMLBuilder.XMLElement;

public class HtmlH extends HtmlPhrasingElement<HtmlH> {
	
	public HtmlH(Html5Builder hb) {
		super(hb, "h");		
	}
		
	@SuppressWarnings("rawtypes")
	private void overrideTag() {
		HtmlElement nearest = (HtmlElement)nearest("h1 + *, h2 + *, h3 + *, h4 + *, h5 + *, h6 + *");
		if (nearest != null) {
			HtmlElement header = nearest.getPreviousSibling();
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
	
	@Override
	public PrintWriter toXml(PrintWriter pw) { 
		overrideTag();
		return super.toXml(pw); 
	}
	@Override
	public Writer toXml(Writer w) { 
		overrideTag();
		return super.toXml(w); 
	}
	@Override
	public File toXml(File file) throws FileNotFoundException { 
		overrideTag();
		return super.toXml(file); 
	}

}
