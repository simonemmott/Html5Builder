package com.k2.Html5Builder.MediaQueryBuilder;

import java.util.ArrayList;
import java.util.List;

import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.Attribute;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.Device;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.EnumeratedValue;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.ValueUnit;

/**
 * This class repreents a group of media queries.
 * 
 * A media query group is also a media query and all media queries in a group are anded together
 * 
 * Media query groups can define a chain of media query groups. Chains of media query groups are ored together
 * Each member of a chain of media query groups includes a pointer to the first group in the chain and a pointer
 * to the next group in the chain
 * 
 * Since a MediaQueryGroup extends MediaQuery media query groups can contain other media query groups if such groups
 * are also a chain then all queries in the chain are treated as a single query within the containing group
 * 
 * Media query groups can be negated in which case all queries in the group are negated
 * 
 * @author simon
 *
 */
public class MediaQueryGroup extends MediaQuery{
	
	
	private boolean negated = false;
	private List<MediaQuery> queries;
	private MediaQueryGroup parent;
	
	/**
	 * The first group on the chain or this group if it is the first in the chain
	 */
	MediaQueryGroup firstGroup;
	/**
	 * The next group in the chain if there is one
	 */
	MediaQueryGroup orGroup;
	
	/**
	 * Create an optionally negated media query group
	 * @param parent		The group that is the parent for this new group or null if it is the top level group
	 * @param negated	True if this group should be negated
	 */
	MediaQueryGroup(MediaQueryGroup parent, boolean negated) {
		this.firstGroup = this;
		this.parent = parent;
		this.negated = negated;
	}
	
	/**
	 * Add a media query to this group
	 * 
	 * All queries in a group are anded together
	 * @param query	The media query to add to the group
	 * @return	This media query group for method chaining
	 */
	public MediaQueryGroup add(MediaQuery query) {
		if (queries == null) queries = new ArrayList<MediaQuery>();
		queries.add(query);
		return this;
	}
	
	/**
	 * Create a new negated media query group and add it to this group
	 * @return	The new negated media query group
	 */
	public MediaQueryGroup not() {
		MediaQueryGroup mqg = new MediaQueryGroup(this, true);
		add(mqg);
		return mqg;
	}
	
	/**
	 * Create a new media query group extending the chain of ored media queries
	 * @return	The new group on the end of the chain
	 */
	public MediaQueryGroup or() {
		MediaQueryGroup mqg = new MediaQueryGroup(this, false);
		mqg.firstGroup = firstGroup;
		MediaQueryGroup hold = this;
		while (hold.orGroup != null) { hold = hold.orGroup; }
		hold.orGroup = mqg;
		
		return mqg;
	}
	
	/**
	 * Get the parent of this media query group
	 * @return	The parent group of this media query group or null if this is the top level media query group
	 */
	public MediaQueryGroup up() { return parent; }
	
	/**
	 * Add a new device media query to this group
	 * @param device		The device for which to add a media query 
	 * @return	This group for method chaining
	 */
	public MediaQueryGroup device(Device device) {
		add(new MediaQuery(device));
		return this;
	}

	/**
	 * Add a new attribute media query to this group
	 * @param attribute	The attribute for which to create the media query
	 * @return	This group for method chaining
	 */
	public MediaQueryGroup attribute(Attribute attribute) {
		add(new MediaQuery(attribute));
		return this;
	}

	/**
	 * Add a new attribute with enumerated value to this group
	 * @param attribute	The attribute for which to create the media query
	 * @param enumValue	The enumerated value for the media query
	 * @return	This group for method chaining
	 */
	public MediaQueryGroup attribute(Attribute attribute, EnumeratedValue enumValue) {
		add(new MediaQuery(attribute, enumValue));
		return this;
	}

	/**
	 * Add a new attribute with scalar value to this group
	 * @param attribute	The attribute for which to create the media query
	 * @param value	The scalar value for the attribute of this media query
	 * @param unit	The units of the scalar value in the media query
	 * @return	This group for method chaining
	 */
	public MediaQueryGroup attribute(Attribute attribute, Integer value, ValueUnit unit) {
		add(new MediaQuery(attribute, value, unit));
		return this;
	}

	/**
	 * Add a new attribute with string value to this group
	 * @param attribute	The attribute for which to create the media query
	 * @param value	The string value for the media query attribute
	 * @return	This media query group for method chaining
	 */
	public MediaQueryGroup attribute(Attribute attribute, String value) {
		add(new MediaQuery(attribute, value));
		return this;
	}
	

	/**
	 * This method returns a string representing this media query including all the media queries in the group and all 
	 * ored queries in the chain
	 */
	public String query() {
		if (negated) queryBuff.append("("+MediaQueryBuilder.Operator.NOT.getValue()+" "); else queryBuff.append("(");
		boolean first = true;
		for (MediaQuery query : queries) {
			if (!first) queryBuff.append(" "+MediaQueryBuilder.Operator.AND.getValue()+" ");
			queryBuff.append(query.query());
			first = false;
		}
		queryBuff.append(")");
		
		MediaQueryGroup group = orGroup;
		while (group != null) {
			queryBuff.append(MediaQueryBuilder.Operator.OR.getValue()+" ")
				.append(group.query());
			group = group.orGroup;
		}

		return queryBuff.toString();
	}

}
