package com.k2.Html5Builder.elements;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlFlowElement;
import com.k2.Html5Builder.HtmlPage;

public class HtmlBody extends HtmlFlowElement<HtmlBody> {
	
	public HtmlBody onAfterPrint(String value) { attr("onAfterPrint", value); return this; }
	public HtmlBody onBeforePrint(String value) { attr("onBeforePrint", value); return this; }
	public HtmlBody onBeforeUnload(String value) { attr("onBeforeUnload", value); return this; }
	public HtmlBody onError(String value) { attr("onError", value); return this; }
	public HtmlBody onHashChange(String value) { attr("onHashChange", value); return this; }
	public HtmlBody onLoad(String value) { attr("onLoad", value); return this; }
	public HtmlBody onMessage(String value) { attr("onMessage", value); return this; }
	public HtmlBody onOffline(String value) { attr("onOffLine", value); return this; }
	public HtmlBody onOnLine(String value) { attr("onOnLine", value); return this; }
	public HtmlBody onPageHide(String value) { attr("onPageHide", value); return this; }
	public HtmlBody onPageShow(String value) { attr("onPageShow", value); return this; }
	public HtmlBody onPopState(String value) { attr("onPopState", value); return this; }
	public HtmlBody onResize(String value) { attr("onResize", value); return this; }
	public HtmlBody onStorage(String value) { attr("onStorage", value); return this; }
	public HtmlBody onUnload(String value) { attr("onUnload", value); return this; }

	public HtmlBody(Html5Builder hb) {
		super(hb, "body");
		
	}
	
}
