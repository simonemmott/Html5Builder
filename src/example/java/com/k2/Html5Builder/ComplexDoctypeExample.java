package com.k2.Html5Builder;

import java.io.PrintWriter;

import com.k2.Html5Builder.elements.HtmlBody;
import com.k2.Html5Builder.elements.HtmlHead;
import com.k2.Html5Builder.elements.attrValues.Target;

public class ComplexDoctypeExample {

	public static void main(String[] args) {

		Html5Builder hb = new Html5Builder();
		
		hb.page(true, // includeXmlProlog
				true, // allowOptionalEndTags
				true, // system
				"-//K2//K2 Sample document v1.0//EN", // Formal Public Identifier
				"http://k2.com/sample/sampleDoc.dtd") // URL of document DTD
		.toHtml(new PrintWriter(System.out)).flush();

	}

}
