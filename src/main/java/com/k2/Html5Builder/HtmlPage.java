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
	
	private String docType;
	private boolean includeXmlProlog = false;
	
	@Override
	public HtmlPage setVersion(String version) {
		super.setVersion(version);
		return this;
	}
	
	@Override
	public HtmlPage setEncoding(String encoding) {
		super.setEncoding(encoding);
		return this;
	}
	
	@Override
	protected String prolog() { 
		if (includeXmlProlog) return super.prolog()+System.lineSeparator()+"<!DOCTYPE "+docType+">";
		return "<!DOCTYPE "+docType+">"; 
	}
	
	public HtmlPage(Html5Builder hb, String docType) {
		super(hb, "html");
		this.docType = docType;
		head = hb.element(HtmlHead.class);
		add(head);
		body = hb.element(HtmlBody.class);
		add(body);
	}
	
	public HtmlPage(Html5Builder hb, String docType, boolean includeXmlProlog) {
		super(hb, "html");
		this.includeXmlProlog = includeXmlProlog;
		this.docType = docType;
		head = hb.element(HtmlHead.class);
		add(head);
		body = hb.element(HtmlBody.class);
		add(body);
	}
	
	public PrintWriter toHtml(PrintWriter pw) { return toXml(pw); }
	public Writer toHtml(Writer w) { return toXml(w); }
	public File toHtml(File file) throws FileNotFoundException { return toXml(file); }

}
