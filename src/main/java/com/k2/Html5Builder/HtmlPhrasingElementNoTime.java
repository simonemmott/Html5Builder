package com.k2.Html5Builder;

import com.k2.Html5Builder.elements.*;
import com.k2.XMLBuilder.XMLElement;

/**
 * This abstract class defines phrasing elements but without the ability to create time elements as child elements
 * 
 * This class adds the methods to create the child elements appropriate to phrasing elements
 * 
 * @author simon
 *
 * @param <T> The final class implementing the html element
 */
public abstract class HtmlPhrasingElementNoTime<T extends XMLElement> extends HtmlCommonPhrasingElementNoTime<T> {

	
	/**
	 * Pass the attributes through to the HtmlElement constructor
	 * @param hb		The html builder that created this instance
	 * @param tag	The tag of the final html element
	 */
	protected HtmlPhrasingElementNoTime(Html5Builder hb, String tag) {
		super(hb, tag);
	}
		
	/**
	 * Create an 'a' element as a child of this element
	 * @return The created child element
	 */
	public HtmlA a() { return createAndAddChild(HtmlA.class); }
	/**
	 * Create an 'audio' element as a child of this element
	 * @return The created child element
	 */
	public HtmlAudio audio() { return createAndAddChild(HtmlAudio.class); }
	/**
	 * Create an 'canvas' element as a child of this element
	 * @return The created child element
	 */
	public HtmlCanvas canvas() { return createAndAddChild(HtmlCanvas.class); }
	/**
	 * Create an 'del' element as a child of this element
	 * @return The created child element
	 */
	public HtmlDel del() { return createAndAddChild(HtmlDel.class); }
	/**
	 * Create an 'ins' element as a child of this element
	 * @return The created child element
	 */
	public HtmlIns ins() { return createAndAddChild(HtmlIns.class); }
	/**
	 * Create an 'map' element as a child of this element
	 * @return The created child element
	 */
	public HtmlMap map() { return createAndAddChild(HtmlMap.class); }
	/**
	 * Create an 'object' element as a child of this element
	 * @return The created child element
	 */
	public HtmlObject object() { return createAndAddChild(HtmlObject.class); }
	/**
	 * Create an 'video' element as a child of this element
	 * @return The created child element
	 */
	public HtmlVideo video() { return createAndAddChild(HtmlVideo.class); }


}
