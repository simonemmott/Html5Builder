package com.k2.Html5Builder;


import com.k2.Html5Builder.elements.*;
import com.k2.XMLBuilder.XMLElement;

/**
 * This abstract class is the base class for all html flow elements
 * 
 * It defines methods to create the child elements appropriate for flow elements
 * 
 * @author simon
 *
 * @param <T> The actual class representing the final html element
 */
public abstract class HtmlFlowElement<T extends XMLElement> extends HtmlCommonPhrasingElement<T> {

	
	/**
	 * Pass the attributes through to the HtmlElement constructor
	 * @param hb		The html builder that created this instance
	 * @param tag	The tag of the final html element
	 */
	protected HtmlFlowElement(Html5Builder hb, String tag) {
		super(hb, tag);
	}
		
	/**
	 * Create an 'a' element as a child of this element
	 * @return The created child element
	 */
	public HtmlA a() { return createAndAddChild(HtmlA.class); }
	/**
	 * Create an 'address' element as a child of this element
	 * @return The created child element
	 */
	public HtmlAddress address() { return createAndAddChild(HtmlAddress.class); }
	/**
	 * Create an 'article' element as a child of this element
	 * @return The created child element
	 */
	public HtmlArticle article() { return createAndAddChild(HtmlArticle.class); }
	/**
	 * Create an 'aside' element as a child of this element
	 * @return The created child element
	 */
	public HtmlAside aside() { return createAndAddChild(HtmlAside.class); }
	/**
	 * Create an 'audio' element as a child of this element
	 * @return The created child element
	 */
	public HtmlAudio audio() { return createAndAddChild(HtmlAudio.class); }
	/**
	 * Create an 'blockquote' element as a child of this element
	 * @return The created child element
	 */
	public HtmlBlockQuote blockQuote() { return createAndAddChild(HtmlBlockQuote.class); }
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
	 * Create an 'details' element as a child of this element
	 * @return The created child element
	 */
	public HtmlDetails details() { return createAndAddChild(HtmlDetails.class); }
	/**
	 * Create an 'div' element as a child of this element
	 * @return The created child element
	 */
	public HtmlDiv div() { return createAndAddChild(HtmlDiv.class); }
	/**
	 * Create an 'dl' element as a child of this element
	 * @return The created child element
	 */
	public HtmlDl dl() { return createAndAddChild(HtmlDl.class); }
	/**
	 * Create an 'fieldset' element as a child of this element
	 * @return The created child element
	 */
	public HtmlFieldSet fieldSet() { return createAndAddChild(HtmlFieldSet.class); }
	/**
	 * Create an 'figure' element as a child of this element
	 * @return The created child element
	 */
	public HtmlFigure figure() { return createAndAddChild(HtmlFigure.class); }
	/**
	 * Create an 'footer' element as a child of this element
	 * @return The created child element
	 */
	public HtmlFooter footer() { return createAndAddChild(HtmlFooter.class); }
	/**
	 * Create an 'form' element as a child of this element
	 * @return The created child element
	 */
	public HtmlForm form() { return createAndAddChild(HtmlForm.class); }
	/**
	 * Create an 'h&lt;1-6&gt;' element as a child of this element
	 * 
	 * This method creates an html heading element that inheits its heading level
	 * from further up the document tree. The level of the 'h' element is set as one plus
	 * the level of the nearest parent heading so long as that doesn't exceed 6 in which case
	 * the level of 6 is used.
	 * 
	 * The nearest heading level is identified as the nearest 'h&lt;1-6&gt;' element found as the
	 * previous sibling to an element in this elements path.
	 * @return The created child element
	 */
	public HtmlH h() { return createAndAddChild(HtmlH.class); }
	/**
	 * Create an 'h1' element as a child of this element
	 * @return The created child element
	 */
	public HtmlH1 h1() { return createAndAddChild(HtmlH1.class); }
	/**
	 * Create an 'h2' element as a child of this element
	 * @return The created child element
	 */
	public HtmlH2 h2() { return createAndAddChild(HtmlH2.class); }
	/**
	 * Create an 'h3' element as a child of this element
	 * @return The created child element
	 */
	public HtmlH3 h3() { return createAndAddChild(HtmlH3.class); }
	/**
	 * Create an 'h4' element as a child of this element
	 * @return The created child element
	 */
	public HtmlH4 h4() { return createAndAddChild(HtmlH4.class); }
	/**
	 * Create an 'h5' element as a child of this element
	 * @return The created child element
	 */
	public HtmlH5 h5() { return createAndAddChild(HtmlH5.class); }
	/**
	 * Create an 'h6' element as a child of this element
	 * @return The created child element
	 */
	public HtmlH6 h6() { return createAndAddChild(HtmlH6.class); }
	/**
	 * Create an 'header' element as a child of this element
	 * @return The created child element
	 */
	public HtmlHeader header() { return createAndAddChild(HtmlHeader.class); }
	/**
	 * Create an 'hr' element as a child of this element
	 * @return The created child element
	 */
	public HtmlHr hr() { return createAndAddChild(HtmlHr.class); }
	/**
	 * Create an 'ins' element as a child of this element
	 * @return The created child element
	 */
	public HtmlIns ins() { return createAndAddChild(HtmlIns.class); }
	/**
	 * Create an 'main' element as a child of this element
	 * @return The created child element
	 */
	public HtmlMain main() { return createAndAddChild(HtmlMain.class); }
	/**
	 * Create an 'map' element as a child of this element
	 * @return The created child element
	 */
	public HtmlMap map() { return createAndAddChild(HtmlMap.class); }
	/**
	 * Create an 'nav' element as a child of this element
	 * @return The created child element
	 */
	public HtmlNav nav() { return createAndAddChild(HtmlNav.class); }
	/**
	 * Create an 'object' element as a child of this element
	 * @return The created child element
	 */
	public HtmlObject object() { return createAndAddChild(HtmlObject.class); }
	/**
	 * Create an 'ol' element as a child of this element
	 * @return The created child element
	 */
	public HtmlOl ol() { return createAndAddChild(HtmlOl.class); }
	/**
	 * Create an 'p' element as a child of this element
	 * @return The created child element
	 */
	public HtmlP p() { return createAndAddChild(HtmlP.class); }
	/**
	 * Create an 'picture' element as a child of this element
	 * @return The created child element
	 */
	public HtmlPicture picture() { return createAndAddChild(HtmlPicture.class); }
	/**
	 * Create an 'pre' element as a child of this element
	 * @return The created child element
	 */
	public HtmlPre pre() { return createAndAddChild(HtmlPre.class); }
	/**
	 * Create an 'section' element as a child of this element
	 * @return The created child element
	 */
	public HtmlSection section() { return createAndAddChild(HtmlSection.class); }
	/**
	 * Create an 'table' element as a child of this element
	 * @return The created child element
	 */
	public HtmlTable table() { return createAndAddChild(HtmlTable.class); }
	/**
	 * Create an 'ul' element as a child of this element
	 * @return The created child element
	 */
	public HtmlUl ul() { return createAndAddChild(HtmlUl.class); }
	/**
	 * Create an 'video' element as a child of this element
	 * @return The created child element
	 */
	public HtmlVideo video() { return createAndAddChild(HtmlVideo.class); }


}
