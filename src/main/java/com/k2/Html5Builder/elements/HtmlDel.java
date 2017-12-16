package com.k2.Html5Builder.elements;

import java.util.Date;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

public class HtmlDel extends HtmlElement<HtmlDel> {
	
	public HtmlDel setCite(String value) { attr("cite", value); return this; }
	public HtmlDel setDateTime(Date value) { attr("dateTime", hb().dateTimeZone(value)); return this; }

	public HtmlDel(Html5Builder hb) {
		super(hb, "del");		
	}

}