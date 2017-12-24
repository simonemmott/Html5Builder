package com.k2.Html5Builder;


import static org.junit.Assert.assertEquals;

import java.io.StringWriter;
import java.util.Date;

import org.junit.Test;

import com.k2.Html5Builder.elements.*;
import com.k2.Html5Builder.elements.attrValues.*;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.Attribute;
import com.k2.Html5Builder.MediaQueryBuilder.MediaQueryBuilder.Device;

/**
 * Unit test for html5Builder.
 */
public class Html5BuilderTest {

	Html5Builder hb = new Html5Builder();
	
	@Test
    public void pageTest()
    {
		
		String expectedResult = "<!DOCTYPE html>\n" + 
				"<html>\n" + 
				"\t<head>\n" + 
				"\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" + 
				"\t</head>\n" + 
				"\t<body/>\n" + 
				"</html>\n";
    	
		StringWriter sw = new StringWriter();
		hb.page().toHtml(sw);
		
		assertEquals(expectedResult, sw.toString());
		
		expectedResult = "<?xml version=\"0.9\" encoding=\"UTF-16\"?>\n" + 
				"<!DOCTYPE html SYSTEM \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">\n" + 
				"<html>\n" + 
				"\t<head>\n" + 
				"\t\t<meta http-equiv=\"refresh\" content=\"30\">\n" + 
				"\t\t<meta name=\"viewport\" content=\"Some other viewport\">\n" + 
				"\t\t<meta name=\"description\" content=\"This is the page description\">\n" + 
				"\t\t<meta name=\"keywords\" content=\"lots, world, and, more, of, words, hello\">\n" + 
				"\t\t<base href=\"http://www.example.com/mySite/\" target=\"_parent\">\n" + 
				"\t\t<meta name=\"author\" content=\"Yet another author\">\n" + 
				"\t</head>\n" + 
				"\t<body>\n" + 
				"\t\t<a href=\"http://google.com\">Google</a>\n" + 
				"\t\t<abbr title=\"World Health Organisation\">WHO</abbr>\n" + 
				"\t</body>\n" + 
				"</html>\n";
		
		sw = new StringWriter();

		hb.page(true, false, true, null, "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd")
		.setVersion("0.9")
		.setEncoding("UTF-16")
		.head
			.refreshRate(30)
			.viewport("Some other viewport")
			.author("Simon Emmott")
			.description("This is the page description")
			.keywords("hello", "world", "and", "more", "words", "lots, and, lots, of, words")
			.author("Joe Bloggs!")
			.keywords("more", "words")
			.base()
				.setHref("http://www.example.com/mySite/")
				.setTarget(Target.PARENT)
				.up(HtmlHead.class)
			.author("Yet another author")
			.up(HtmlPage.class)
		.body
		.a()
			.setHref("http://google.com")
			.data("Google")
			.up(HtmlBody.class)
		.abbr()
			.setTitle("World Health Organisation")
			.text("WHO")
			.page()
		.toHtml(sw);
		
		assertEquals(expectedResult, sw.toString());

    }
	
	@Test
    public void headersTest()
    {
    	
		String expectedResult = "<!DOCTYPE html>\n" + 
				"<html>\n" + 
				"	<head>\n" + 
				"		<base href=\"http://www.example.com/mySite/\" target=\"_parent\">\n" + 
				"		<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" + 
				"	</head>\n" + 
				"	<body>\n" + 
				"		<section>\n" + 
				"			<h1>This is a header</h1>\n" + 
				"			<div>\n" + 
				"				<p>This is a paragraoh</p>\n" + 
				"				<p>This is another paragraph</p>\n" + 
				"				<section>\n" + 
				"					<h2>This is a lower level header</h2>\n" + 
				"					<div>\n" + 
				"						<p>Yet more paragraphs</p>\n" + 
				"						<section>\n" + 
				"							<h3>Final Header</h3>\n" + 
				"							<div>\n" + 
				"								<p>This is the lowest parapgraph</p>\n" + 
				"							</div>\n" + 
				"						</section>\n" + 
				"					</div>\n" + 
				"				</section>\n" + 
				"				<section>\n" + 
				"					<h2>This is a lower level header</h2>\n" + 
				"					<div>\n" + 
				"						<p>Yet more paragraphs</p>\n" + 
				"						<section>\n" + 
				"							<h3>Final Header</h3>\n" + 
				"							<div>\n" + 
				"								<p>This is the lowest parapgraph</p>\n" + 
				"							</div>\n" + 
				"						</section>\n" + 
				"					</div>\n" + 
				"				</section>\n" + 
				"			</div>\n" + 
				"		</section>\n" + 
				"	</body>\n" + 
				"</html>\n";
    	
		StringWriter sw = new StringWriter();
		hb.page()
			.head
				.base()
				.setHref("http://www.example.com/mySite/")
				.setTarget(Target.PARENT)
				.page()
			.body
				.section()
					.h().text("This is a header").up(HtmlSection.class)
					.div()
						.p().text("This is a paragraoh").up(HtmlDiv.class)
						.p().text("This is another paragraph").up(HtmlDiv.class)
						.section()
							.h().text("This is a lower level header").up(HtmlSection.class)
							.div()
								.p().text("Yet more paragraphs").up(HtmlDiv.class)
								.section()
									.h().text("Final Header").up(HtmlSection.class)
									.div()
										.p().text("This is the lowest parapgraph").up(HtmlDiv.class) 
										.up(HtmlSection.class)
									.up(HtmlDiv.class)
								.up(HtmlSection.class)
							.up(HtmlDiv.class)
						.section()
							.h().text("This is a lower level header").up(HtmlSection.class)
							.div()
								.p().text("Yet more paragraphs").up(HtmlDiv.class)
								.section()
									.h().text("Final Header").up(HtmlSection.class)
									.div()
										.p().text("This is the lowest parapgraph").up(HtmlDiv.class) 
										.page()
			.toHtml(sw);
		
		assertEquals(expectedResult, sw.toString());
		
    }
	
	@Test
    public void phrasingElementNoTimeTest()
    {
    	
		assertEquals("<time><a/><audio/><canvas/><del/><ins/><map/><object/><video/></time>", 
				hb.element(HtmlTime.class)
				.a().up(HtmlTime.class)
				.audio().up(HtmlTime.class)
				.canvas().up(HtmlTime.class)
				.del().up(HtmlTime.class)
				.ins().up(HtmlTime.class)
				.map().up(HtmlTime.class)
				.object().up(HtmlTime.class)
				.video().up(HtmlTime.class)
				.toString());
    }
	
