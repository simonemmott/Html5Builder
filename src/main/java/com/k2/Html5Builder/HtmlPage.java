package com.k2.Html5Builder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;

import com.k2.Html5Builder.elements.HtmlBody;
import com.k2.Html5Builder.elements.HtmlHead;
import com.k2.XMLBuilder.XMLDocument;

/**
 * This class defines an HtmlPage instance.
 * 
 * HtmlPage instants automatically contain the 'head' and 'body' tags.
 * These two tags are added to the contents of the 'html' XMLElement as ususal
 * and are also exposed as protected fields.
 * 
 * HtmlPages also define the &lt;DOCTYPE&gt; tag
 * 
 * @author simon
 *
 */
public class HtmlPage extends XMLDocument {
	
	/**
	 * The head HtmlElement
	 */
	HtmlHead head;
	/**
	 * The body HtmlElement
	 */
	HtmlBody body;
	
	private String docType;
	private boolean includeXmlProlog = false;
	
	/**
	 * Override the setVersion(...) method to return this;
	 */
	@Override
	public HtmlPage setVersion(String version) {
		super.setVersion(version);
		return this;
	}
	
	/**
	 * Override the setEncoding(...) method to return this;
	 */
	@Override
	public HtmlPage setEncoding(String encoding) {
		super.setEncoding(encoding);
		return this;
	}
	
	/**
	 * Override the prolog() method to return the doctype rather than the xml prolog unless 
	 * includeXmlProlog has been set on the HtmlPage in which case both the xml prolog and
	 * the doctype is returned
	 */
	@Override
	protected String prolog() { 
		if (includeXmlProlog) return super.prolog()+System.lineSeparator()+"<!DOCTYPE "+docType+">";
		return "<!DOCTYPE "+docType+">"; 
	}
	
	/**
	 * Create an instance of the HtmlPage element
	 * 
	 * Setting the doctype to the given docType and the html builder that created the html page
	 * This method also sets the head and body fields to appropriate html elements in the pages contents
	 * 
	 * @param hb		The html builder that created the html page
	 * @param docType	The doctype of this page
	 */
	public HtmlPage(Html5Builder hb, String docType) {
		super(hb, "html");
		this.docType = docType;
		head = hb.element(HtmlHead.class);
		add(head);
		body = hb.element(HtmlBody.class);
		add(body);
	}
	
	/**
	 * Create an instance of the HtmlPage element
	 * 
	 * Setting the doctype to the given docType and the html builder that created the html page and identifying
	 * whether or not to include the Xml prolog
	 * This method also sets the head and body fields to appropriate html elements in the pages contents
	 * 
	 * @param hb		The html builder that created the html page
	 * @param docType	The doctype of this page
	 * @param includeXmlProlog	True if the xml prolog should also be included with the doctype
	 */
	public HtmlPage(Html5Builder hb, String docType, boolean includeXmlProlog) {
		super(hb, "html");
		this.includeXmlProlog = includeXmlProlog;
		this.docType = docType;
		head = hb.element(HtmlHead.class);
		add(head);
		body = hb.element(HtmlBody.class);
		add(body);
	}
	
	/**
	 * A better named method to generate the html to a print writer
	 * @param pw		The print writer that will be used to output the html
	 * @return	The print writer after writing this page's html 
	 */
	public PrintWriter toHtml(PrintWriter pw) { return toXml(pw); }
	/**
	 * A better named method to generate the html to a writer
	 * @param w	The writer that will be used to output the html
	 * @return	The writer after writing this page's html
	 */
	public Writer toHtml(Writer w) { return toXml(w); }
	/**
	 * A better named method to generate the html in a file
	 * @param file	The file into which the html will be written
	 * @return	The file after the html had been written
	 * @throws FileNotFoundException		If the given file cannot be created or opened for writing
	 */
	public File toHtml(File file) throws FileNotFoundException { return toXml(file); }

}
