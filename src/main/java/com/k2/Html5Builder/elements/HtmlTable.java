package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

/**
 * A class representing an 'table' html element
 * 
 * @author simon
 *
 */
public class HtmlTable extends HtmlElement<HtmlTable> {
	
	/**
	 * Create the element instance setting the appropriate tag and defining the html builder that
	 * created the element
	 * @param hb		The html builder that created the element
	 */
	public HtmlTable(Html5Builder hb) {
		super(hb, "table");		
	}

	/**
	 * Create an 'caption' element as a child of this element
	 * @return The created child element
	 */
	public HtmlCaption caption() { return createAndAddChild(HtmlCaption.class); }
	/**
	 * Create an 'colgroup' element as a child of this element
	 * @return The created child element
	 */
	public HtmlColGroup colGroup() { return createAndAddChild(HtmlColGroup.class); }
	/**
	 * Create an 'thead' element as a child of this element
	 * @return The created child element
	 */
	public HtmlTHead tHead() { return createAndAddChild(HtmlTHead.class); }
	/**
	 * Create an 'tbody' element as a child of this element
	 * @return The created child element
	 */
	public HtmlTBody tBody() { return createAndAddChild(HtmlTBody.class); }
	/**
	 * Create an 'tr' element as a child of this element
	 * @return The created child element
	 */
	public HtmlTr tr() { return createAndAddChild(HtmlTr.class); }
	/**
	 * Create an 'tfoot' element as a child of this element
	 * @return The created child element
	 */
	public HtmlTFoot tFoot() { return createAndAddChild(HtmlTFoot.class); }

}
