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
public abstract class HtmlCommonPhrasingElementNoTime<T extends XMLElement> extends HtmlElement<T> {

	
	protected HtmlCommonPhrasingElementNoTime(Html5Builder hb, String tag) {
		super(hb, tag);
	}
	
	// Common Phrasing Elements
	public HtmlAbbr abbr() { return createAndAddChild(HtmlAbbr.class); }
	public HtmlArea area() { return createAndAddChild(HtmlArea.class); }
	public HtmlB b() { return createAndAddChild(HtmlB.class); }
	public HtmlBdi bdi() { return createAndAddChild(HtmlBdi.class); }
	public HtmlBdo bdo() { return createAndAddChild(HtmlBdo.class); }
	public T br() { createAndAddChild(HtmlBr.class); return (T) this;}
	public HtmlButton button() { return createAndAddChild(HtmlButton.class); }
	public HtmlCite cite() { return createAndAddChild(HtmlCite.class); }
	public HtmlDataList dataList() { return createAndAddChild(HtmlDataList.class); }
	public HtmlDfn dfn() { return createAndAddChild(HtmlDfn.class); }
	public HtmlEm em() { return createAndAddChild(HtmlEm.class); }
	public HtmlEmbed embed() { return createAndAddChild(HtmlEmbed.class); }
	public HtmlI i() { return createAndAddChild(HtmlI.class); }
	public HtmlIFrame iframe() { return createAndAddChild(HtmlIFrame.class); }
	public HtmlImg img() { return createAndAddChild(HtmlImg.class); }
	public HtmlInput input() { return createAndAddChild(HtmlInput.class); }
	public HtmlKbd kbd() { return createAndAddChild(HtmlKbd.class); }
	public HtmlLabel label() { return createAndAddChild(HtmlLabel.class); }
	public HtmlMark mark() { return createAndAddChild(HtmlMark.class); }
	public HtmlMeter meter() { return createAndAddChild(HtmlMeter.class); }
	public HtmlOutput output() { return createAndAddChild(HtmlOutput.class); }
	public HtmlProgress progress() { return createAndAddChild(HtmlProgress.class); }
	public HtmlQ q() { return createAndAddChild(HtmlQ.class); }
	public HtmlRuby ruby() { return createAndAddChild(HtmlRuby.class); }
	public HtmlS s() { return createAndAddChild(HtmlS.class); }
	public HtmlSamp samp() { return createAndAddChild(HtmlSamp.class); }
	public HtmlScript script() { return createAndAddChild(HtmlScript.class); }
	public HtmlNoScript noScript() { return createAndAddChild(HtmlNoScript.class); }
	public HtmlSelect select() { return createAndAddChild(HtmlSelect.class); }
	public HtmlSmall small() { return createAndAddChild(HtmlSmall.class); }
	public HtmlSpan span() { return createAndAddChild(HtmlSpan.class); }
	public HtmlStrong strong() { return createAndAddChild(HtmlStrong.class); }
	public HtmlSub sub() { return createAndAddChild(HtmlSub.class); }
	public HtmlSup sup() { return createAndAddChild(HtmlSup.class); }
	public HtmlTextArea textArea() { return createAndAddChild(HtmlTextArea.class); }
	public HtmlU u() { return createAndAddChild(HtmlU.class); }
	public HtmlVar var() { return createAndAddChild(HtmlVar.class); }
	public T wbr() { createAndAddChild(HtmlWbr.class); return (T) this; }
	

}
