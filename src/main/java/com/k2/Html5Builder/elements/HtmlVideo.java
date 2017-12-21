package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlFlowElement;
import com.k2.Html5Builder.elements.attrValues.Preload;

/**
 * A class representing an 'video' html element
 * 
 * @author simon
 *
 */
public class HtmlVideo extends HtmlFlowElement<HtmlVideo> {
	
	/**
	 * set the 'autoplay' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlVideo setAutoplay() { attr("autoplay", null); return this; }
	/**
	 * set the 'controls' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlVideo setControls() { attr("controls", null); return this; }
	/**
	 * set the 'height' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlVideo setHeight(Integer value) { attr("height", value.toString()); return this; }
	/**
	 * set the 'loop' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlVideo setLoop() { attr("loop", null); return this; }
	/**
	 * set the 'muted' attribute on
	 * 
	 * @return This element for method chaining
	 */
	public HtmlVideo setMuted() { attr("muted", null); return this; }
	/**
	 * set the 'preload' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlVideo setPreLoad(Preload value) { attr("src", value.getValue()); return this; }
	/**
	 * set the 'src' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlVideo setSrc(String value) { attr("src", value); return this; }
	/**
	 * set the 'width' attribute to the given value
	 * 
	 * @param value The value to set for the attribute
	 * @return This element for method chaining
	 */
	public HtmlVideo setWidth(Integer value) { attr("width", value.toString()); return this; }

	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlVideo(Html5Builder hb) {
		super(hb, "video");		
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
