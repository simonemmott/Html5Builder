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
    }
	
	@Test
    public void datalistTest()
    {

		assertEquals("<datalist/>", 
				hb.element(HtmlDataList.class)
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

		assertEquals("<head><meta name=\"author\" content=\"Author\"/><meta name=\"description\" content=\"Description\"/><meta name=\"keywords\" content=\"key, word\"/><meta http-equiv=\"refresh\" content=\"10\"/><title>Title</title><meta name=\"viewport\" content=\"Viewport\"/></head>", 
				hb.element(HtmlHead.class)
				.author("Author")
				.description("Description")
				.keywords("key", "word")
				.refreshRate(10)
				.title("Title")
				.viewport("Viewport")
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
    }
	
	@Test
    public void optgroupTest()
    {

		assertEquals("<optgroup disabled label=\"label\"/>", 
				hb.element(HtmlOptGroup.class)
				.setDisabled()
				.setLabel("label")
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
    }
	
	@Test
    public void tbodyTest()
    {

		assertEquals("<tbody/>", 
				hb.element(HtmlTBody.class)
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
    }
	
	@Test
    public void wbrTest()
    {

		assertEquals("<wbr/>", 
				hb.element(HtmlWbr.class)
				.toString());
		
    }

}
