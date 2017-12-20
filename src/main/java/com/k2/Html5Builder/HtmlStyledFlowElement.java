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
public abstract class HtmlStyledFlowElement<T extends XMLElement> extends HtmlFlowElement<T> {

	
	protected HtmlStyledFlowElement(Html5Builder hb, String tag) {
		super(hb, tag);
	}
		
	public HtmlStyle style() { return createAndAddChild(HtmlStyle.class); }


}
