package com.k2.Html5Builder;

import java.io.PrintWriter;

import com.k2.Html5Builder.elements.HtmlBody;
import com.k2.Html5Builder.elements.HtmlHead;
import com.k2.Html5Builder.elements.attrValues.MetaName;
import com.k2.Html5Builder.elements.attrValues.Target;

public class ComplexHeadExample {

	public static void main(String[] args) {

		Html5Builder hb = new Html5Builder();
		
		hb.page()
			.head
				.title()
					.t("This is the page title")
					.up(HtmlHead.class)
				.meta()
					.setName(MetaName.AUTHOR)
					.setContent("Simon Emmott")
					.up(HtmlHead.class)
				.meta()
					.setName(MetaName.DESCRIPTION)
					.setContent("This is the page description")
					.up(HtmlHead.class)
				.meta()
					.setName(MetaName.KEYWORDS)
					.setContent("lots, world, and, more, of, words, hello, many")
					.up(HtmlHead.class)
				.base()
					.setHref("http://www.example.com/mySite/")
					.page()
		.toHtml(new PrintWriter(System.out)).flush();

	}

}
