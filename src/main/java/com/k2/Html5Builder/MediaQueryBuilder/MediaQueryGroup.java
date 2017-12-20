package com.k2.Html5Builder.MediaQueryBuilder;

import java.util.ArrayList;
import java.util.List;

import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.Attribute;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.Device;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.EnumeratedValue;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.ValueUnit;

public class MediaQueryGroup extends MediaQuery{
	
	
	private boolean negated = false;
	private List<MediaQuery> queries;
	private MediaQueryGroup parent;
	MediaQueryGroup firstGroup;
	MediaQueryGroup orGroup;
	
	MediaQueryGroup(MediaQueryGroup parent, boolean negated) {
		this.firstGroup = this;
		this.parent = parent;
		this.negated = negated;
	}
	
	public MediaQueryGroup add(MediaQuery query) {
		if (queries == null) queries = new ArrayList<MediaQuery>();
		queries.add(query);
		return this;
	}
	
	public MediaQueryGroup not() {
		MediaQueryGroup mqg = new MediaQueryGroup(this, true);
		add(mqg);
		return mqg;
	}
	
	public MediaQueryGroup or() {
		MediaQueryGroup mqg = new MediaQueryGroup(this, false);
		mqg.firstGroup = firstGroup;
		orGroup = mqg;
		return mqg;
	}
	
	public MediaQueryGroup up() { return parent; }
	
	public MediaQueryGroup device(Device device) {
		add(new MediaQuery(device));
		return this;
	}

	public MediaQueryGroup attribute(Attribute attribute) {
		add(new MediaQuery(attribute));
		return this;
	}

	public MediaQueryGroup attribute(Attribute attribute, EnumeratedValue enumValue) {
		add(new MediaQuery(attribute, enumValue));
		return this;
	}

	public MediaQueryGroup attribute(Attribute attribute, Integer value, ValueUnit unit) {
		add(new MediaQuery(attribute, value, unit));
		return this;
	}

	public MediaQueryGroup attribute(Attribute attribute, String value) {
		add(new MediaQuery(attribute, value));
		return this;
	}
	


	public String query() {
		if (negated) queryBuff.append("(not "); else queryBuff.append("(");
		boolean first = true;
		for (MediaQuery query : queries) {
			if (!first) queryBuff.append(" and ");
			queryBuff.append(query.query());
			first = false;
		}
		queryBuff.append(")");
		
		MediaQueryGroup group = orGroup;
		while (group != null) {
			queryBuff.append(", ")
				.append(group.query());
			group = group.orGroup;
		}

		return queryBuff.toString();
	}

}
