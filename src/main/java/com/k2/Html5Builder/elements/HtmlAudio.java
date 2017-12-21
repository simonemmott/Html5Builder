package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlFlowElement;
import com.k2.Html5Builder.elements.attrValues.Preload;

/**
 * A class representing an 'audio' html element
 * 
 * @author simon
 *
 */
public class HtmlAudio extends HtmlFlowElement<HtmlAudio> {
	
	/**
	 * set the 'autoplay' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlAudio setAutoplay() { attr("autoplay", null); return this; }
	/**
	 * set the 'controls' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlAudio setControls() { attr("controls", null); return this; }
	/**
	 * set the 'loop' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlAudio setLoop() { attr("loop", null); return this; }
	/**
	 * set the 'muted' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlAudio setMuted() { attr("muted", null); return this; }
	/**
	 * set the 'preload' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlAudio setPreload(Preload value) { attr("preload", value.getValue()); return this; }
	/**
	 * set the 'src' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlAudio setSrc(String value) { attr("src", value); return this; }


	/**
	 * Create the element instance setting the appropriate tag and defining he html builder that
	 * created the element.
	 * @param hb		The html builder that created the element
	 */
	public HtmlAudio(Html5Builder hb) {
		super(hb, "audio");		
	}

	/**
	 * Create an 'source' element as a child of this element
	 * @return The created child element
	 */
	public HtmlSource source() { return createAndAddChild(HtmlSource.class); }
	/**
	 * Create an 'track' element as a child of this element
	 * @return The created child element
	 */
	public HtmlTrack track() { return createAndAddChild(HtmlTrack.class); }

}
