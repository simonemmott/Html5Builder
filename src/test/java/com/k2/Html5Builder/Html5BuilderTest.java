package com.k2.Html5Builder;

import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.k2.XMLBuilder.XMLBuilder;

/**
 * Unit test for html5Builder.
 */
public class Html5BuilderTest {

	@Test
    public void basicTest()
    {
    	
    		String expectedResult = 	
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + 
				"<root>\n" + 
				"	<elm attr=\"value\">AAAA</elm>\n" + 
				"	<elm attr=\"value2\">BBBB</elm>\n" + 
				"</root>\n";
    	
    		StringWriter sw = new StringWriter();
    		PrintWriter pw = new PrintWriter(sw);
    		
		XMLBuilder xb = new XMLBuilder();
		xb.document("root")
		.elem("elm")
			.attr("attr", "value")
			.data("AAAA")
			.up()
		.elem("elm")
			.attr("attr", "value2")
			.data("BBBB")
			.up()
		.toXml(pw).flush();

		pw.close();
		
        assertEquals( expectedResult, sw.toString());
    }

}
