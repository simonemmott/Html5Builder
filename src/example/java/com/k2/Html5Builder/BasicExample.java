package com.k2.Html5Builder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class BasicExample {

	public static void main(String[] args) {

//		Html5Builder hb = new Html5Builder().setIndent("  ").includeProlog(false);
		Html5Builder hb = new Html5Builder().setIndent("  ");
//		Html5Builder hb = new Html5Builder();
		
		
//		try {
			hb.page()
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
