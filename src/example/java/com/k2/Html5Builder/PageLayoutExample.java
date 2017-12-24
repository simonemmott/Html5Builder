package com.k2.Html5Builder;

import java.io.PrintWriter;

import com.k2.Html5Builder.elements.HtmlBody;
import com.k2.Html5Builder.elements.HtmlHead;
import com.k2.Html5Builder.elements.attrValues.Target;

public class PageLayoutExample {

	public static void main(String[] args) {

		Html5Builder hb = new Html5Builder().includeProlog(false).setIndent("  ");
		
		hb.page().toHtml(new PrintWriter(System.out)).flush();

	}

}
