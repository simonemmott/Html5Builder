package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;

public class HtmlTable extends HtmlElement<HtmlTable> {
	
	public HtmlTable(Html5Builder hb) {
		super(hb, "table");		
	}

	public HtmlCaption caption() { return createAndAddChild(HtmlCaption.class); }
	public HtmlColGroup colGroup() { return createAndAddChild(HtmlColGroup.class); }
	public HtmlTHead tHead() { return createAndAddChild(HtmlTHead.class); }
	public HtmlTBody tBody() { return createAndAddChild(HtmlTBody.class); }
	public HtmlTr tr() { return createAndAddChild(HtmlTr.class); }
	public HtmlTFoot tFoot() { return createAndAddChild(HtmlTFoot.class); }

}
