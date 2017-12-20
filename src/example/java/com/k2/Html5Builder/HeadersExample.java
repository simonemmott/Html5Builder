package com.k2.Html5Builder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import com.k2.Html5Builder.elements.HtmlDiv;
import com.k2.Html5Builder.elements.HtmlH;
import com.k2.Html5Builder.elements.HtmlSection;
import com.k2.Html5Builder.elements.attrValues.Target;
import com.k2.XMLBuilder.XMLElement;

public class HeadersExample {

	public static void main(String[] args) {

		Html5Builder hb = new Html5Builder().setIndent("  ");
		HtmlPage page = hb.page();
		try {
			page
				.head
					.base()
						.setHref("http://www.example.com/mySite/")
						.setTarget(Target.PARENT)
						.page()
				.body
				.section()
					.h().text("This is a header").up(HtmlSection.class)
					.div()
						.p().text("This is a paragraoh").up(HtmlDiv.class)
						.p().text("This is another paragraph").up(HtmlDiv.class)
						.section()
							.h().text("This is a lower level header").up(HtmlSection.class)
							.div()
								.p().text("Yet more paragraphs").up(HtmlDiv.class)
								.section()
									.h().text("Final Header").up(HtmlSection.class)
									.div()
										.p().text("This is the lowest parapgraph").up(HtmlDiv.class) 
										.up(HtmlSection.class)
									.up(HtmlDiv.class)
								.up(HtmlSection.class)
							.up(HtmlDiv.class)
						.section()
							.h().text("This is a lower level header").up(HtmlSection.class)
							.div()
								.p().text("Yet more paragraphs").up(HtmlDiv.class)
								.section()
									.h().text("Final Header").up(HtmlSection.class)
									.div()
										.p().text("This is the lowest parapgraph").up(HtmlDiv.class) 
										.page()
			.toHtml(new File("headerExample.html"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
