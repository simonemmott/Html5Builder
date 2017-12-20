package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlFlowElement;
import com.k2.Html5Builder.MediaTypes.MediaType;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQuery;
import com.k2.Html5Builder.elements.attrValues.Dir;
import com.k2.Html5Builder.elements.attrValues.Kind;
import com.k2.Html5Builder.elements.attrValues.Preload;
import com.k2.Html5Builder.elements.attrValues.Scope;

public class HtmlVideo extends HtmlFlowElement<HtmlVideo> {
	
	public HtmlVideo setAutoplay() { attr("autoplay", null); return this; }
	public HtmlVideo setControls() { attr("controls", null); return this; }
	public HtmlVideo setHeight(Integer value) { attr("height", value.toString()); return this; }
	public HtmlVideo setLoop() { attr("loop", null); return this; }
	public HtmlVideo setMuted() { attr("muted", null); return this; }
	public HtmlVideo setPreLoad(Preload value) { attr("src", value.getValue()); return this; }
	public HtmlVideo setSrc(String value) { attr("src", value); return this; }
	public HtmlVideo setWidth(Integer value) { attr("width", value.toString()); return this; }

	public HtmlVideo(Html5Builder hb) {
		super(hb, "video");		
	}

	public HtmlSource source() { return createAndAddChild(HtmlSource.class); }
	public HtmlTrack track() { return createAndAddChild(HtmlTrack.class); }

}