	@Test
    public void phrasingElementTest()
    {
    	
		assertEquals("<abbr><a/><audio/><canvas/><del/><ins/><map/><object/><video/></abbr>", 
				hb.element(HtmlAbbr.class)
				.a().up(HtmlAbbr.class)
				.audio().up(HtmlAbbr.class)
				.canvas().up(HtmlAbbr.class)
				.del().up(HtmlAbbr.class)
				.ins().up(HtmlAbbr.class)
				.map().up(HtmlAbbr.class)
				.object().up(HtmlAbbr.class)
				.video().up(HtmlAbbr.class)
				.toString());
    }
	
	@Test
    public void flowElementTest()
    {
    	
		assertEquals("<div><a/><address/><article/><aside/><audio/><blockquote/><canvas/><del/><details/><div/><dl/><fieldset/><figure/><footer/><form/><h1/><h2/><h3/><h4/><h5/><h6/><header/><hr/><ins/><main/><map/><nav/><object/><ol/><p/><picture/><pre/><section/><table/><ul/><video/></div>", 
				hb.element(HtmlDiv.class)
				.a().up(HtmlDiv.class)
				.address().up(HtmlDiv.class)
				.article().up(HtmlDiv.class)
				.aside().up(HtmlDiv.class)
				.audio().up(HtmlDiv.class)
				.blockQuote().up(HtmlDiv.class)
				.canvas().up(HtmlDiv.class)
				.del().up(HtmlDiv.class)
				.details().up(HtmlDiv.class)
				.div().up(HtmlDiv.class)
				.dl().up(HtmlDiv.class)
				.fieldSet().up(HtmlDiv.class)
				.figure().up(HtmlDiv.class)
				.footer().up(HtmlDiv.class)
				.form().up(HtmlDiv.class)
				.h1().up(HtmlDiv.class)
				.h2().up(HtmlDiv.class)
				.h3().up(HtmlDiv.class)
				.h4().up(HtmlDiv.class)
				.h5().up(HtmlDiv.class)
				.h6().up(HtmlDiv.class)
				.header().up(HtmlDiv.class)
				.hr().up(HtmlDiv.class)
				.ins().up(HtmlDiv.class)
				.main().up(HtmlDiv.class)
				.map().up(HtmlDiv.class)
				.nav().up(HtmlDiv.class)
				.object().up(HtmlDiv.class)
				.ol().up(HtmlDiv.class)
				.p().up(HtmlDiv.class)
				.picture().up(HtmlDiv.class)
				.pre().up(HtmlDiv.class)
				.section().up(HtmlDiv.class)
				.table().up(HtmlDiv.class)
				.ul().up(HtmlDiv.class)
				.video().up(HtmlDiv.class)
				.toString());
    }
	
	@Test
    public void styledFlowElementTest()
    {
    	
		assertEquals("<div><style type=\"text/css\"/></div>", 
				hb.element(HtmlDiv.class)
				.style().up(HtmlDiv.class)
				.toString());
    }
	
	@Test
    public void restrictedFlowElementTest()
    {
    	
		assertEquals("<footer><a/><article/><aside/><audio/><blockquote/><canvas/><del/><details/><div/><dl/><fieldset/><figure/><form/><h1/><h2/><h3/><h4/><h5/><h6/><hr/><ins/><main/><map/><nav/><object/><ol/><p/><picture/><pre/><section/><table/><ul/><video/></footer>", 
				hb.element(HtmlFooter.class)
				.a().up(HtmlFooter.class)
				.article().up(HtmlFooter.class)
				.aside().up(HtmlFooter.class)
				.audio().up(HtmlFooter.class)
				.blockQuote().up(HtmlFooter.class)
				.canvas().up(HtmlFooter.class)
				.del().up(HtmlFooter.class)
				.details().up(HtmlFooter.class)
				.div().up(HtmlFooter.class)
				.dl().up(HtmlFooter.class)
				.fieldSet().up(HtmlFooter.class)
				.figure().up(HtmlFooter.class)
				.form().up(HtmlFooter.class)
				.h1().up(HtmlFooter.class)
				.h2().up(HtmlFooter.class)
				.h3().up(HtmlFooter.class)
				.h4().up(HtmlFooter.class)
				.h5().up(HtmlFooter.class)
				.h6().up(HtmlFooter.class)
				.hr().up(HtmlFooter.class)
				.ins().up(HtmlFooter.class)
				.main().up(HtmlFooter.class)
				.map().up(HtmlFooter.class)
				.nav().up(HtmlFooter.class)
				.object().up(HtmlFooter.class)
				.ol().up(HtmlFooter.class)
				.p().up(HtmlFooter.class)
				.picture().up(HtmlFooter.class)
				.pre().up(HtmlFooter.class)
				.section().up(HtmlFooter.class)
				.table().up(HtmlFooter.class)
				.ul().up(HtmlFooter.class)
				.video().up(HtmlFooter.class)
				.toString());
    }
	
	@Test
    public void veryRestrictedFlowElementTest()
    {
    	
		assertEquals("<address><a/><article/><aside/><audio/><blockquote/><canvas/><del/><details/><div/><dl/><fieldset/><figure/><form/><hr/><ins/><main/><map/><nav/><object/><ol/><p/><picture/><pre/><table/><ul/><video/></address>", 
				hb.element(HtmlAddress.class)
				.a().up(HtmlAddress.class)
				.article().up(HtmlAddress.class)
				.aside().up(HtmlAddress.class)
				.audio().up(HtmlAddress.class)
				.blockQuote().up(HtmlAddress.class)
				.canvas().up(HtmlAddress.class)
				.del().up(HtmlAddress.class)
				.details().up(HtmlAddress.class)
				.div().up(HtmlAddress.class)
				.dl().up(HtmlAddress.class)
				.fieldSet().up(HtmlAddress.class)
				.figure().up(HtmlAddress.class)
				.form().up(HtmlAddress.class)
				.hr().up(HtmlAddress.class)
				.ins().up(HtmlAddress.class)
				.main().up(HtmlAddress.class)
				.map().up(HtmlAddress.class)
				.nav().up(HtmlAddress.class)
				.object().up(HtmlAddress.class)
				.ol().up(HtmlAddress.class)
				.p().up(HtmlAddress.class)
				.picture().up(HtmlAddress.class)
				.pre().up(HtmlAddress.class)
				.table().up(HtmlAddress.class)
				.ul().up(HtmlAddress.class)
				.video().up(HtmlAddress.class)
				.toString());
    }
	
