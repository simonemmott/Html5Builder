package com.k2.Html5Builder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import com.k2.Html5Builder.elements.HtmlBody;
import com.k2.Html5Builder.elements.HtmlDiv;
import com.k2.Html5Builder.elements.HtmlHead;
import com.k2.Html5Builder.elements.HtmlP;
import com.k2.Html5Builder.elements.HtmlSection;
import com.k2.Html5Builder.elements.attrValues.Target;

public class BasicExample {

	public static void main(String[] args) throws FileNotFoundException {

		Html5Builder hb = new Html5Builder().setIndent("  ").setWarngingLog(Logger.getLogger("Html Builder Warning"));
		
		hb.page()
			.head
				.title("Html5Builder docs index page")
				.author("Simon Emmott")
				.description("This page is an index to the Html5Builder documentation")
				.keywords("Html5Builder", "Index")
				.up(HtmlPage.class)
			.body
				.section()
					.h().text("Html5Builder documentation").up(HtmlSection.class)
					.div()
						.p().text("This page was generated using the Html5Builder").up(HtmlDiv.class)
						.p()
							.text("The Github project for Html5Builder can be found at")
							.a().setHref("https://github.com/simonemmott/Html5Builder").text("Html5Builder").up(HtmlP.class)
							.up(HtmlDiv.class)
						.p()
							.text("The javadoc for the Html5Builder can be found")
							.a().setHref("https://simonemmott.github.io/Html5Builder/javadoc/").text("here").up(HtmlP.class)
							.up(HtmlDiv.class)
						.p()
							.text("The headings sample can be viewed")
							.a().setHref("https://simonemmott.github.io/Html5Builder/sample.html").text("here").up(HtmlP.class)
							.page()
		.toHtml(new File("docs/index.html"));

	}

}
