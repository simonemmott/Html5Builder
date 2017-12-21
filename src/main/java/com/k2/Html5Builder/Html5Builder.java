package com.k2.Html5Builder;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import com.k2.XMLBuilder.XMLBuilder;

/**
 * This class is the starting point for interaction with the Html5Builder API
 * @author simon
 *
 */
public class Html5Builder extends XMLBuilder
{
	
	UserAgentInfo uaInfo;
	Logger warningLog = Logger.getAnonymousLogger();
	
	/**
	 * Create an instance of the Html5Builder that will uses a blank value, i.e. no '=' and value statement for attributes
	 * that have been defined with a null value
	 */
    public Html5Builder() {
    		super.setNullAttributeHandling(NullAttributeHandling.BLANK);
    }
    
    /**
     * Set the user agent details for this instance of the html builder
     * @param uaInfo	An instance of UserAgentInfo representing the user agent details requesting the html content
     * @return	This html builder for method chaining.
     */
    public Html5Builder setUAgentInfo(UserAgentInfo uaInfo) {
    		this.uaInfo = uaInfo;
    		return this;
    }
    
    /**
     * Get the user agent information associated with this html builder
     * @return	The user agent information for which this html builder is generating html content
     */
    public UserAgentInfo getUAgentInto() { return uaInfo; }
    
    /**
     * A utility method to identify whether the user agent is one of the given user agent types
     * @param agentTypes	A set of user agent types to check against the user agent info.
     * @return	True if the user agent is in the given list of user agent types
     */
    public boolean uaIs(UserAgentInfo.UserAgentType ...agentTypes ) {
    		if (uaInfo == null) return true;
    		for (UserAgentInfo.UserAgentType checkType : agentTypes) if (uaOk(checkType)) return true;
    		return false;
    }
    
    /**
     * A utility method to check the current user agent information against the given user agent type
     * @param checkType The user agent type to compare to the current user agent info
     * @return	True if the given type is the same as the current user agent type
     */
    public boolean uaOk(UserAgentInfo.UserAgentType checkType) {
    		if (uaInfo == null) return true;
    		return (uaInfo.getType() == checkType);
    }
    
	private SimpleDateFormat dateTimeZoneFormat = new SimpleDateFormat(DateFormat.DATE_TIME_ZONE.getValue());
	
	/**
	 * Convert the given date into a String using the date-time zone date format 
	 * @param date The date to convert to a string
	 * @return	The string represention of the given date
	 */
	public String dateTimeZone(Date date) {
		return dateTimeZoneFormat.format(date);
	}

	private SimpleDateFormat dateTimeFormat = new SimpleDateFormat(DateFormat.DATE_TIME.getValue());
	
	/**
	 * Convert the given date into a String using the date-time date format 
	 * @param date The date to convert to a string
	 * @return	The string represention of the given date
	 */
	public String dateTime(Date date) {
		return dateTimeFormat.format(date);
	}

	private SimpleDateFormat dateFormat = new SimpleDateFormat(DateFormat.DATE.getValue());
	
	/**
	 * Convert the given date into a String using the date only date format 
	 * @param date The date to convert to a string
	 * @return	The string represention of the given date
	 */
	public String date(Date date) {
		return dateFormat.format(date);
	}

    /**
     * A utility method to compare the current user agent to the given type and version
     * @param checkType The type to compare to the current user agent
     * @param checkVer The version to compare to the current user agent
     * @return True if the current user agent is of the given type and greater than or equal to the check version
     */
    public boolean uaOk(UserAgentInfo.UserAgentType checkType, Integer checkVer) {
    		if (uaInfo == null) return true;
    		return (uaInfo.getType() == checkType && uaInfo.getVersion() >= checkVer);
    }
    
    /**
     * Set the warning logger. 
     * 
     * If this method has not been called to set the warning logger then a default annonymous logger is used.
     * 
     * It is not always possible to prevent invalid html begin defined through the API. In these cases the invalidity
     * of the html is reported on the warning log rather than throwing an unchecked exception and fail to generate the html
     * @param warningLog An instance of Logger to use as the warning logger.
     * @return This html builder for method chaining
     */
    public Html5Builder setWarngingLog(Logger warningLog) {
    		this.warningLog = warningLog;
    		return this;
    }
    