	@Test
    public void commonPhrasingElementNoTimeTest()
    {
    	
		assertEquals("<time><abbr/><area/><b/><bdi/><bdo/><br/><button/><cite/><datalist/><dfn/><em/><embed/><i/><iframe/><img/><input/><kbd/><label/><mark/><meter/><noscript/><output/><progress/><q/><ruby/><s/><samp/><script/><select/><small/><span/><strong/><sub/><sup/><textarea/><u/><var/><wbr/></time>", 
				hb.element(HtmlTime.class)
				.abbr().up(HtmlTime.class)
				.area().up(HtmlTime.class)
				.b().up(HtmlTime.class)
				.bdi().up(HtmlTime.class)
				.bdo().up(HtmlTime.class)
				.br()
				.button().up(HtmlTime.class)
				.cite().up(HtmlTime.class)
				.dataList().up(HtmlTime.class)
				.dfn().up(HtmlTime.class)
				.em().up(HtmlTime.class)
				.embed().up(HtmlTime.class)
				.i().up(HtmlTime.class)
				.iframe().up(HtmlTime.class)
				.img().up(HtmlTime.class)
				.input().up(HtmlTime.class)
				.kbd().up(HtmlTime.class)
				.label().up(HtmlTime.class)
				.mark().up(HtmlTime.class)
				.meter().up(HtmlTime.class)
				.noScript().up(HtmlTime.class)
				.output().up(HtmlTime.class)
				.progress().up(HtmlTime.class)
				.q().up(HtmlTime.class)
				.ruby().up(HtmlTime.class)
				.s().up(HtmlTime.class)
				.samp().up(HtmlTime.class)
				.script().up(HtmlTime.class)
				.select().up(HtmlTime.class)
				.small().up(HtmlTime.class)
				.span().up(HtmlTime.class)
				.strong().up(HtmlTime.class)
				.sub().up(HtmlTime.class)
				.sup().up(HtmlTime.class)
				.textArea().up(HtmlTime.class)
				.u().up(HtmlTime.class)
				.var().up(HtmlTime.class)
				.wbr()
				.toString());
    }
	
	@Test
    public void commonPhrasingElementTest()
    {
    	
		assertEquals("<a><abbr/><area/><b/><bdi/><bdo/><br/><button/><cite/><datalist/><dfn/><em/><embed/><i/><iframe/><img/><input/><kbd/><label/><mark/><meter/><noscript/><output/><progress/><q/><ruby/><s/><samp/><script/><select/><small/><span/><strong/><sub/><sup/><textarea/><time/><u/><var/><wbr/></a>", 
				hb.element(HtmlA.class)
				.abbr().up(HtmlA.class)
				.area().up(HtmlA.class)
				.b().up(HtmlA.class)
				.bdi().up(HtmlA.class)
				.bdo().up(HtmlA.class)
				.br()
				.button().up(HtmlA.class)
				.cite().up(HtmlA.class)
				.dataList().up(HtmlA.class)
				.dfn().up(HtmlA.class)
				.em().up(HtmlA.class)
				.embed().up(HtmlA.class)
				.i().up(HtmlA.class)
				.iframe().up(HtmlA.class)
				.img().up(HtmlA.class)
				.input().up(HtmlA.class)
				.kbd().up(HtmlA.class)
				.label().up(HtmlA.class)
				.mark().up(HtmlA.class)
				.meter().up(HtmlA.class)
				.noScript().up(HtmlA.class)
				.output().up(HtmlA.class)
				.progress().up(HtmlA.class)
				.q().up(HtmlA.class)
				.ruby().up(HtmlA.class)
				.s().up(HtmlA.class)
				.samp().up(HtmlA.class)
				.script().up(HtmlA.class)
				.select().up(HtmlA.class)
				.small().up(HtmlA.class)
				.span().up(HtmlA.class)
				.strong().up(HtmlA.class)
				.sub().up(HtmlA.class)
				.sup().up(HtmlA.class)
				.textArea().up(HtmlA.class)
				.time().up(HtmlA.class)
				.u().up(HtmlA.class)
				.var().up(HtmlA.class)
				.wbr()
				.toString());
    }
	
	@Test
    public void elementTest()
    {
    	
		assertEquals("<a onClick=\"click\" onSubmit=\"submit\" onKeyPress=\"keyPress\" onSearch=\"search\" onReset=\"reset\" onDragEnd=\"dragEnd\" onLoadedData=\"loadedData\" onMouseOut=\"mouseOut\" onEnded=\"ended\" onDblClick=\"dblClick\" onDurationChange=\"durationChange\" onCanPlayThrough=\"canPlayThrough\" onDragStart=\"dragStart\" onSuspend=\"suspend\" onToggle=\"toggle\" onChange=\"change\" onTimeUpdate=\"timeUpdate\" onContextMenu=\"contextMenu\" onSeeking=\"seeking\" onLoadStart=\"loadStart\" onDrag=\"drag\" onCanPlay=\"canPlay\" onCut=\"cut\" onPlay=\"play\" onFocus=\"focus\" onLoadedMetaData=\"loadedMetaData\" onRateChange=\"rateChange\" onCueChange=\"cueChange\" onWheel=\"wheel\" onKeyDown=\"keyDown\" onWaiting=\"waiting\" onProgress=\"progress\" onDragOver=\"dragOver\" onPause=\"pause\" onDragLeave=\"dragLeave\" onDragEnter=\"dragEnter\" onSelect=\"select\" onScroll=\"scroll\" onAbort=\"abort\" onMouseDown=\"mouseDown\" onEmptied=\"emptiedString\" onMouseOver=\"mouseOver\" onKeyUp=\"keyUp\" onError=\"error\" onShow=\"show\" onSeek=\"seek\" onPaste=\"paste\" onInput=\"input\" onVolumeChange=\"volumeChange\" onCopy=\"copy\" onInvalid=\"invalid\" onStalled=\"stalled\" onBlur=\"blur\" onPlaying=\"playing\" onDrop=\"drop\" onMouseUp=\"mouseUp\"/>", 
				hb.element(HtmlA.class)
				.onAbort("abort")
				.onBlur("blur")
				.onCanPlay("canPlay")
				.onCanPlayThrough("canPlayThrough")
				.onChange("change")
				.onClick("click")
				.onContextMenu("contextMenu")
				.onCopy("copy")
				.onCueChange("cueChange")
				.onCut("cut")
				.onDblClick("dblClick")
				.onDrag("drag")
				.onDragEnd("dragEnd")
				.onDragEnter("dragEnter")
				.onDragLeave("dragLeave")
				.onDragOver("dragOver")
				.onDragStart("dragStart")
				.onDrop("drop")
				.onDurationChange("durationChange")
				.onEmptied("emptiedString")
				.onEnded("ended")
				.onError("error")
				.onFocus("focus")
				.onInput("input")
				.onInvalid("invalid")
				.onKeyDown("keyDown")
				.onKeyPress("keyPress")
				.onKeyUp("keyUp")
				.onLoadedData("loadedData")
				.onLoadedMetaData("loadedMetaData")
				.onLoadStart("loadStart")
				.onMouseDown("mouseDown")
				.onMouseMove("mouseMove")
				.onMouseOut("mouseOut")
				.onMouseOver("mouseOver")
				.onMouseUp("mouseUp")
				.onPaste("paste")
				.onPause("pause")
				.onPlay("play")
				.onPlaying("playing")
				.onProgress("progress")
				.onRateChange("rateChange")
				.onReset("reset")
				.onScroll("scroll")
				.onSearch("search")
				.onSeek("seek")
				.onSeeking("seeking")
				.onSelect("select")
				.onShow("show")
				.onStalled("stalled")
				.onSubmit("submit")
				.onSuspend("suspend")
				.onTimeUpdate("timeUpdate")
				.onToggle("toggle")
				.onVolumeChange("volumeChange")
				.onWaiting("waiting")
				.onWheel("wheel")
				.toString());
    }
	
