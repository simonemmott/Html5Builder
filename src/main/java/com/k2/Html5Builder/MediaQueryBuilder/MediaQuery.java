package com.k2.Html5Builder.MediaQueryBuilder;

import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.Attribute;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.EnumeratedValue;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.ValueUnit;

public class MediaQuery {
	
	
	StringBuilder queryBuff = new StringBuilder();
	
	MediaQuery() {}
	
	MediaQuery(MediaQueryBuilder.Device device) {
		queryBuff.append("(")
			.append(device.getValue())
			.append(")");
	}

	MediaQuery(Attribute attribute) {
		queryBuff.append("(")
			.append(attribute.getValue())
			.append(")");
	}

	MediaQuery(Attribute attribute, EnumeratedValue enumValue) {
		queryBuff.append("(")
			.append(attribute.getValue())
			.append(": ")
			.append(enumValue.getValue())
			.append(")");
	}

	MediaQuery(Attribute attribute, Integer magnitude, ValueUnit unit) {
		queryBuff.append("(")
			.append(attribute.getValue())
			.append(": ")
			.append(magnitude)
			.append(unit.getValue())
			.append(")");
	}

	MediaQuery(Attribute attribute, String value) {
		queryBuff.append("(")
			.append(attribute.getValue())
			.append(": ")
			.append(value)
			.append(")");
	}
	
	public String query() { return queryBuff.toString(); }

}
