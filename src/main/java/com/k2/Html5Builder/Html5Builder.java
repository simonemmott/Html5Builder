package com.k2.Html5Builder;

import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Logger;

import com.k2.XMLBuilder.XMLBuilder;

public class Html5Builder extends XMLBuilder
{
	
	UserAgentInfo uaInfo;
	Logger warningLog = Logger.getAnonymousLogger();
	
    public Html5Builder() {
    		super.setNullAttributeHandling(NullAttributeHandling.BLANK);
    }
    
    public Html5Builder setUAgentInfo(UserAgentInfo uaInfo) {
    		this.uaInfo = uaInfo;
    		return this;
    }
    
    public UserAgentInfo getUAgentInto() { return uaInfo; }
    
    public boolean uaIs(UserAgentInfo.UserAgentType ...agentTypes ) {
    		if (uaInfo == null) return true;
    		for (UserAgentInfo.UserAgentType checkType : agentTypes) if (checkType == uaInfo.getType()) return true;
    		return false;
    }
    
    public boolean uaOk(UserAgentInfo.UserAgentType checkType) {
    		if (uaInfo == null) return true;
    		return (uaInfo.getType() == checkType);
    }
    
    public boolean uaOk(UserAgentInfo.UserAgentType checkType, Integer checkVer) {
    		if (uaInfo == null) return true;
    		return (uaInfo.getType() == checkType && uaInfo.getVersion() >= checkVer);
    }
    
    public Html5Builder setWarngingLog(Logger warningLog) {
    		this.warningLog = warningLog;
    		return this;
    }
    
    public void warning(String message) { warningLog.warning(message); }
    
    @Override
    public Html5Builder setIndent(String indentStr) { return (Html5Builder)super.setIndent(indentStr); }
    
    @Override
    public Html5Builder includeProlog(boolean include) { return (Html5Builder)super.includeProlog(include); }
    
    @Override
	public XMLBuilder setNullAttributeHandling(NullAttributeHandling nullAttributeHandling) {
		super.setNullAttributeHandling(nullAttributeHandling);
		return this;
	}

    
    public HtmlPage page() {
		builderRoot = new HtmlPage(this, "html");
		allowOptionalEndTags();
		return (HtmlPage) builderRoot;
    }

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

    public HtmlPage xHtmlPage() {
		builderRoot = new HtmlPage(this, "html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\"");
		return (HtmlPage) builderRoot;
    }

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