	@Test
    public void globalElementTest()
    {
    	
		assertEquals("<a contenteditable=\"true\" hidden tabindex=\"1\" data-myOtherData=\"my other data value\" dir=\"auto\" title=\"Title\" dropzone=\"copy\" accesskey=\"key\" draggable=\"false\" spellcheck=\"true\" data-myData=\"my data value\" style=\"color:blue;text-align:centre\" id=\"id\" lang=\"de\" class=\"class notranslate\"/>", 
				hb.element(HtmlA.class)
				.setId("id")
				.setAccesskey("key")
				.setClass("html class")
				.setContentEditable(true)
				.setDir(Dir.AUTO)
				.setDraggable(TrueFalse.FALSE)
				.setDropzone(DropZone.COPY)
				.setHidden()
				.setLang(HtmlLanguageCode.GERMAN)
				.setSpellCheck(TrueFalse.TRUE)
				.setStyle("color:blue")
				.setTabIndex(1)
				.setTitle("Title")
				.setTranslate(false)
				.addClass("class")
				.removeClass("html")
				.addData("myData", "my data value")
				.addData("myOtherData", "my other data value")
				.addStyle("text-align", "centre")
				.toString());
    }
	
	@Test
    public void aTest()
    {
    	
		assertEquals("<a download=\"download\" hrefLang=\"af\" rel=\"alternate\" href=\"href\" media=\"(screen)\" type=\"image/png\" target=\"_parent\"/>", 
				hb.element(HtmlA.class)
				.setDownload("download")
				.setHref("href")
				.setHrefLang(HtmlLanguageCode.AFRIKAANS)
				.setMedia(MediaQueryBuilder.device(Device.SCREEN))
				.setRel(ARel.ALTERNATE)
				.setTarget(Target.PARENT)
				.setType(MediaTypes.Image.png)
				.toString());
    }
	
	@Test
    public void abbrTest()
    {
	    			
		assertEquals("<abbr/>", 
				hb.element(HtmlAbbr.class)
				.toString());
    }
	
	@Test
    public void addressTest()
    {
		
		assertEquals("<address/>", 
				hb.element(HtmlAddress.class)
				.toString());
    }
	
	@Test
    public void areaTest()
    {
		
		assertEquals("<area download=\"download\" alt=\"alt\" rel=\"author\" href=\"href\" media=\"(print)\" type=\"application/activemessage\" coords=\"0,0\" target=\"_blank\"/>", 
				hb.element(HtmlArea.class)
				.setAlt("alt")
				.setCoords("0,0")
				.setDownload("download")
				.setHref("href")
				.setMedia(MediaQueryBuilder.device(Device.PRINT))
				.setRel(ARel.AUTHOR)
				.setTarget(Target.BLANK)
				.setType(MediaTypes.Application.activemessage)
				.toString());
    }
	
	@Test
    public void articleTest()
    {
		
		assertEquals("<article/>", 
				hb.element(HtmlArticle.class)
				.toString());
    }
	
	@Test
    public void asideTest()
    {
		
		assertEquals("<aside/>", 
				hb.element(HtmlAside.class)
				.toString());
    }
	
	@Test
    public void audioTest()
    {

		assertEquals("<audio controls src=\"src\" loop muted preload=\"auto\" autoplay/>", 
				hb.element(HtmlAudio.class)
				.setAutoplay()
				.setControls()
				.setLoop()
				.setMuted()
				.setPreload(Preload.AUTO)
				.setSrc("src")
				.toString());
		
		assertEquals("<audio><source/><track/></audio>", 
				hb.element(HtmlAudio.class)
				.source().up(HtmlAudio.class)
				.track().up(HtmlAudio.class)
				.toString());
		
		
    }
	
	@Test
    public void bTest()
    {
		
		assertEquals("<b/>", 
				hb.element(HtmlB.class)
				.toString());
    }
	
	@Test
    public void baseTest()
    {

		assertEquals("<base href=\"href\" target=\"target\"/>", 
				hb.element(HtmlBase.class)
				.setHref("href")
				.setTarget("target")
				.toString());
    }
	
	@Test
    public void bdiTest()
    {

		assertEquals("<bdi/>", 
				hb.element(HtmlBdi.class)
				.toString());
    }
	
	@Test
    public void bdoTest()
    {

		assertEquals("<bdo dir=\"ltr\"/>", 
				hb.element(HtmlBdo.class)
				.setDir(Dir.LTR)
				.toString());
    }
	
	@Test
    public void blockquoteTest()
    {

		assertEquals("<blockquote cite=\"cite\"/>", 
				hb.element(HtmlBlockQuote.class)
				.setCite("cite")
				.toString());
    }
	
	@Test
    public void bodyTest()
    {

		assertEquals("<body onUnload=\"unload\" onError=\"error\" onOnLine=\"online\" onPopState=\"popState\" onAfterPrint=\"afterPrint\" onBeforeUnload=\"beforeUnload\" onStorage=\"storage\" onOffLine=\"offline\" onHashChange=\"hashChange\" onResize=\"resize\" onBeforePrint=\"beforePrint\" onPageShow=\"pageShow\" onLoad=\"load\" onMessage=\"message\" onPageHide=\"pageHide\"/>", 
				hb.element(HtmlBody.class)
				.onAfterPrint("afterPrint")
				.onBeforePrint("beforePrint")
				.onBeforeUnload("beforeUnload")
				.onError("error")
				.onHashChange("hashChange")
				.onLoad("load")
				.onMessage("message")
				.onOffline("offline")
				.onOnLine("online")
				.onPageHide("pageHide")
				.onPageShow("pageShow")
				.onPopState("popState")
				.onResize("resize")
				.onStorage("storage")
				.onUnload("unload")
				.toString());
    }
	
	@Test
    public void brTest()
    {

		assertEquals("<br/>", 
				hb.element(HtmlBr.class)
				.toString());
    }
	
	@Test
    public void buttonTest()
    {

		assertEquals("<button formMethod=\"post\" formNoValidate form=\"form\" name=\"name\" disabled formAction=\"formAction\" formTarget=\"_blank\" autoFocus type=\"submit\" value=\"value\" formEncType=\"text/plain\"/>", 
				hb.element(HtmlButton.class)
				.setType(ButtonType.SUBMIT)
				.setAutoFocus()
				.setDisabled()
				.setForm("form")
				.setFormAction("formAction")
				.setFormEncType(FormEncType.TEXT)
				.setFormMethod(FormMethod.POST)
				.setFormNoValidate()
				.setFormTarget(Target.BLANK)
				.setName("name")
				.setValue("value")
				.toString());
    }
	
