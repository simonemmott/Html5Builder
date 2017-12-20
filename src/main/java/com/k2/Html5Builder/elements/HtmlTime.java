package com.k2.Html5Builder.elements;

import java.util.Date;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlPhrasingElementNoTime;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQuery;
import com.k2.Html5Builder.elements.attrValues.Dir;

public class HtmlTime extends HtmlPhrasingElementNoTime<HtmlTime> {
	
	public HtmlTime setDateTime(Date value) { attr("dateTime", dateTimeZone(value)); return this; }

	public HtmlTime(Html5Builder hb) {
		super(hb, "time");	
	}

}
