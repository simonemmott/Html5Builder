package com.k2.Html5Builder.MediaQueryBuilder;

/**
 * The media query builder is a simple implementation of an API to build syntactically correct media queries.
 * 
 * @author simon
 *
 */
public class MediaQueryBuilder {
	
	/**
	 * The media query operators
	 * 
	 * @author simon
	 *
	 */
	public enum Operator{
		/**
		 * The and operator
		 */
		AND("and"),
		/**
		 * The not operator
		 */
		NOT("not"),
		/**
		 * The or operator
		 */
		OR(",");
		
		String value;
		Operator(String value) { this.value = value; }
		/**
		 * Get the media query text for the operator
		 * @return The media query string
		 */
		public String getValue() { return value; }
	}
	
	/**
	 * The media query devices
	 * 
	 * @author simon
	 *
	 */
	public enum Device{
		/**
		 * All devices
		 */
		ALL("all"),
		/**
		 * Printer devices
		 */
		PRINT("print"),
		/**
		 * Screen devices
		 */
		SCREEN("screen"),
		/**
		 * Audio screen reader devices
		 */
		SPEACH("speach");
		
		String value;
		Device(String value) { this.value = value; }
		/**
		 * Get the media query text for the device
		 * @return	The media query string
		 */
		public String getValue() { return value; }
	}
	
	/**
	 * The media query attributes
	 * 
	 * @author simon
	 *
	 */
	public enum Attribute{
		/**
		 * The aspect ratio attribute
		 */
		ASPECT_RATIO("aspect-ratio"),
		/**
		 * The minimum aspect ratio attribute
		 */
		ASPECT_RATIO_MIN("min-aspect-ratio"),
		/**
		 * The maximum aspect ratio attribute
		 */
		ASPECT_RATIO_MAX("max-aspect-ratio"),
		/**
		 * The number of bytes defining the colors supported by the device attribute
		 */
		COLOR("color"),
		/**
		 * The minimum number of bytes defining the colors supported by the device attribute
		 */
		COLOR_MIN("min-color"),
		/**
		 * The maximum number of bytes defining the colors supported by the device attribute
		 */
		COLOR_MAX("max-color"),
		/**
		 * The number of entries in the output device's color lookup table
		 */
		COLOR_INDEX("color-index"),
		/**
		 * The minimum number of entries in the output device's color lookup table
		 */
		COLOR_INDEX_MIN("min-color-index"),
		/**
		 * The maximum number of entries in the output device's color lookup table
		 */
		COLOR_INDEX_MAX("max-color-index"),
		/**
		 * Does the device use a grid or a bitmapped screen
		 */
		GRID("grid"),
		/**
		 * The height of the output device
		 */
		HIEGHT("height"),
		/**
		 * The minimum height of the output device
		 */
		HIEGHT_MIN("min-height"),
		/**
		 * The maximum height of the output device
		 */
		HIEGHT_MAX("max-height"),
		/**
		 * The bits per pixel in the output device's monochrome frame buffer, or zero if the device isn't monochrome
		 */
		MONOCHROME("monochrome"),
		/**
		 * The minimum bits per pixel in the output device's monochrome frame buffer, or zero if the device isn't monochrome
		 */
		MONOCHROME_MIN("min-monochrome"),
		/**
		 * The maximum bits per pixel in the output device's monochrome frame buffer, or zero if the device isn't monochrome
		 */
		MONOCHROME_MAX("max-monochrome"),
		/**
		 * The minimum aspect ratio attribute
		 */
		ORIENTATION("orientation"),
		/**
		 * The orientation of the viewport
		 */
		RESOLUTION("resolution"),
		/**
		 * The pixel density of the output device in dots per inch
		 */
		RESOLUTION_MIN("min-resolution"),
		/**
		 * The minimum pixel density of the output device in dots per inch
		 */
		RESOLUTION_MAX("max-resolution"),
		/**
		 * The maximum pixel density of the output device in dots per inch
		 */
		SCAN("scan"),
		/**
		 * The scanning process of the output device
		 */
		WIDTH("width"),
		/**
		 * The minimum scanning process of the output device
		 */
		WIDTH_MIN("min-width"),
		/**
		 * The maximum scanning process of the output device
		 */
		WIDTH_MAX("max-width");
		