	@Test
    public void canvasTest()
    {

		assertEquals("<canvas width=\"2\" height=\"1\"/>", 
				hb.element(HtmlCanvas.class)
				.setHeight(1)
				.setWidth(2)
				.toString());
    }
	
	@Test
    public void captionTest()
    {

		assertEquals("<caption/>", 
				hb.element(HtmlCaption.class)
				.toString());
    }
	
	@Test
    public void citeTest()
    {

		assertEquals("<cite/>", 
				hb.element(HtmlCite.class)
				.toString());
    }
	
	@Test
    public void colTest()
    {

		assertEquals("<col span=\"1\"/>", 
				hb.element(HtmlCol.class)
				.setSpan(1)
				.toString());
    }
	
	@Test
    public void colgroupTest()
    {

		assertEquals("<colgroup span=\"1\"/>", 
				hb.element(HtmlColGroup.class)
				.setSpan(1)
				.toString());

		assertEquals("<colgroup><col/></colgroup>", 
				hb.element(HtmlColGroup.class)
				.col().up(HtmlColGroup.class)
				.toString());

    }
	
	@Test
    public void datalistTest()
    {

		assertEquals("<datalist/>", 
				hb.element(HtmlDataList.class)
				.toString());

		assertEquals("<datalist><option/></datalist>", 
				hb.element(HtmlDataList.class)
				.option().up(HtmlDataList.class)
				.toString());
    }
	
	@Test
    public void ddTest()
    {

		assertEquals("<dd/>", 
				hb.element(HtmlDd.class)
				.toString());
    }
	
	@Test
    public void delTest()
    {

		assertEquals("<del dateTime=\"1970-01-01 01:00:00GMT\" cite=\"cite\"/>", 
				hb.element(HtmlDel.class)
				.setCite("cite")
				.setDateTime(new Date(0))
				.toString());
    }
	
	@Test
    public void detailsTest()
    {

		assertEquals("<details open/>", 
				hb.element(HtmlDetails.class)
				.setOpen()
				.toString());

		assertEquals("<details><summary/></details>", 
				hb.element(HtmlDetails.class)
				.summary().up(HtmlDetails.class)
				.toString());
		
    }
	
	@Test
    public void dfnTest()
    {

		assertEquals("<dfn/>", 
				hb.element(HtmlDfn.class)
				.toString());
    }
	
	@Test
    public void divTest()
    {

		assertEquals("<div/>", 
				hb.element(HtmlDiv.class)
				.toString());
    }
	
	@Test
    public void dlTest()
    {

		assertEquals("<dl/>", 
				hb.element(HtmlDl.class)
				.toString());

		assertEquals("<dl><dd/><dt/></dl>", 
				hb.element(HtmlDl.class)
				.dd().up(HtmlDl.class)
				.dt().up(HtmlDl.class)
				.toString());

    }
	
	@Test
    public void dtTest()
    {

		assertEquals("<dt/>", 
				hb.element(HtmlDt.class)
				.toString());
    }
	
	@Test
    public void emTest()
    {

		assertEquals("<em/>", 
				hb.element(HtmlEm.class)
				.toString());
    }
	
	@Test
    public void embedTest()
    {

		assertEquals("<embed src=\"url\" width=\"2\" type=\"text/css\" height=\"1\"/>", 
				hb.element(HtmlEmbed.class)
				.setHeight(1)
				.setType(MediaTypes.Text.css)
				.setUrl("url")
				.setWidth(2)
				.toString());
    }
	
	@Test
    public void fieldsetTest()
    {

		assertEquals("<fieldset form=\"form\" name=\"name\" disabled/>", 
				hb.element(HtmlFieldSet.class)
				.setDisabled()
				.setForm("form")
				.setName("name")
				.toString());

		assertEquals("<fieldset><legend/></fieldset>", 
				hb.element(HtmlFieldSet.class)
				.legend().up(HtmlFieldSet.class)
				.toString());

    }
	
	@Test
    public void figcaptionTest()
    {

		assertEquals("<figcaption/>", 
				hb.element(HtmlFigCaption.class)
				.toString());
    }
	
	@Test
    public void figureTest()
    {

		assertEquals("<figure src=\"src\" alt=\"alt\" width=\"2\" height=\"1\"/>", 
				hb.element(HtmlFigure.class)
				.setAlt("alt")
				.setHeight(1)
				.setSrc("src")
				.setWidth(2)
				.toString());

    }
	
	@Test
    public void footerTest()
    {
		assertEquals("<footer/>", 
				hb.element(HtmlFooter.class)
				.toString());
    }
	
	@Test
    public void formTest()
    {

		assertEquals("<form encType=\"multipart/form-data\" method=\"get\" autocomplete name=\"name\" action=\"action\" noValidate accept-charset=\"UTF-8\" target=\"_self\"/>", 
				hb.element(HtmlForm.class)
				.setAcceptCharset("UTF-8")
				.setAction("action")
				.setAutocomplete()
				.setEncType(FormEncType.MULTIPART)
				.setMethod(FormMethod.GET)
				.setName("name")
				.setNoValidate()
				.setTarget(Target.SELF)
				.toString());

    }
	
	@Test
    public void hTest()
    {
		StringWriter sw = new StringWriter();
		hb.element(HtmlH.class).toHtml(sw);
		assertEquals("<h1/>\n", sw.toString());

    }
	
	@Test
    public void h1Test()
    {
		assertEquals("<h1/>", 
				hb.element(HtmlH1.class)
				.toString());
    }
	
	@Test
    public void h2Test()
    {

		assertEquals("<h2/>", 
				hb.element(HtmlH2.class)
				.toString());

    }
	
	@Test
    public void h3Test()
    {
		assertEquals("<h3/>", 
				hb.element(HtmlH3.class)
				.toString());
    }
	
	@Test
    public void h4Test()
    {

		assertEquals("<h4/>", 
				hb.element(HtmlH4.class)
				.toString());
    }
	
	@Test
    public void h5Test()
    {

		assertEquals("<h5/>", 
				hb.element(HtmlH5.class)
				.toString());
    }
	
	@Test
    public void h6Test()
    {

		assertEquals("<h6/>", 
				hb.element(HtmlH6.class)
				.toString());
    }
	
