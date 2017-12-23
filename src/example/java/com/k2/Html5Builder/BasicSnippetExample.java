package com.k2.Html5Builder;

import java.io.PrintWriter;

import com.k2.Html5Builder.elements.HtmlDiv;

public class BasicSnippetExample {

	public static void main(String[] args) {
		
		Html5Builder hb = new Html5Builder();
		
		hb.element(HtmlDiv.class)
			.setClass("myClass")
			.setId("myDiv")
			.a()
				.setHref("http://www.google.com")
				.t("Google")
				.up(HtmlDiv.class)
			.p()
				.t("The above hyperlink links to www.googl.com")
				.up(HtmlDiv.class)
			.toHtml(new PrintWriter(System.out)).flush();
		
	}

}
