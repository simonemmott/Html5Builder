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
public abstract class HtmlElement<T extends XMLElement> extends HtmlGlobalElement<T> {

	// Form Events
	public T onBlur(String value) { attr("onBlur", value); return (T) this; }
	public T onChange(String value) { attr("onChange", value); return (T) this; }
	public T onContextMenu(String value) { attr("onContextMenu", value); return (T) this; }
	public T onFocus(String value) { attr("onFocus", value); return (T) this; }
	public T onInput(String value) { attr("onInput", value); return (T) this; }
	public T onInvalid(String value) { attr("onInvalid", value); return (T) this; }
	public T onReset(String value) { attr("onReset", value); return (T) this; }
	public T onSearch(String value) { attr("onSearch", value); return (T) this; }
	public T onSelect(String value) { attr("onSelect", value); return (T) this; }
	public T onSubmit(String value) { attr("onSubmit", value); return (T) this; }
	
	// Keyboard Events
	public T onKeyDown(String value) { attr("onKeyDown", value); return (T) this; }
	public T onKeyPress(String value) { attr("onKeyPress", value); return (T) this; }
	public T onKeyUp(String value) { attr("onKeyUp", value); return (T) this; }

	// Mouse Events
	public T onClick(String value) { attr("onClick", value); return (T) this; }
	public T onDblClick(String value) { attr("onDblClick", value); return (T) this; }
	public T onMouseDown(String value) { attr("onMouseDown", value); return (T) this; }
	public T onMouseMove(String value) { attr("onMouseMove", value); return (T) this; }
	public T onMouseOut(String value) { attr("onMouseOut", value); return (T) this; }
	public T onMouseOver(String value) { attr("onMouseOver", value); return (T) this; }
	public T onMouseUp(String value) { attr("onMouseUp", value); return (T) this; }
	public T onWheel(String value) { attr("onWheel", value); return (T) this; }
	
	// Drag Events
	public T onDrag(String value) { attr("onDrag", value); return (T) this; }
	public T onDragEnd(String value) { attr("onDragEnd", value); return (T) this; }
	public T onDragEnter(String value) { attr("onDragEnter", value); return (T) this; }
	public T onDragLeave(String value) { attr("onDragLeave", value); return (T) this; }
	public T onDragOver(String value) { attr("onDragOver", value); return (T) this; }
	public T onDragStart(String value) { attr("onDragStart", value); return (T) this; }
	public T onDrop(String value) { attr("onDrop", value); return (T) this; }
	public T onScroll(String value) { attr("onScroll", value); return (T) this; }
	
	// Clipboard Events
	public T onCopy(String value) { attr("onCopy", value); return (T) this; }
	public T onCut(String value) { attr("onCut", value); return (T) this; }
	public T onPaste(String value) { attr("onPaste", value); return (T) this; }
	
	// Media Events
	public T onAbort(String value) { attr("onAbort", value); return (T) this; }
	public T onCanPlay(String value) { attr("onCanPlay", value); return (T) this; }
	public T onCanPlayThrough(String value) { attr("onCanPlayThrough", value); return (T) this; }
	public T onCueChange(String value) { attr("onCueChange", value); return (T) this; }
	public T onDurationChange(String value) { attr("onDurationChange", value); return (T) this; }
	public T onEmptied(String value) { attr("onEmptied", value); return (T) this; }
	public T onEnded(String value) { attr("onEnded", value); return (T) this; }
	public T onError(String value) { attr("onError", value); return (T) this; }
	public T onLoadedData(String value) { attr("onLoadedData", value); return (T) this; }
	public T onLoadedMetaData(String value) { attr("onLoadedMetaData", value); return (T) this; }
	public T onLoadStart(String value) { attr("onLoadStart", value); return (T) this; }
	public T onPause(String value) { attr("onPause", value); return (T) this; }
	public T onPlay(String value) { attr("onPlay", value); return (T) this; }
	public T onPlaying(String value) { attr("onPlaying", value); return (T) this; }
	public T onProgress(String value) { attr("onProgress", value); return (T) this; }
	public T onRateChange(String value) { attr("onRateChange", value); return (T) this; }
	public T onSeek(String value) { attr("onSeek", value); return (T) this; }
	public T onSeeking(String value) { attr("onSeeking", value); return (T) this; }
	public T onStalled(String value) { attr("onStalled", value); return (T) this; }
	public T onSuspend(String value) { attr("onSuspend", value); return (T) this; }
	public T onTimeUpdate(String value) { attr("onTimeUpdate", value); return (T) this; }
	public T onVolumeChange(String value) { attr("onVolumeChange", value); return (T) this; }
	public T onWaiting(String value) { attr("onWaiting", value); return (T) this; }
	
	// Misc Evens
	public T onShow(String value) { attr("onShow", value); return (T) this; }
	public T onToggle(String value) { attr("onToggle", value); return (T) this; }
		
	@Override
	public HtmlElement up() { return (HtmlElement)super.up(); }
	
	protected HtmlElement(Html5Builder hb, String tag) {
		super(hb, tag);
	}

	protected <E extends HtmlGlobalElement> E createAndAddChild(Class<E> elemClass) {
		HtmlGlobalElement el = ((Html5Builder)xb).element(elemClass); 
		add(el); 
		return (E) el;
	}

	public HtmlA a() { return createAndAddChild(HtmlA.class); }
	public HtmlAbbr abbr() { return createAndAddChild(HtmlAbbr.class); }
	public HtmlAddress address() { return createAndAddChild(HtmlAddress.class); }
	public HtmlArea area() { return createAndAddChild(HtmlArea.class); }
	public HtmlArticle article() { return createAndAddChild(HtmlArticle.class); }
	public HtmlAside aside() { return createAndAddChild(HtmlAside.class); }
	public HtmlAudio audio() { return createAndAddChild(HtmlAudio.class); }
	public HtmlB b() { return createAndAddChild(HtmlB.class); }
	public HtmlBdi bdi() { return createAndAddChild(HtmlBdi.class); }
	public HtmlBdo bdo() { return createAndAddChild(HtmlBdo.class); }
	public HtmlBlockQuote blockQuote() { return createAndAddChild(HtmlBlockQuote.class); }
	public T br() { createAndAddChild(HtmlBr.class); return (T) this;}
	public HtmlButton button() { return createAndAddChild(HtmlButton.class); }

	
	
	

}
