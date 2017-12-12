package com.k2.Html5Builder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;

import com.k2.Html5Builder.elements.HtmlBody;
import com.k2.Html5Builder.elements.HtmlHead;
import com.k2.XMLBuilder.XMLDocument;

public class HtmlPage extends XMLDocument {
	
	HtmlHead head;
	HtmlBody body;
	
	@Override
	protected String prolog() { return "<!DOCTYPE html>"; }
	
	public HtmlPage(Html5Builder hb) {
		super(hb, "html");
		head = hb.element(HtmlHead.class);
		add(head);
		body = hb.element(HtmlBody.class);
		add(body);
	}
	
	public PrintWriter toHtml(PrintWriter pw) { return toXml(pw); }
	public Writer toHtml(Writer w) { return toXml(w); }
	public File toHtml(File file) throws FileNotFoundException { return toXml(file); }

}
