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
public abstract class HtmlPhrasingElement<T extends XMLElement> extends HtmlCommonPhrasingElement<T> {

	
	protected HtmlPhrasingElement(Html5Builder hb, String tag) {
		super(hb, tag);
	}
		
	public HtmlA a() { return createAndAddChild(HtmlA.class); }
	public HtmlAudio audio() { return createAndAddChild(HtmlAudio.class); }
	public HtmlCanvas canvas() { return createAndAddChild(HtmlCanvas.class); }
	public HtmlDel del() { return createAndAddChild(HtmlDel.class); }
	public HtmlIns ins() { return createAndAddChild(HtmlIns.class); }
	public HtmlMap map() { return createAndAddChild(HtmlMap.class); }
	public HtmlObject object() { return createAndAddChild(HtmlObject.class); }
	public HtmlVideo video() { return createAndAddChild(HtmlVideo.class); }


}
