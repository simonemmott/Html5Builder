package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.elements.attrValues.Preload;

public class HtmlAudio extends HtmlElement<HtmlAudio> {
	
	public HtmlAudio setAutoplay() { attr("autoplay", null); return this; }
	public HtmlAudio setControls() { attr("controls", null); return this; }
	public HtmlAudio setLoop() { attr("loop", null); return this; }
	public HtmlAudio setMuted() { attr("muted", null); return this; }
	public HtmlAudio setPreload(Preload value) { attr("preload", value.getValue()); return this; }
	public HtmlAudio setSrc(String value) { attr("src", value); return this; }


	public HtmlAudio(Html5Builder hb) {
		super(hb, "audio");		
	}

}
