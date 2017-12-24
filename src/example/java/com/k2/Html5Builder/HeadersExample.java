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

	public static void main(String[] args) throws FileNotFoundException {

		Html5Builder hb = new Html5Builder().setIndent("  ");
		hb.page()
			.body
				.section()
					.h().text("This is the top level header").up(HtmlSection.class)
					.div()
						.p().text("This is a paragraph in the highest level").up(HtmlDiv.class)
						.p().text("This is another paragraph in the highest level").up(HtmlDiv.class)
						.section()
							.h().text("This is a header below the top level").up(HtmlSection.class)
							.div()
								.p().text("Yet more paragraphs").up(HtmlDiv.class)
								.section()
									.h().text("This is a low level header").up(HtmlSection.class)
									.div()
										.p().text("This is a parapgraph a the lowest level").up(HtmlDiv.class) 
										.up(HtmlSection.class)
									.up(HtmlDiv.class)
								.up(HtmlSection.class)
							.up(HtmlDiv.class)
						.section()
							.h().text("This is a another header below the top level").up(HtmlSection.class)
							.div()
								.p().text("Yet another paragraph").up(HtmlDiv.class)
								.section()
									.h().text("This is another lowest level header").up(HtmlSection.class)
									.div()
										.p().text("This is another paragraph at the lowest level").up(HtmlDiv.class) 
										.page()
			.toHtml(new File("docs/heading-sample.html"));

	}

}
