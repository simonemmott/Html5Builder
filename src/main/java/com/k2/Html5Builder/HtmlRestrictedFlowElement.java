package com.k2.Html5Builder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;

import com.k2.Html5Builder.elements.*;
import com.k2.Html5Builder.elements.attrValues.HtmlLanguageCode;
import com.k2.XMLBuilder.XMLElement;
import com.k2.XMLBuilder.XMLBuilder.NullAttributeHandling;

@SuppressWarnings({"unchecked", "rawtypes"})
public abstract class HtmlRestrictedFlowElement<T extends XMLElement> extends HtmlCommonPhrasingElement<T> {

	
	protected HtmlRestrictedFlowElement(Html5Builder hb, String tag) {
		super(hb, tag);
	}
		
	public HtmlA a() { return createAndAddChild(HtmlA.class); }
	public HtmlArticle article() { return createAndAddChild(HtmlArticle.class); }
	public HtmlAside aside() { return createAndAddChild(HtmlAside.class); }
	public HtmlAudio audio() { return createAndAddChild(HtmlAudio.class); }
	public HtmlBlockQuote blockQuote() { return createAndAddChild(HtmlBlockQuote.class); }
	public HtmlCanvas canvas() { return createAndAddChild(HtmlCanvas.class); }
	public HtmlDel del() { return createAndAddChild(HtmlDel.class); }
	public HtmlDetails details() { return createAndAddChild(HtmlDetails.class); }
	public HtmlDiv div() { return createAndAddChild(HtmlDiv.class); }
	public HtmlDl dl() { return createAndAddChild(HtmlDl.class); }
	public HtmlFieldSet fieldSet() { return createAndAddChild(HtmlFieldSet.class); }
	public HtmlFigure figure() { return createAndAddChild(HtmlFigure.class); }
	public HtmlForm form() { return createAndAddChild(HtmlForm.class); }
	public HtmlH h() { return createAndAddChild(HtmlH.class); }
	public HtmlH1 h1() { return createAndAddChild(HtmlH1.class); }
	public HtmlH2 h2() { return createAndAddChild(HtmlH2.class); }
	public HtmlH3 h3() { return createAndAddChild(HtmlH3.class); }
	public HtmlH4 h4() { return createAndAddChild(HtmlH4.class); }
	public HtmlH5 h5() { return createAndAddChild(HtmlH5.class); }
	public HtmlH6 h6() { return createAndAddChild(HtmlH6.class); }
	public HtmlHr hr() { return createAndAddChild(HtmlHr.class); }
	public HtmlIns ins() { return createAndAddChild(HtmlIns.class); }
	public HtmlMain main() { return createAndAddChild(HtmlMain.class); }
	public HtmlMap map() { return createAndAddChild(HtmlMap.class); }
	public HtmlNav nav() { return createAndAddChild(HtmlNav.class); }
	public HtmlObject object() { return createAndAddChild(HtmlObject.class); }
	public HtmlOl ol() { return createAndAddChild(HtmlOl.class); }
	public HtmlP p() { return createAndAddChild(HtmlP.class); }
	public HtmlPicture picture() { return createAndAddChild(HtmlPicture.class); }
	public HtmlPre pre() { return createAndAddChild(HtmlPre.class); }
	public HtmlSection section() { return createAndAddChild(HtmlSection.class); }
	public HtmlTable table() { return createAndAddChild(HtmlTable.class); }
	public HtmlUl ul() { return createAndAddChild(HtmlUl.class); }
	public HtmlVideo video() { return createAndAddChild(HtmlVideo.class); }


}
