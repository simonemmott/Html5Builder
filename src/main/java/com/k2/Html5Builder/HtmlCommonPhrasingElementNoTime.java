package com.k2.Html5Builder;

import com.k2.Html5Builder.elements.*;
import com.k2.XMLBuilder.XMLElement;

/**
 * This absract class extends HtmlElement adding the methods to create the common phrasing elements excluding the 'time' element
 * and child elements
 * @author simon
 *
 * @param <T>	The final type of the html element.
 */
@SuppressWarnings({"unchecked"})
public abstract class HtmlCommonPhrasingElementNoTime<T extends XMLElement> extends HtmlElement<T> {

	
	/**
	 * Pass the attributes through to the HtmlElement constructor
	 * @param hb		The html builder that created this instance
	 * @param tag	The tag of the final html element
	 */
	protected HtmlCommonPhrasingElementNoTime(Html5Builder hb, String tag) {
		super(hb, tag);
	}
	
	// Common Phrasing Elements
	/**
	 * Create an 'abbr' element as a child of this element
	 * @return The created child element
	 */
	public HtmlAbbr abbr() { return createAndAddChild(HtmlAbbr.class); }
	/**
	 * Create an 'area' element as a child of this element
	 * @return The created child element
	 */
	public HtmlArea area() { return createAndAddChild(HtmlArea.class); }
	/**
	 * Create an 'b' element as a child of this element
	 * @return The created child element
	 */
	public HtmlB b() { return createAndAddChild(HtmlB.class); }
	/**
	 * Create an 'bdi' element as a child of this element
	 * @return The created child element
	 */
	public HtmlBdi bdi() { return createAndAddChild(HtmlBdi.class); }
	/**
	 * Create an 'bdo' element as a child of this element
	 * @return The created child element
	 */
	public HtmlBdo bdo() { return createAndAddChild(HtmlBdo.class); }
	/**
	 * Create an 'br' element as a child of this element
	 * @return This element
	 */
	public T br() { createAndAddChild(HtmlBr.class); return (T) this;}
	/**
	 * Create an 'button' element as a child of this element
	 * @return The created child element
	 */
	public HtmlButton button() { return createAndAddChild(HtmlButton.class); }
	/**
	 * Create an 'cite' element as a child of this element
	 * @return The created child element
	 */
	public HtmlCite cite() { return createAndAddChild(HtmlCite.class); }
	/**
	 * Create an 'datalist' element as a child of this element
	 * @return The created child element
	 */
	public HtmlDataList dataList() { return createAndAddChild(HtmlDataList.class); }
	/**
	 * Create an 'dfn' element as a child of this element
	 * @return The created child element
	 */
	public HtmlDfn dfn() { return createAndAddChild(HtmlDfn.class); }
	/**
	 * Create an 'em' element as a child of this element
	 * @return The created child element
	 */
	public HtmlEm em() { return createAndAddChild(HtmlEm.class); }
	/**
	 * Create an 'embed' element as a child of this element
	 * @return The created child element
	 */
	public HtmlEmbed embed() { return createAndAddChild(HtmlEmbed.class); }
	/**
	 * Create an 'i' element as a child of this element
	 * @return The created child element
	 */
	public HtmlI i() { return createAndAddChild(HtmlI.class); }
	/**
	 * Create an 'iframe' element as a child of this element
	 * @return The created child element
	 */
	public HtmlIFrame iframe() { return createAndAddChild(HtmlIFrame.class); }
	/**
	 * Create an 'img' element as a child of this element
	 * @return The created child element
	 */
	public HtmlImg img() { return createAndAddChild(HtmlImg.class); }
	/**
	 * Create an 'input' element as a child of this element
	 * @return The created child element
	 */
	public HtmlInput input() { return createAndAddChild(HtmlInput.class); }
	/**
	 * Create an 'kbd' element as a child of this element
	 * @return The created child element
	 */
	public HtmlKbd kbd() { return createAndAddChild(HtmlKbd.class); }
	/**
	 * Create an 'label' element as a child of this element
	 * @return The created child element
	 */
	public HtmlLabel label() { return createAndAddChild(HtmlLabel.class); }
	/**
	 * Create an 'mark' element as a child of this element
	 * @return The created child element
	 */
	public HtmlMark mark() { return createAndAddChild(HtmlMark.class); }
	/**
	 * Create an 'meter' element as a child of this element
	 * @return The created child element
	 */
	public HtmlMeter meter() { return createAndAddChild(HtmlMeter.class); }
	/**
	 * Create an 'output' element as a child of this element
	 * @return The created child element
	 */
	public HtmlOutput output() { return createAndAddChild(HtmlOutput.class); }
	/**
	 * Create an 'progress' element as a child of this element
	 * @return The created child element
	 */
	public HtmlProgress progress() { return createAndAddChild(HtmlProgress.class); }
	/**
	 * Create an 'q' element as a child of this element
	 * @return The created child element
	 */
	public HtmlQ q() { return createAndAddChild(HtmlQ.class); }
	/**
	 * Create an 'ruby' element as a child of this element
	 * @return The created child element
	 */
	public HtmlRuby ruby() { return createAndAddChild(HtmlRuby.class); }
	/**
	 * Create an 's' element as a child of this element
	 * @return The created child element
	 */
	public HtmlS s() { return createAndAddChild(HtmlS.class); }
	/**
	 * Create an 'samp' element as a child of this element
	 * @return The created child element
	 */
	public HtmlSamp samp() { return createAndAddChild(HtmlSamp.class); }
	/**
	 * Create an 'script' element as a child of this element
	 * @return The created child element
	 */
	public HtmlScript script() { return createAndAddChild(HtmlScript.class); }
	/**
	 * Create an 'noscript' element as a child of this element
	 * @return The created child element
	 */
	public HtmlNoScript noScript() { return createAndAddChild(HtmlNoScript.class); }
	/**
	 * Create an 'select' element as a child of this element
	 * @return The created child element
	 */
	public HtmlSelect select() { return createAndAddChild(HtmlSelect.class); }
	/**
	 * Create an 'small' element as a child of this element
	 * @return The created child element
	 */
	public HtmlSmall small() { return createAndAddChild(HtmlSmall.class); }
	/**
	 * Create an 'span' element as a child of this element
	 * @return The created child element
	 */
	public HtmlSpan span() { return createAndAddChild(HtmlSpan.class); }
	/**
	 * Create an 'strong' element as a child of this element
	 * @return The created child element
	 */
	public HtmlStrong strong() { return createAndAddChild(HtmlStrong.class); }
	/**
	 * Create an 'sub' element as a child of this element
	 * @return The created child element
	 */
	public HtmlSub sub() { return createAndAddChild(HtmlSub.class); }
	/**
	 * Create an 'sup' element as a child of this element
	 * @return The created child element
	 */
	public HtmlSup sup() { return createAndAddChild(HtmlSup.class); }
	/**
	 * Create an 'texarea' element as a child of this element
	 * @return The created child element
	 */
	public HtmlTextArea textArea() { return createAndAddChild(HtmlTextArea.class); }
	/**
	 * Create an 'u' element as a child of this element
	 * @return The created child element
	 */
	public HtmlU u() { return createAndAddChild(HtmlU.class); }
	/**
	 * Create an 'var' element as a child of this element
	 * @return The created child element
	 */
	public HtmlVar var() { return createAndAddChild(HtmlVar.class); }
	/**
	 * Create an 'wbr' element as a child of this element
	 * @return This element
	 */
	public T wbr() { createAndAddChild(HtmlWbr.class); return (T) this; }
	

}
