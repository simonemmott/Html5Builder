package com.k2.Html5Builder;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.k2.XMLBuilder.XMLBuilder;

/**
 * Hello world!
 *
 */
public class Html5Builder extends XMLBuilder
{
	
    public Html5Builder() {}
    
    @Override
    public Html5Builder setIndent(String indentStr) { return (Html5Builder)super.setIndent(indentStr); }
    
    @Override
    public Html5Builder includeProlog(boolean include) { return (Html5Builder)super.includeProlog(include); }
    
    public HtmlPage page() {
    		builderRoot = new HtmlPage(this);
    		return (HtmlPage) builderRoot;
    }
    
    public <E extends HtmlElement> E element(Class<E> elementClass) {
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
