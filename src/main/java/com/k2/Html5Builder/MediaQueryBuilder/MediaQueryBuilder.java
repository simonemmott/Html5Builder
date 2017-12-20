package com.k2.Html5Builder.MediaQueryBuilder;

public class MediaQueryBuilder {
	
	public enum Operator{
		AND("and"),
		NOT("not"),
		OR(",");
		
		String value;
		Operator(String value) { this.value = value; }
		public String getValue() { return value; }
	}
	
	public enum Device{
		ALL("all"),
		PRINT("print"),
		SCREEN("screen"),
		SPEACH("speach");
		
		String value;
		Device(String value) { this.value = value; }
		public String getValue() { return value; }
	}
	
	public enum Attribute{
		ASPECT_RATIO("aspect-ratio"),
		ASPECT_RATIO_MIN("min-aspect-ratio"),
		ASPECT_RATIO_MAX("max-aspect-ratio"),
		COLOR("color"),
		COLOR_MIN("min-color"),
		COLOR_MAX("max-color"),
		COLOR_INDEX("color-index"),
		COLOR_INDEX_MIN("min-color-index"),
		COLOR_INDEX_MAX("max-color-index"),
		GRID("grid"),
		HIEGHT("height"),
		HIEGHT_MIN("min-height"),
		HIEGHT_MAX("max-height"),
		MONOCHROME("monochrome"),
		MONOCHROME_MIN("min-monochrome"),
		MONOCHROME_MAX("max-monochrome"),
		ORIENTATION("orientation"),
		RESOLUTION("resolution"),
		RESOLUTION_MIN("min-resolution"),
		RESOLUTION_MAX("max-resolution"),
		SCAN("scan"),
		WIDTH("width"),
		WIDTH_MIN("min-width"),
		WIDTH_MAX("max-width");
		
		String value;
		Attribute(String value) { this.value = value; }
		public String getValue() { return value; }
	}
	
	public interface EnumeratedValue {
		public String getValue();
	}

	public enum GridValues implements EnumeratedValue {
		ONE("1"),
		ZERO("0");
		
		String value;
		GridValues(String value) { this.value = value; }
		public String getValue() { return value; }
	}
	
	public enum OrientationValues  implements EnumeratedValue {
		PORTRAIT("portrait"),
		LANDSCAPE("landscape");
		
		String value;
		OrientationValues(String value) { this.value = value; }
		public String getValue() { return value; }
	}
	
	public enum ScanValues implements EnumeratedValue {
		PROGRESSIVE("progressive"),
		INTERLACED("interlaced");
		
		String value;
		ScanValues(String value) { this.value = value; }
		public String getValue() { return value; }
	}
	
	public enum ValueUnit {
		EM("em"),
		PX("px"),
		DPI("dpi");
		
		String value;
		ValueUnit(String value) { this.value = value; }
		public String getValue() { return value; }
	}
	
	public static MediaQueryGroup not() {
		return new MediaQueryGroup(null, true);
	}
	
	public static MediaQueryGroup group() {
		return new MediaQueryGroup(null, false);
	}
	
	public static MediaQuery device(Device device) {
		return new MediaQuery(device);
	}

	public static MediaQuery attribute(Attribute attribute) {
		return new MediaQuery(attribute);
	}

	public static MediaQuery attribute(Attribute attribute, EnumeratedValue enumValue) {
		return new MediaQuery(attribute, enumValue);
	}

	public static MediaQuery attribute(Attribute attribute, Integer value, ValueUnit unit) {
		return new MediaQuery(attribute, value, unit);
	}

	public static MediaQuery attribute(Attribute attribute, String value) {
		return new MediaQuery(attribute, value);
	}
	


}
