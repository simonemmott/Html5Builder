package com.k2.Html5Builder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;

import com.k2.Html5Builder.elements.*;
import com.k2.Html5Builder.elements.attrValues.HtmlLanguageCode;
import com.k2.XMLBuilder.XMLElement;
import com.k2.XMLBuilder.XMLBuilder.NullAttributeHandling;

@SuppressWarnings({"unchecked", "rawtypes"})
public abstract class HtmlGlobalElement<T extends XMLElement> extends XMLElement {
	
	protected void warnValid(String check, String value, String attr) {
		if (!value.equalsIgnoreCase(this.get(check))) ((Html5Builder)xb).warning("The attribute "+attr+" is only valid for "+getTag()+"'s of "+check+" '"+value+"' at: "+getPath()); 
	}
	
	// Global Attributes
	public T setId(String value) { attr("id", value); return (T) this; }
	public T setClass(String value) { attr("class", value); return (T) this; }
	public T setAccesskey(String value) { attr("accesskey", value); return (T) this; }
	public T setContentEditable(String value) { attr("contenteditable", value); return (T) this; }
	public T setContextMenu(String value) { attr("contextmenu", value); return (T) this; }
	public T setDir(String value) { attr("dir", value); return (T) this; }
	public T setDraggable(String value) { attr("draggable", value); return (T) this; }
	public T setDropzone(String value) { attr("dropzone", value); return (T) this; }
	public T setHidden(String value) { attr("hidden", value); return (T) this; }
	public T setLang(HtmlLanguageCode value) { attr("lang", value.getValue()); return (T) this; }
	public T aetSpellCheck(String value) { attr("spellcheck", value); return (T) this; }
	public T setTabIndex(Integer value) { attr("tabindex", value.toString()); return (T) this; }
	public T setTitle(String value) { attr("title", value); return (T) this; }
	public T setTranslate(String value) { attr("translate", value); return (T) this; }
	public T setStyle(String value) { attr("style", value); return (T) this; }
	public T addClass(String value) { 
		String curVal = get("class");
		if (curVal == null || "".equals(curVal)) {
			attr("class", value);
			 return (T) this;
		}
		attr("class", curVal+" "+value); 
		 return (T) this;
	}
	public T addData(String id, String value) { attr("data-"+id, value); return (T) this; }
	public T addStyle(String label, String value) {
		String curVal = get("style");
		if (curVal==null || "".equals(curVal)) {
			attr("style", label+":"+value);
			 return (T) this;
		}
		attr("style", curVal+";"+label+":"+value);
		 return (T) this;
	}
	
	protected HtmlGlobalElement(Html5Builder hb, String tag) {
		super(hb, tag);
	}
	
	public T text(String text) { return (T)super.data(text); }
	public T t(String text) { return (T)super.data(text); }
	@Override
	public T data(String text) { return (T)super.data(text); }
	@Override
	public T d(String text) { return (T)super.data(text); }
	
	@Override
	public T setNullAttributeHandling(NullAttributeHandling nullAttributeHandling) {
		super.setNullAttributeHandling(nullAttributeHandling);
		return (T) this;
	}

	
	public HtmlPage page() { return (HtmlPage)root(); }
	
	public PrintWriter toHtml(PrintWriter pw) { return toXml(pw); }
	public Writer toHtml(Writer w) { return toXml(w); }
	public File toHtml(File file) throws FileNotFoundException { return toXml(file); }


	
	
	

}
