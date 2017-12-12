package com.k2.Html5Builder;

import java.io.PrintWriter;

public class DefaultPageExample {

	public static void main(String[] args) {
		
		Html5Builder hb = new Html5Builder();
		
		hb.page().toHtml(new PrintWriter(System.out)).flush();
		
	}

}
