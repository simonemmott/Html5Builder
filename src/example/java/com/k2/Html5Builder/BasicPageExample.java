package com.k2.Html5Builder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import com.k2.Html5Builder.elements.HtmlBody;
import com.k2.Html5Builder.elements.HtmlHead;
import com.k2.Html5Builder.elements.attrValues.Target;

public class BasicPageExample {

	public static void main(String[] args) {

		Html5Builder hb = new Html5Builder();
		
		hb.page()
			.head
				.title("This is the page title")
				.author("Simon Emmott")
				.description("This is the page description")
				.keywords("hello", "world", "and", "more", "words", "lots, and, lots, of, words")
				.keywords("many", "words")
				.base("http://www.example.com/mySite/")
				.page()
			.body
				.a()
					.setHref("http://google.com")
					.t("Google")
					.up(HtmlBody.class)
				.abbr()
					.setTitle("World Health Organisation")
					.text("WHO")
					.page()
		.toHtml(new PrintWriter(System.out)).flush();

	}

}