	@Test
    public void headTest()
    {

		assertEquals("<head><meta name=\"author\" content=\"Author\"/><meta name=\"description\" content=\"Description\"/><meta name=\"keywords\" content=\"word, key\"/><meta http-equiv=\"refresh\" content=\"10\"/><title>Title</title><meta name=\"viewport\" content=\"Viewport\"/></head>", 
		hb.element(HtmlHead.class)
				.author("Author")
				.description("Description")
				.keywords("key", "word")
				.refreshRate(10)
				.title("Title")
				.viewport("Viewport")
				.toString());
		
		assertEquals("<head><base/><link/><meta/><noscript/><script/><title/></head>", 
				hb.element(HtmlHead.class)
				.base().up(HtmlHead.class)
				.link().up(HtmlHead.class)
				.meta().up(HtmlHead.class)
				.noScript().up(HtmlHead.class)
				.script().up(HtmlHead.class)
				.title().up(HtmlHead.class)
				.toString());

    }
	
	@Test
    public void headerTest()
    {

		assertEquals("<header/>", 
				hb.element(HtmlHeader.class)
				.toString());
    }
	
	@Test
    public void hrTest()
    {

		assertEquals("<hr/>", 
				hb.element(HtmlHr.class)
				.toString());
    }
	
	@Test
    public void iTest()
    {

		assertEquals("<i/>", 
				hb.element(HtmlI.class)
				.toString());
    }
	
	@Test
    public void iframeTest()
    {

		assertEquals("<iframe src=\"src\" srcDoc=\"&lt;a href=&quot;href&quot;&gt;link&lt;/a&gt;\" name=\"name\" sandbox=\"allow-forms\" width=\"2\" height=\"1\"/>", 
				hb.element(HtmlIFrame.class)
				.setHeight(1)
				.setName("name")
				.setSandbox(Sandbox.ALLOW_FORMS)
				.setSrc("src")
				.setSrcDoc(hb.element(HtmlA.class).setHref("href").t("link"))
				.setWidth(2)
				.toString());

    }
	
	@Test
    public void imgTest()
    {
		assertEquals("<img sizes=\"sizes\" src=\"src\" alt=\"alt\" width=\"2\" crossOrigin=\"anonymous\" srcSet=\"srcSet\" longDesc=\"long description\" height=\"1\" isMap useMap=\"#map\"/>", 
				hb.element(HtmlImg.class)
				.setAlt("alt")
				.setCrossOrigin(CrossOrigin.ANONYMOUS)
				.setHeight(1)
				.setIsMap()
				.setLongDesc("long description")
				.setSizes("sizes")
				.setSrc("src")
				.setSrcSet("srcSet")
				.setUseMap("map")
				.setWidth(2)
				.toString());

    }
	
	@Test
    public void inputTest()
    {
		assertEquals("<input formMethod=\"get\" autocomplete=\"off\" src=\"src\" alt=\"alt\" multiple formAction=\"action\" formTarget=\"form target\" readOnly type=\"image\" autofocus list=\"list\" required accept=\"audio/*\" form=\"form\" size=\"10\" name=\"name\" width=\"2\" disabled value=\"value\" formEncType=\"application/x-www-form-urlencoded\" placeHolder=\"placeholder\" dirName=\"dirName\" height=\"1\"/>", 
				hb.element(HtmlInput.class)
				.setType(Type.IMAGE)
				.setAccept(Accept.AUDIO)
				.setAlt("alt")
				.setAutoComplete(OnOff.OFF)
				.setAutofocus()
				.setDirName("dirName")
				.setDisabled()
				.setForm("form")
				.setFormAction("action")
				.setFormEncType(FormEncType.APPLICATION)
				.setFormMethod(FormMethod.GET)
				.setFormTarget("form target")
				.setHeight(1)
				.setList("list")
				.setMultiple()
				.setName("name")
				.setPlaceHolder("placeholder")
				.setReadOnly()
				.setRequired()
				.setSize(10)
				.setSrc("src")
				.setValue("value")
				.setWidth(2)
				.toString());

		assertEquals("<input autocomplete=\"off\" alt=\"alt\" multiple readOnly type=\"checkbox\" autofocus list=\"list\" required accept=\"audio/*\" form=\"form\" name=\"name\" checked disabled value=\"value\" dirName=\"dirName\"/>", 
				hb.element(HtmlInput.class)
				.setType(Type.CHECKBOX)
				.setAccept(Accept.AUDIO)
				.setAlt("alt")
				.setAutoComplete(OnOff.OFF)
				.setAutofocus()
				.setChecked()
				.setDirName("dirName")
				.setDisabled()
				.setForm("form")
				.setList("list")
				.setMultiple()
				.setName("name")
				.setReadOnly()
				.setRequired()
				.setValue("value")
				.toString());
    }
	
	@Test
    public void insTest()
    {

		assertEquals("<ins dateTime=\"1970-01-01 01:00:00GMT\" cite=\"cite\"/>", 
				hb.element(HtmlIns.class)
				.setCite("cite")
				.setDateTime(new Date(0))
				.toString());
    }
	
	@Test
    public void kbdTest()
    {

		assertEquals("<kbd/>", 
				hb.element(HtmlKbd.class)
				.toString());
    }
	
	@Test
    public void labelTest()
    {

		assertEquals("<label form=\"form\" for=\"for\"/>", 
				hb.element(HtmlLabel.class)
				.setFor("for")
				.setForm("form")
				.toString());
    }
	
	@Test
    public void legendTest()
    {

		assertEquals("<legend/>", 
				hb.element(HtmlLegend.class)
				.toString());
    }
	
	@Test
    public void liTest()
    {

		assertEquals("<li value=\"1\"/>", 
				hb.element(HtmlLi.class)
				.setValue(1)
				.toString());
    }
	
	@Test
    public void linkTest()
    {

		assertEquals("<link hrefLang=\"en\" sizes=\"sizes\" rel=\"icon\" crossOrigin=\"use-credentials\" href=\"href\" media=\"(color)\" type=\"video/H264\"/>", 
				hb.element(HtmlLink.class)
				.setCrossOrigin(CrossOrigin.USE_CREDENTIALS)
				.setHRef("href")
				.setHRefLang(HtmlLanguageCode.ENGLISH)
				.setMedia(MediaQueryBuilder.attribute(Attribute.COLOR))
				.setRel(LinkRel.ICON)
				.setSizes("sizes")
				.setType(MediaTypes.Video.H264)
				.toString());
    }
	
	@Test
    public void mainTest()
    {

		assertEquals("<main/>", 
				hb.element(HtmlMain.class)
				.toString());
    }
	
	@Test
    public void mapTest()
    {

		assertEquals("<map name=\"name\"/>", 
				hb.element(HtmlMap.class)
				.setName("name")
				.toString());
    }
	
	@Test
    public void markTest()
    {

		assertEquals("<mark/>", 
				hb.element(HtmlMark.class)
				.toString());
    }
	
