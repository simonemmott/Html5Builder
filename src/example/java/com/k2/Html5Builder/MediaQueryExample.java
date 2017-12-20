package com.k2.Html5Builder;


import com.k2.Html5Builder.MediaQueryBuilder.MediaQuery;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.Device;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.Attribute;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.ValueUnit;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.GridValues;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.Operator;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.OrientationValues;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.ScanValues;

public class MediaQueryExample {

	public static void main(String[] args) {

		MediaQuery q1 = MediaQueryBuilder.device(Device.SCREEN);
		
		System.out.println(q1.query());

		MediaQuery q2 = MediaQueryBuilder.not()
				.device(Device.PRINT)
				.attribute(Attribute.HIEGHT_MAX, 200, ValueUnit.PX)
				.attribute(Attribute.ASPECT_RATIO, "11/6")
				.attribute(Attribute.ORIENTATION, OrientationValues.LANDSCAPE)
				.attribute(Attribute.COLOR)
				.or().device(Device.SCREEN).up();
		
		System.out.println(q2.query());

	}

}
