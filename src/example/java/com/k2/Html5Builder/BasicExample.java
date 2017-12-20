package com.k2.Html5Builder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import com.k2.Html5Builder.elements.HtmlBody;
import com.k2.Html5Builder.elements.HtmlHead;
import com.k2.Html5Builder.elements.attrValues.Target;

public class BasicExample {

	public static void main(String[] args) {

//		Html5Builder hb = new Html5Builder().setIndent("  ").includeProlog(false);
		Html5Builder hb = new Html5Builder().setIndent("  ");
//		Html5Builder hb = new Html5Builder();
		
		
//		try {
			hb.page(true, false, true, null, "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd")
				.setVersion("0.9")
				.setEncoding("UTF-16")
				.head
					.refreshRate(30)
					.viewport("Some other viewport")
					.author("Simon Emmott")
					.description("This is the page description")
					.keywords("hello", "world", "and", "more", "words", "lots, and, lots, of, words")
					.author("Joe Bloggs!")
					.keywords("more", "words")
					.base()
						.setHref("http://www.example.com/mySite/")
						.setTarget(Target.PARENT)
						.up(HtmlHead.class)
					.author("Yet another author")
					.up(HtmlPage.class)
				.body
				.a()
					.setHref("http://google.com")
					.data("Google")
					.up(HtmlBody.class)
				.abbr()
					.setTitle("World Health Organisation")
					.text("WHO")
					.page()
			.toHtml(new PrintWriter(System.out)).flush();
//			.toHtml(new File("myFile.html"));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