	@Test
    public void metaTest()
    {

		assertEquals("<meta charSet=\"UTF-8\" name=\"application-name\" http-equiv=\"content-type\" content=\"content\"/>", 
				hb.element(HtmlMeta.class)
				.setCharSet("UTF-8")
				.setContent("content")
				.setHttpEquiv(HttpEquiv.CONTENT_TYPE)
				.setName(MetaName.APPLICATION_NAME)
				.toString());
    }
	
	@Test
    public void meterTest()
    {

		assertEquals("<meter high=\"10\" min=\"1\" form=\"form\" low=\"0\" max=\"9\" optimum=\"5\" value=\"3\"/>", 
				hb.element(HtmlMeter.class)
				.setForm("form")
				.setHigh(10)
				.setLow(0)
				.setMax(9)
				.setMin(1)
				.setOptimum(5)
				.setValue(3)
				.toString());
    }
	
	@Test
    public void navTest()
    {

		assertEquals("<nav/>", 
				hb.element(HtmlNav.class)
				.toString());
    }
	
	@Test
    public void noscriptTest()
    {

		assertEquals("<noscript/>", 
				hb.element(HtmlNoScript.class)
				.toString());
    }
	
	@Test
    public void objectTest()
    {

		assertEquals("<object data=\"data\" form=\"form\" name=\"name\" width=\"2\" type=\"font/otf\" height=\"1\" useMap=\"#map\"/>", 
				hb.element(HtmlObject.class)
				.setData("data")
				.setForm("form")
				.setHeight(1)
				.setName("name")
				.setType(MediaTypes.Font.otf)
				.setUseMap("map")
				.setWidth(2)
				.toString());

		assertEquals("<object><param/></object>", 
				hb.element(HtmlObject.class)
				.param().up(HtmlObject.class)
				.toString());

    }
	
	@Test
    public void olTest()
    {

		assertEquals("<ol start=\"1\" type=\"a\" reversed/>", 
				hb.element(HtmlOl.class)
				.setReversed()
				.setStart(1)
				.setType(OlType.LOWER_CHAR)
				.toString());

		assertEquals("<ol><li/></ol>", 
				hb.element(HtmlOl.class)
				.li().up(HtmlOl.class)
				.toString());

    }
	
	@Test
    public void optgroupTest()
    {

		assertEquals("<optgroup disabled label=\"label\"/>", 
				hb.element(HtmlOptGroup.class)
				.setDisabled()
				.setLabel("label")
				.toString());

		assertEquals("<optgroup><option/></optgroup>", 
				hb.element(HtmlOptGroup.class)
				.option().up(HtmlOptGroup.class)
				.toString());

    }
	
	@Test
    public void optionTest()
    {

		assertEquals("<option disabled label=\"label\" value=\"value\" selected/>", 
				hb.element(HtmlOption.class)
				.setDisabled()
				.setLabel("label")
				.setSelected()
				.setValue("value")
				.toString());
    }
	
	@Test
    public void outputTest()
    {

		assertEquals("<output form=\"form\" for=\"for\" name=\"name\"/>", 
				hb.element(HtmlOutput.class)
				.setFor("for")
				.setForm("form")
				.setName("name")
				.toString());
    }
	
	@Test
    public void pTest()
    {

		assertEquals("<p/>", 
				hb.element(HtmlP.class)
				.toString());
    }
	
	@Test
    public void paramTest()
    {

		assertEquals("<param name=\"name\" value=\"value\"/>", 
				hb.element(HtmlParam.class)
				.setName("name")
				.setValue("value")
				.toString());
    }
	
	@Test
    public void pictureTest()
    {

		assertEquals("<picture/>", 
				hb.element(HtmlPicture.class)
				.toString());

		assertEquals("<picture><img/><noscript/><script/><source/></picture>", 
				hb.element(HtmlPicture.class)
				.img().up(HtmlPicture.class)
				.noScript().up(HtmlPicture.class)
				.script().up(HtmlPicture.class)
				.source().up(HtmlPicture.class)
				.toString());

    }
	
	@Test
    public void preTest()
    {

		assertEquals("<pre/>", 
				hb.element(HtmlPre.class)
				.toString());
    }
	
	@Test
    public void progressTest()
    {

		assertEquals("<progress max=\"10\" value=\"3\"/>", 
				hb.element(HtmlProgress.class)
				.setMax(10)
				.setValue(3)
				.toString());
    }
	
	@Test
    public void qTest()
    {

		assertEquals("<q cite=\"cite\"/>", 
				hb.element(HtmlQ.class)
				.setCite("cite")
				.toString());
    }
	
	@Test
    public void rpTest()
    {

		assertEquals("<rp/>", 
				hb.element(HtmlRp.class)
				.toString());
    }
	
	@Test
    public void rtTest()
    {

		assertEquals("<rt/>", 
				hb.element(HtmlRt.class)
				.toString());
    }
	
	@Test
    public void rubyTest()
    {

		assertEquals("<ruby/>", 
				hb.element(HtmlRuby.class)
				.toString());

		assertEquals("<ruby><rp/><rt/></ruby>", 
				hb.element(HtmlRuby.class)
				.rp().up(HtmlRuby.class)
				.rt().up(HtmlRuby.class)
				.toString());

    }
	
	@Test
    public void sTest()
    {

		assertEquals("<s/>", 
				hb.element(HtmlS.class)
				.toString());
    }
	
	@Test
    public void sampTest()
    {

		assertEquals("<samp/>", 
				hb.element(HtmlSamp.class)
				.toString());
    }
	
	@Test
    public void scriptTest()
    {

		assertEquals("<script charSet=\"UTF-8\" async defer src=\"src\" type=\"application/javascript\"/>", 
				hb.element(HtmlScript.class)
				.setAsync()
				.setCharSet("UTF-8")
				.setDefer()
				.setSrc("src")
				.setType(MediaTypes.Application.javascript)
				.toString());
    }
	
	@Test
    public void sectionTest()
    {

		assertEquals("<section/>", 
				hb.element(HtmlSection.class)
				.toString());
    }
	
	@Test
    public void selectTest()
    {

		assertEquals("<select form=\"form\" size=\"10\" multiple name=\"name\" disabled autofocus required/>", 
				hb.element(HtmlSelect.class)
				.setAutofocus()
				.setDisabled()
				.setForm("form")
				.setMultiple()
				.setName("name")
				.setRequired()
				.setSize(10)
				.toString());

		assertEquals("<select><optgroup/><option/></select>", 
				hb.element(HtmlSelect.class)
				.optGroup().up(HtmlSelect.class)
				.option().up(HtmlSelect.class)
				.toString());

    }
	
	@Test
    public void smallTest()
    {

		assertEquals("<small/>", 
				hb.element(HtmlSmall.class)
				.toString());
    }
	
