package com.k2.Html5Builder;

import com.k2.XMLBuilder.XMLElement;

/**
 * This abstract class is the base class for most HtmlElements.
 * 
 * It defines the event attributes that are applicable to most html elements
 * 
 * @author simon
 *
 * @param <T> The final class of the HtmlElement
 */
@SuppressWarnings({"unchecked"})
public abstract class HtmlElement<T extends XMLElement> extends HtmlGlobalElement<T> {

	// Form Events
	/**
	 * This method sets the 'onBlur' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onBlur(String value) { attr("onBlur", value); return (T) this; }
	/**
	 * This method sets the 'onChange' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onChange(String value) { attr("onChange", value); return (T) this; }
	/**
	 * This method sets the 'onContextMenu' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onContextMenu(String value) { attr("onContextMenu", value); return (T) this; }
	/**
	 * This method sets the 'onFocus' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onFocus(String value) { attr("onFocus", value); return (T) this; }
	/**
	 * This method sets the 'onInput' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onInput(String value) { attr("onInput", value); return (T) this; }
	/**
	 * This method sets the 'onInvalid' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onInvalid(String value) { attr("onInvalid", value); return (T) this; }
	/**
	 * This method sets the 'onReset' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onReset(String value) { attr("onReset", value); return (T) this; }
	/**
	 * This method sets the 'onSearch' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onSearch(String value) { attr("onSearch", value); return (T) this; }
	/**
	 * This method sets the 'onSelect' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onSelect(String value) { attr("onSelect", value); return (T) this; }
	/**
	 * This method sets the 'onSubmit' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onSubmit(String value) { attr("onSubmit", value); return (T) this; }
	
	// Keyboard Events
	/**
	 * This method sets the 'onKeyDown' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onKeyDown(String value) { attr("onKeyDown", value); return (T) this; }
	/**
	 * This method sets the 'onKeyPress' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onKeyPress(String value) { attr("onKeyPress", value); return (T) this; }
	/**
	 * This method sets the 'onKeyUp' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onKeyUp(String value) { attr("onKeyUp", value); return (T) this; }

	// Mouse Events
	/**
	 * This method sets the 'onClick' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onClick(String value) { attr("onClick", value); return (T) this; }
	/**
	 * This method sets the 'onDblClick' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onDblClick(String value) { attr("onDblClick", value); return (T) this; }
	/**
	 * This method sets the 'onMouseDown' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onMouseDown(String value) { attr("onMouseDown", value); return (T) this; }
	/**
	 * This method sets the 'onMouseMove' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onMouseMove(String value) { attr("onMouseOut", value); return (T) this; }
	/**
	 * This method sets the 'onBlur' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onMouseOut(String value) { attr("onMouseOut", value); return (T) this; }
	/**
	 * This method sets the 'onMouseOver' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onMouseOver(String value) { attr("onMouseOver", value); return (T) this; }
	/**
	 * This method sets the 'onMouseUp' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onMouseUp(String value) { attr("onMouseUp", value); return (T) this; }
	/**
	 * This method sets the 'onWheel' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onWheel(String value) { attr("onWheel", value); return (T) this; }
	
	// Drag Events
	/**
	 * This method sets the 'onDrag' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onDrag(String value) { attr("onDrag", value); return (T) this; }
	/**
	 * This method sets the 'onDragEnd' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onDragEnd(String value) { attr("onDragEnd", value); return (T) this; }
	/**
	 * This method sets the 'onDragEnter' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onDragEnter(String value) { attr("onDragEnter", value); return (T) this; }
	/**
	 * This method sets the 'onDragLeaver' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onDragLeave(String value) { attr("onDragLeave", value); return (T) this; }
	/**
	 * This method sets the 'onDragOver' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onDragOver(String value) { attr("onDragOver", value); return (T) this; }
	/**
	 * This method sets the 'onDragStart' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onDragStart(String value) { attr("onDragStart", value); return (T) this; }
	/**
	 * This method sets the 'onDrop' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onDrop(String value) { attr("onDrop", value); return (T) this; }
	/**
	 * This method sets the 'onScroll' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onScroll(String value) { attr("onScroll", value); return (T) this; }
	
	// Clipboard Events
	/**
	 * This method sets the 'onCopy' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onCopy(String value) { attr("onCopy", value); return (T) this; }
	/**
	 * This method sets the 'onCut' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onCut(String value) { attr("onCut", value); return (T) this; }
	/**
	 * This method sets the 'onPaste' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onPaste(String value) { attr("onPaste", value); return (T) this; }
	
	// Media Events
	/**
	 * This method sets the 'onAbort' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onAbort(String value) { attr("onAbort", value); return (T) this; }
	/**
	 * This method sets the 'onCanPlayr' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onCanPlay(String value) { attr("onCanPlay", value); return (T) this; }
	/**
	 * This method sets the 'onCanPlayThrough' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onCanPlayThrough(String value) { attr("onCanPlayThrough", value); return (T) this; }
	/**
	 * This method sets the 'onCueChange' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onCueChange(String value) { attr("onCueChange", value); return (T) this; }
	/**
	 * This method sets the 'onDurationChange' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onDurationChange(String value) { attr("onDurationChange", value); return (T) this; }
	/**
	 * This method sets the 'onEmptied' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onEmptied(String value) { attr("onEmptied", value); return (T) this; }
	/**
	 * This method sets the 'onEnded' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onEnded(String value) { attr("onEnded", value); return (T) this; }
	/**
	 * This method sets the 'onError' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onError(String value) { attr("onError", value); return (T) this; }
	/**
	 * This method sets the 'onLoadedData' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onLoadedData(String value) { attr("onLoadedData", value); return (T) this; }
	/**
	 * This method sets the 'onLoadedMetaData' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onLoadedMetaData(String value) { attr("onLoadedMetaData", value); return (T) this; }
	/**
	 * This method sets the 'onLoadStart' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onLoadStart(String value) { attr("onLoadStart", value); return (T) this; }
	/**
	 * This method sets the 'onPause' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onPause(String value) { attr("onPause", value); return (T) this; }
	/**
	 * This method sets the 'onPlay' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onPlay(String value) { attr("onPlay", value); return (T) this; }
	/**
	 * This method sets the 'onPlaying' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onPlaying(String value) { attr("onPlaying", value); return (T) this; }
	/**
	 * This method sets the 'onProgress' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onProgress(String value) { attr("onProgress", value); return (T) this; }
	/**
	 * This method sets the 'onRateChange' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onRateChange(String value) { attr("onRateChange", value); return (T) this; }
	/**
	 * This method sets the 'onSeek' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onSeek(String value) { attr("onSeek", value); return (T) this; }
	/**
	 * This method sets the 'onSeeking' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onSeeking(String value) { attr("onSeeking", value); return (T) this; }
	/**
	 * This method sets the 'onStalled' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onStalled(String value) { attr("onStalled", value); return (T) this; }
	/**
	 * This method sets the 'onSuspend' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onSuspend(String value) { attr("onSuspend", value); return (T) this; }
	/**
	 * This method sets the 'onTimeUpdate' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onTimeUpdate(String value) { attr("onTimeUpdate", value); return (T) this; }
	/**
	 * This method sets the 'onVolumeChange' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onVolumeChange(String value) { attr("onVolumeChange", value); return (T) this; }
	/**
	 * This method sets the 'onWaiting' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onWaiting(String value) { attr("onWaiting", value); return (T) this; }
	
	// Misc Evens
	/**
	 * This method sets the 'onShow' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onShow(String value) { attr("onShow", value); return (T) this; }
	/**
	 * This method sets the 'onToggle' event handler
	 * @param value The javascript for the event handler
	 * @return This element
	 */
	public T onToggle(String value) { attr("onToggle", value); return (T) this; }
			
	/**
	 * Pass the attributes through to the HtmlElement constructor
	 * @param hb		The html builder that created this instance
	 * @param tag	The tag of the final html element
	 */
	protected HtmlElement(Html5Builder hb, String tag) {
		super(hb, tag);
	}	

}
