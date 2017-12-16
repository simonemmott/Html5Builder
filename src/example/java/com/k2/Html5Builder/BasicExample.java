package com.k2.Html5Builder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

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
					.base()
						.setHref("http://www.example.com/mySite/")
						.setTarget(Target.PARENT)
						.page()
				.body
				.a()
					.setHref("http://google.com")
					.data("Google")
					.up()
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
