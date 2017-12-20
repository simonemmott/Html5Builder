package com.k2.Html5Builder.elements;

import java.util.Date;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlFlowElement;

public class HtmlIns extends HtmlFlowElement<HtmlIns> {
	
	public HtmlIns setCite(String value) { attr("cite", value); return this; }
	public HtmlIns setDateTime(Date value) { attr("dateTime", hb().dateTimeZone(value)); return this; }

	public HtmlIns(Html5Builder hb) {
		super(hb, "ins");		
	}

}