		String value;
		Attribute(String value) { this.value = value; }
		/**
		 * Get the media query text for the attribute
		 * @return	The media query string
		 */
		public String getValue() { return value; }
	}
	
	public interface EnumeratedValue {
		public String getValue();
	}

	/**
	 * Possible values for the grid attribute
	 * 
	 * @author simon
	 *
	 */
	public enum GridValues implements EnumeratedValue {
		ONE("1"),
		ZERO("0");
		
		String value;
		GridValues(String value) { this.value = value; }
		/**
		 * Get the media query text for the attribute value
		 * @return	The media query string
		 */
		public String getValue() { return value; }
	}
	
	/**
	 * Possible values for the orientation attribute
	 * 
	 * @author simon
	 *
	 */
	public enum OrientationValues  implements EnumeratedValue {
		PORTRAIT("portrait"),
		LANDSCAPE("landscape");
		
		String value;
		OrientationValues(String value) { this.value = value; }
		/**
		 * Get the media query text for the attribute value
		 * @return	The media query string
		 */
		public String getValue() { return value; }
	}
	
	/**
	 * Possible values for the scan attribute
	 * 
	 * @author simon
	 *
	 */
	public enum ScanValues implements EnumeratedValue {
		PROGRESSIVE("progressive"),
		INTERLACED("interlaced");
		
		String value;
		/**
		 * Get the media query text for the attribute value
		 * @return	The media query string
		 */
		ScanValues(String value) { this.value = value; }
		public String getValue() { return value; }
	}
	
	/**
	 * Possible media query value units
	 * 
	 * @author simon
	 *
	 */
	public enum ValueUnit {
		EM("em"),
		PX("px"),
		DPI("dpi");
		
		String value;
		ValueUnit(String value) { this.value = value; }
		/**
		 * Get the media query text for the value unit
		 * @return	The media query string
		 */
		public String getValue() { return value; }
	}
	
	/**
	 * Create a new media query group that has been negated
	 * @return the new media query group
	 */
	public static MediaQueryGroup not() {
		return new MediaQueryGroup(null, true);
	}
	
	/**
	 * Create a new media query group
	 * @return the new media query group
	 */
	public static MediaQueryGroup group() {
		return new MediaQueryGroup(null, false);
	}
	
	/**
	 * Create a new media query for the given device
	 * @param device The device for the media query
	 * @return	The media query for the given device
	 */
	public static MediaQuery device(Device device) {
		return new MediaQuery(device);
	}

	/**
	 * Create a new media query for the given attribute
	 * @param attribute	The attribute for the media query
	 * @return	The media query for the given attribute
	 */
	public static MediaQuery attribute(Attribute attribute) {
		return new MediaQuery(attribute);
	}

	/**
	 * Create a new media query for the given attribute and enumerated value
	 * @param attribute	The attribute for the media query
	 * @param enumValue The enumerated value for the media query
	 * @return The media query for the given attribute and enumerated value
	 */
	public static MediaQuery attribute(Attribute attribute, EnumeratedValue enumValue) {
		return new MediaQuery(attribute, enumValue);
	}

	/**
	 * Create a new media query for the given attribute, scalar value and unit
	 * @param attribute	The attribute for the media query
	 * @param value	The scalar value for the media query
	 * @param unit	The unit of the scalar value
	 * @return	The media query for the given attribute, scalar value and unit
	 */
	public static MediaQuery attribute(Attribute attribute, Integer value, ValueUnit unit) {
		return new MediaQuery(attribute, value, unit);
	}

	/**
	 * Create a new media query for the given attribute and string value
	 * @param attribute	The attribute for the media query
	 * @param value	The string value for the media query
	 * @return The media query for the given attribute and string value
	 */
	public static MediaQuery attribute(Attribute attribute, String value) {
		return new MediaQuery(attribute, value);
	}
	


}