    /**
     * Add the given message to the warning log
     * @param message	The message to log as a warning
     */
    public void warning(String message) { warningLog.warning(message); }
    
    /**
     * Override the XMLBuilder.setIndent method to cast the response to an Html5Builder
     */
    @Override
    public Html5Builder setIndent(String indentStr) { return (Html5Builder)super.setIndent(indentStr); }
    
    /**
     * Override the XMLBuilder.includeProlog method to cast the response to an Html5Builder
     */
    @Override
    public Html5Builder includeProlog(boolean include) { return (Html5Builder)super.includeProlog(include); }
    
    /**
     * Override the XMLBuilder.setNullAttributeHandling to cast the return as an Html5Builder
     */
    @Override
	public XMLBuilder setNullAttributeHandling(NullAttributeHandling nullAttributeHandling) {
		super.setNullAttributeHandling(nullAttributeHandling);
		return this;
	}

    /**
     * This method creates and returns a new html page
     * 
     * The created page will by default allow optional end tags. i.e. not XHTML compliant
     * @return The created instance of HtmlPage representing the new html page
     */
    public HtmlPage page() {
		builderRoot = new HtmlPage(this, "html");
		allowOptionalEndTags();
		return (HtmlPage) builderRoot;
    }

    /**
     * This method creates and returns a new html page.
     * 
     * This method allows control over all the details of the xml prolog
     * @param includeXmlProlog	True if the Xml prolog should be included
     * @param allowOptionalEndTags The method to handle null attribute values
     * @param system		True if the DOCTYPE is a system document rather than a public document
     * @param fpi The string representing the 'fpi' portion of the DOCTYPE tag.
     * @param url The string representing the 'url' portion of the DOCTYPE tag.
     * @return The newly created html page
     */
    public HtmlPage page(boolean includeXmlProlog, boolean allowOptionalEndTags, boolean system, String fpi, String url) {
     	if (fpi == null && url == null) {
    			builderRoot = new HtmlPage(this, "html");
    		} else {
    	   		String docType = "html ";
    	   		if (system) {
    	   			docType = docType+"SYSTEM";
    	   		} else {
    	   			docType = docType+"PUBLIC";
    	   		}
    	   		if (fpi != null) docType = docType+" \""+fpi+"\"";
    	   		if (url != null) docType = docType+" \""+url+"\"";

    	   		builderRoot = new HtmlPage(this, docType, includeXmlProlog);
    			
    		}
		if (allowOptionalEndTags) allowOptionalEndTags();
		return (HtmlPage) builderRoot;
    }

    /**
     * This method creates an html page with the DOCTYPE appropriate for an xhtml page conforming to the html5 standard.
     * @return The newly created xhtml page
     */
    public HtmlPage xHtmlPage() {
		builderRoot = new HtmlPage(this, "html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\"");
		return (HtmlPage) builderRoot;
    }

    /**
     * Create an instance of the given class that is an extension of the HtmlGlobalElement being the base class of all html elements.
     * @param elementClass The class representing the html element to create
     * @param <E> The concrete implementation of the html element desired from the html builder
     * @return	The created html element instance
     */
    @SuppressWarnings("rawtypes")
	public <E extends HtmlGlobalElement> E element(Class<E> elementClass) {
    		Constructor<E> elmConstructor;
			try {
				elmConstructor = elementClass.getConstructor(Html5Builder.class);
				E elm = elmConstructor.newInstance(this);
	    		return elm;
			} catch (NoSuchMethodException e) {
				throw new Html5BuilderError("Unable to instantiate class: "+elementClass.getCanonicalName()+
						" It does not have a constructor that accepts an Html5Builder instance as it's only argument", e);
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				throw new Html5BuilderError("Unable to instantiate class: "+elementClass.getCanonicalName(), e);
			}
    }
}
