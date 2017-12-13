package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.UserAgentInfo;

public class HtmlBdi extends HtmlElement<HtmlBdi> {
	
	public HtmlBdi(Html5Builder hb) {
		super(hb, "bdi");
		if (hb.uaIs(UserAgentInfo.UserAgentType.MSIE)) { overrideTag("span"); }
	}

}