	@Test
    public void sourceTest()
    {

		assertEquals("<source sizes=\"sizes\" src=\"src\" media=\"(monochrome)\" srcSet=\"srcSet\" type=\"text/xml\"/>", 
				hb.element(HtmlSource.class)
				.setMedia(MediaQueryBuilder.attribute(Attribute.MONOCHROME))
				.setSizes("sizes")
				.setSrc("src")
				.setSrcSet("srcSet")
				.setType(MediaTypes.Text.xml)
				.toString());
    }
	
	@Test
    public void spanTest()
    {

		assertEquals("<span/>", 
				hb.element(HtmlSpan.class)
				.toString());
    }
	
	@Test
    public void strongTest()
    {

		assertEquals("<strong/>", 
				hb.element(HtmlStrong.class)
				.toString());
    }
	
	@Test
    public void styleTest()
    {

		assertEquals("<style scoped media=\"(speach)\" type=\"text/css\"/>", 
				hb.element(HtmlStyle.class)
				.setMedia(MediaQueryBuilder.device(Device.SPEACH))
				.setScoped()
				.toString());
    }
	
	@Test
    public void subTest()
    {

		assertEquals("<sub/>", 
				hb.element(HtmlSub.class)
				.toString());
    }
	
	@Test
    public void summaryTest()
    {

		assertEquals("<summary/>", 
				hb.element(HtmlSummary.class)
				.toString());
    }
	
	@Test
    public void supTest()
    {

		assertEquals("<sup/>", 
				hb.element(HtmlSup.class)
				.toString());
    }
	
	@Test
    public void tableTest()
    {

		assertEquals("<table/>", 
				hb.element(HtmlTable.class)
				.toString());

		assertEquals("<table><caption/><colgroup/><tbody/><tfoot/><thead/><tr/></table>", 
				hb.element(HtmlTable.class)
				.caption().up(HtmlTable.class)
				.colGroup().up(HtmlTable.class)
				.tBody().up(HtmlTable.class)
				.tFoot().up(HtmlTable.class)
				.tHead().up(HtmlTable.class)
				.tr().up(HtmlTable.class)
				.toString());

    }
	
	@Test
    public void tbodyTest()
    {

		assertEquals("<tbody/>", 
				hb.element(HtmlTBody.class)
				.toString());

		assertEquals("<tbody><tr/></tbody>", 
				hb.element(HtmlTBody.class)
				.tr().up(HtmlTBody.class)
				.toString());


    }
	
	@Test
    public void tdTest()
    {

		assertEquals("<td rowSpan=\"3\" headers=\"headers\" colSpan=\"2\"/>", 
				hb.element(HtmlTd.class)
				.setColSpan(2)
				.setHeaders("headers")
				.setRowSpan(3)
				.toString());
    }
	
	@Test
    public void textareaTest()
    {

		assertEquals("<textarea form=\"form\" name=\"name\" readOnly autofocus rows=\"10\" cols=\"50\" wrap=\"hard\" maxLength=\"200\" placeHolder=\"place holder\" required dirName=\"dirName\"/>", 
				hb.element(HtmlTextArea.class)
				.setAutofocus()
				.setCols(50)
				.setDirName("dirName")
				.setForm("form")
				.setMaxLength(200)
				.setName("name")
				.setPlaceHolder("place holder")
				.setReadOnly()
				.setRequired()
				.setRows(10)
				.setWrap(Wrap.HARD)
				.toString());
    }
	
	@Test
    public void tfootTest()
    {

		assertEquals("<tfoot/>", 
				hb.element(HtmlTFoot.class)
				.toString());

		assertEquals("<tfoot><tr/></tfoot>", 
				hb.element(HtmlTFoot.class)
				.tr().up(HtmlTFoot.class)
				.toString());

    }
	
	@Test
    public void thTest()
    {

		assertEquals("<th rowSpan=\"3\" headers=\"headers\" colSpan=\"2\" scope=\"row\" abbr=\"abbr\"/>", 
				hb.element(HtmlTh.class)
				.setAbbr("abbr")
				.setColSpan(2)
				.setHeaders("headers")
				.setRowSpan(3)
				.setScope(Scope.ROW)
				.toString());
    }
	
	@Test
    public void theadTest()
    {

		assertEquals("<thead/>", 
				hb.element(HtmlTHead.class)
				.toString());

		assertEquals("<thead><tr/></thead>", 
				hb.element(HtmlTHead.class)
				.tr().up(HtmlTHead.class)
				.toString());

    }
	
	@Test
    public void timeTest()
    {

		assertEquals("<time dateTime=\"1970-01-01 01:00:00GMT\"/>", 
				hb.element(HtmlTime.class)
				.setDateTime(new Date(0))
				.toString());
    }
	
	@Test
    public void titleTest()
    {

		assertEquals("<title/>", 
				hb.element(HtmlTitle.class)
				.toString());
    }
	
	@Test
    public void trTest()
    {

		assertEquals("<tr/>", 
				hb.element(HtmlTr.class)
				.toString());

		assertEquals("<tr><th/><td/></tr>", 
				hb.element(HtmlTr.class)
				.th().up(HtmlTr.class)
				.td().up(HtmlTr.class)
				.toString());

    }
	
	@Test
    public void trackTest()
    {

		assertEquals("<track default src=\"src\" kind=\"chapters\" label=\"label\" srcLang=\"fr\"/>", 
				hb.element(HtmlTrack.class)
				.setDefault()
				.setKind(Kind.CHAPTERS)
				.setLabel("label")
				.setSrc("src")
				.setSrcLang(HtmlLanguageCode.FRENCH)
				.toString());
    }
	
	@Test
    public void uTest()
    {

		assertEquals("<u/>", 
				hb.element(HtmlU.class)
				.toString());
    }
	
	@Test
    public void ulTest()
    {

		assertEquals("<ul/>", 
				hb.element(HtmlUl.class)
				.toString());

		assertEquals("<ul><li/></ul>", 
				hb.element(HtmlUl.class)
				.li().up(HtmlUl.class)
				.toString());

    }
	
	@Test
    public void varTest()
    {

		assertEquals("<var/>", 
				hb.element(HtmlVar.class)
				.toString());
    }
	
	@Test
    public void videoTest()
    {

		assertEquals("<video controls src=\"src\" loop width=\"30\" preLoad=\"metadata\" muted autoplay height=\"10\"/>", 
				hb.element(HtmlVideo.class)
				.setAutoplay()
				.setControls()
				.setHeight(10)
				.setLoop()
				.setMuted()
				.setPreLoad(Preload.METADATA)
				.setSrc("src")
				.setWidth(30)
				.toString());

		assertEquals("<video><source/><track/></video>", 
				hb.element(HtmlVideo.class)
				.source().up(HtmlVideo.class)
				.track().up(HtmlVideo.class)
				.toString());

    }
	
	@Test
    public void wbrTest()
    {

		assertEquals("<wbr/>", 
				hb.element(HtmlWbr.class)
				.toString());
		
    }

}
