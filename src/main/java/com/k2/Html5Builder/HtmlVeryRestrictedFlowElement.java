package com.k2.Html5Builder;

import com.k2.Html5Builder.elements.*;
import com.k2.XMLBuilder.XMLElement;

/**
 * This abstract element defines a flow element that disallows header, footer, address elements, headings and section
 * 
 * This class adds the methods to create the child elements appropriate to flow elements excluding header, footer, address, heading and section elements
 * 
 * @author simon
 *
 * @param <T> The final class implementing the html element
 */
public abstract class HtmlVeryRestrictedFlowElement<T extends XMLElement> extends HtmlCommonPhrasingElement<T> {

	
	/**
	 * Pass the attributes through to the HtmlElement constructor
	 * @param hb		The html builder that created this instance
	 * @param tag	The tag of the final html element
	 */
	protected HtmlVeryRestrictedFlowElement(Html5Builder hb, String tag) {
		super(hb, tag);
	}
		
	/**
	 * Create a 'a' element as a child of this element
	 * @return The created child element
	 */
	public HtmlA a() { return createAndAddChild(HtmlA.class); }
	/**
	 * Create a 'article' element as a child of this element
	 * @return The created child element
	 */
	public HtmlArticle article() { return createAndAddChild(HtmlArticle.class); }
	/**
	 * Create a 'aside' element as a child of this element
	 * @return The created child element
	 */
	public HtmlAside aside() { return createAndAddChild(HtmlAside.class); }
	/**
	 * Create a 'audio' element as a child of this element
	 * @return The created child element
	 */
	public HtmlAudio audio() { return createAndAddChild(HtmlAudio.class); }
	/**
	 * Create a 'blockquote' element as a child of this element
	 * @return The created child element
	 */
	public HtmlBlockQuote blockQuote() { return createAndAddChild(HtmlBlockQuote.class); }
	/**
	 * Create a 'canvas' element as a child of this element
	 * @return The created child element
	 */
	public HtmlCanvas canvas() { return createAndAddChild(HtmlCanvas.class); }
	/**
	 * Create a 'del' element as a child of this element
	 * @return The created child element
	 */
	public HtmlDel del() { return createAndAddChild(HtmlDel.class); }
	/**
	 * Create a 'details' element as a child of this element
	 * @return The created child element
	 */
	public HtmlDetails details() { return createAndAddChild(HtmlDetails.class); }
	/**
	 * Create a 'div' element as a child of this element
	 * @return The created child element
	 */
	public HtmlDiv div() { return createAndAddChild(HtmlDiv.class); }
	/**
	 * Create a 'dl' element as a child of this element
	 * @return The created child element
	 */
	public HtmlDl dl() { return createAndAddChild(HtmlDl.class); }
	/**
	 * Create a 'fieldset' element as a child of this element
	 * @return The created child element
	 */
	public HtmlFieldSet fieldSet() { return createAndAddChild(HtmlFieldSet.class); }
	/**
	 * Create a 'figure' element as a child of this element
	 * @return The created child element
	 */
	public HtmlFigure figure() { return createAndAddChild(HtmlFigure.class); }
	/**
	 * Create a 'form' element as a child of this element
	 * @return The created child element
	 */
	public HtmlForm form() { return createAndAddChild(HtmlForm.class); }
	/**
	 * Create a 'hr' element as a child of this element
	 * @return The created child element
	 */
	public HtmlHr hr() { return createAndAddChild(HtmlHr.class); }
	/**
	 * Create a 'ins' element as a child of this element
	 * @return The created child element
	 */
	public HtmlIns ins() { return createAndAddChild(HtmlIns.class); }
	/**
	 * Create a 'main' element as a child of this element
	 * @return The created child element
	 */
	public HtmlMain main() { return createAndAddChild(HtmlMain.class); }
	/**
	 * Create a 'map' element as a child of this element
	 * @return The created child element
	 */
	public HtmlMap map() { return createAndAddChild(HtmlMap.class); }
	/**
	 * Create a 'nav' element as a child of this element
	 * @return The created child element
	 */
	public HtmlNav nav() { return createAndAddChild(HtmlNav.class); }
	/**
	 * Create a 'object' element as a child of this element
	 * @return The created child element
	 */
	public HtmlObject object() { return createAndAddChild(HtmlObject.class); }
	/**
	 * Create a 'ol' element as a child of this element
	 * @return The created child element
	 */
	public HtmlOl ol() { return createAndAddChild(HtmlOl.class); }
	/**
	 * Create a 'p' element as a child of this element
	 * @return The created child element
	 */
	public HtmlP p() { return createAndAddChild(HtmlP.class); }
	/**
	 * Create a 'picture' element as a child of this element
	 * @return The created child element
	 */
	public HtmlPicture picture() { return createAndAddChild(HtmlPicture.class); }
	/**
	 * Create a 'pre' element as a child of this element
	 * @return The created child element
	 */
	public HtmlPre pre() { return createAndAddChild(HtmlPre.class); }
	/**
	 * Create a 'table' element as a child of this element
	 * @return The created child element
	 */
	public HtmlTable table() { return createAndAddChild(HtmlTable.class); }
	/**
	 * Create a 'ul' element as a child of this element
	 * @return The created child element
	 */
	public HtmlUl ul() { return createAndAddChild(HtmlUl.class); }
	/**
	 * Create a 'video' element as a child of this element
	 * @return The created child element
	 */
	public HtmlVideo video() { return createAndAddChild(HtmlVideo.class); }


}
