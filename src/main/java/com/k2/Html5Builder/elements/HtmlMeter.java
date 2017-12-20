package com.k2.Html5Builder.elements;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;

import com.k2.Html5Builder.Html5Builder;
import com.k2.Html5Builder.HtmlElement;
import com.k2.Html5Builder.HtmlPhrasingElement;

public class HtmlMeter extends HtmlPhrasingElement<HtmlMeter> {
	
	public HtmlMeter setForm(String value) { attr("form", value); return this; }
	public HtmlMeter setHigh(Double value) { attr("high", value.toString()); return this; }
	public HtmlMeter setHigh(Integer value) { attr("high", value.toString()); return this; }
	public HtmlMeter setLow(Double value) { attr("low", value.toString()); return this; }
	public HtmlMeter setLow(Integer value) { attr("low", value.toString()); return this; }
	public HtmlMeter setMax(Double value) { attr("max", value.toString()); return this; }
	public HtmlMeter setMax(Integer value) { attr("max", value.toString()); return this; }
	public HtmlMeter setMin(Double value) { attr("min", value.toString()); return this; }
	public HtmlMeter setMin(Integer value) { attr("min", value.toString()); return this; }
	public HtmlMeter setOptimum(Double value) { attr("optimum", value.toString()); return this; }
	public HtmlMeter setOptimum(Integer value) { attr("optimum", value.toString()); return this; }
	public HtmlMeter setValue(Double value) { attr("value", value.toString()); return this; }
	public HtmlMeter setValue(Integer value) { attr("value", value.toString()); return this; }

	public HtmlMeter(Html5Builder hb) {
		super(hb, "meter");		
	}

}
