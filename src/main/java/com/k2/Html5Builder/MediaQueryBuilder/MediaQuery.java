package com.k2.Html5Builder.MediaQueryBuilder;

import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.Attribute;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.EnumeratedValue;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.ValueUnit;

/**
 * The class defines a basic media query.
 * 
 * The media query can be for a device or attribute or attribute and value
 * More complex media queries are created by adding MediaQuery to a MediaQueryGroup
 * 
 * @author simon
 *
 */
public class MediaQuery {
	
	
	StringBuilder queryBuff = new StringBuilder();
	
	MediaQuery() {}
	
	/**
	 * Create a media query for the given device
	 * 
	 * @param device The device for the media query
	 */
	MediaQuery(MediaQueryBuilder.Device device) {
		queryBuff.append("(")
			.append(device.getValue())
			.append(")");
	}

	/**
	 * Create a media query for the given attribute
	 * 
	 * @param attribute The attribute for the media query
	 */
	MediaQuery(Attribute attribute) {
		queryBuff.append("(")
			.append(attribute.getValue())
			.append(")");
	}

	/**
	 * Create a media query for the given attribute and enumerated value
	 * 
	 * @param attribute	The attribute for the media query
	 * @param enumValue	The enumerated value for the media query
	 */
	MediaQuery(Attribute attribute, EnumeratedValue enumValue) {
		queryBuff.append("(")
			.append(attribute.getValue())
			.append(": ")
			.append(enumValue.getValue())
			.append(")");
	}

	/**
	 * Create a media query for the given attribute, scalar value and unit
	 * 
	 * @param attribute	The attribute for the media query
	 * @param magnitude	The scalar value for the media query
	 * @param unit	The units of the scalar value
	 */
	MediaQuery(Attribute attribute, Integer magnitude, ValueUnit unit) {
		queryBuff.append("(")
			.append(attribute.getValue())
			.append(": ")
			.append(magnitude)
			.append(unit.getValue())
			.append(")");
	}

	/**
	 * Create media query for the given attribute and string value
	 * @param attribute	The attribute for the media query
	 * @param value	The string value for the media query
	 */
	MediaQuery(Attribute attribute, String value) {
		queryBuff.append("(")
			.append(attribute.getValue())
			.append(": ")
			.append(value)
			.append(")");
	}
	
	/**
	 * This method returns a string representing this media query
	 * @return	The string representing the media query
	 */
	public String query() { return queryBuff.toString(); }

}
