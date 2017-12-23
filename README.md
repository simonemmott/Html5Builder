# Html5Builder
The Html5Bulider is a simple light weight utility for dynamically generating HTML pages and snippets. It extends the XMLBuilder and consequently has a similar API. The Html5Builder API ordinarily restricts the user to only generate valid HTML 5, however the underlying XMLBuilder API is accessible and using the XMLBuilder methods allows the user to create non HTML 5 compliant documents. The Html5Builder can generate whole pages including the <DOCTYPE> tag and optionally the XML prolog if required. By default the DOCTYPE tag is the standard HTML 5 DOCTYPE tag, however it can also produce XHTML DOCTYPEs and by default properly closes all HTML tags compliant with the XHTML standard.

Included with the Html5Builder is a very simple MediaQueryBuilder that allows for dynamic generation of syntactically correct media queries for injection into relevant HTML attributes.

The basic structure of the Html5Builder API has classes for each HTML element with `set*(...)` methods to set attributes and `<htmlTag>()` methods to create child elements of the current element with the relevant tag (where `<htmlTag>` is the tag of a valid HTML child element of the current element. The `up()` method of the XMLBuilder has been extended to `up(Class c)` where `c` refers to the class of the parent element thus providing compile time validation of the document structure.

### License

[GNU GENERAL PUBLIC LICENSE v3](http://fsf.org/)

## Basic Example

The Html5Builder can easily generate HTML pages.

This code:
```java
Html5Builder hb = new Html5Builder();

hb.page().toHtml(new PrintWriter(System.out)).flush();
```
Produces the following HTML docuement.
```html
<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
	</head>
	<body/>
</html>
```
Note the automcatic inclusion of the DOCTYPE tag defining an HTML 5 document and the automatic inclusion of the head and body tags and the meta viewport specification causing the viewport to automatically scale with the device width.

The Html5Builder can easily generate HTML snippets.  An HTML snippet is an internally valid section of HTML with a single root element.

This code:
```java
Html5Builder hb = new Html5Builder();

hb.element(HtmlDiv.class)
	.setClass("myClass")
	.setId("myDiv")
	.a()
		.setHref("http://www.google.com")
		.t("Google")
		.up(HtmlDiv.class)
	.p()
		.t("The above hyperlink links to www.googl.com")
		.up(HtmlDiv.class)
	.toHtml(new PrintWriter(System.out)).flush();
```
Produces the following HTML snippet.
```html
<div id="myDiv" class="myClass">
	<a href="http://www.google.com">Google</a>
	<p>The above hyperlink links to www.googl.com</p>
</div>
```

## Getting Started

Download a jar file containing the latest version or fork this project and install in your IDE

Maven users can add this project using the following additions to the pom.xml file.
```maven
<dependencies>
    ...
    <dependency>
        <groupId>com.k2</groupId>
        <artifactId>Html5Builder</artifactId>
        <version>0.1.0</version>
    </dependency>
    ...
</dependencies>
```

## Working With CssSelectorParser
The CssSelectorParser has a very simple API. Parsing a CSS selector is a simple as calling the static method
`CssSelectorParser.parse(...)` passing in the CSS selector as a string.

e.g.
```java
CssSelectorParser.parse("audio[src$=.ogg]")
```
The result of the call to the parse static method is a `List` of instances of `CssElementFilter`

Each element filter defines the filter rules to be applied to an element 
e.g. 
The CSS selector `#myId` identifies the rule 
1. element id equals myId

And CSS Selector `img.myClass[src$=.png]` identifies the rules

1. element with tag `img`
1. element with class `myClass`
1. element with attribute name `src` and ending with `.png`

An element filter can have preceding filters. Preseding filters are applied to the elements above and beside the element in the 
node hierarchy. For example the CSS selector `div > p` defines 2 element filters

1. Elements with tag `p`
1. With a parent with tag `div`

This can be extended indefinitely e.g. CSS selector `div > p h1` defines 3 filters

1. Elements with tag `h1`
1. Within an element with tag `p`
1. That is the direct child of an element with tag `div`

This construction can be thought of as a chain of element filters. The chain of element filters can be navigated through the
`CssElementFilter#previousFilter` field and the type of the link in the chain is defined in the `CssElementFilter#rule`

The element filter rule is an enumeration with the following possible values
1. IS_ANCESTOR
1. IS_PARENT
1. PREVIOUS_SIBLING
1. NEXT_SIBLING

CSS selectors can define many element filters (or filter chains) and a positive match should be generated if any of the filter 
chains match the element in question. e.g. the CSS selector `div, span, table` matches all divisions **Or** all spans **Or** all tables.

This concept is encapsuleted in the structured data genrated by CssSelectorParser as multiple element filters *potentially the 
start of a filter chain* in the list returned by the call to `CssSelectorParser#parse(...)`

## Example
The source below:
```java
String cssSelector = ".myClass > img[src$=.jpg], ol#thisId + li[data-myData='some data value']";

List<CssElementFilter> filters = CssSelectorParser.parse(cssSelector);

System.out.println();
System.out.println("The CSS selector: "+cssSelector+" was parsed to generate");
System.out.println();		
System.out.println(
		filters.get(0).previousFilter.elementFilterRules.get(0).type + " " + 
		filters.get(0).previousFilter.elementFilterRules.get(0).check);
System.out.println(filters.get(0).rule + " of");
System.out.println(
		filters.get(0).elementFilterRules.get(0).type + " " + 
		filters.get(0).elementFilterRules.get(0).check + " and");
System.out.println(
		filters.get(0).elementFilterRules.get(1).attribute + " " + 
		filters.get(0).elementFilterRules.get(1).type + " " + 
		filters.get(0).elementFilterRules.get(1).check);
System.out.println("Or");
System.out.println(
		filters.get(1).previousFilter.elementFilterRules.get(0).type + " " + 
		filters.get(1).previousFilter.elementFilterRules.get(0).check + " and");
System.out.println(
		filters.get(1).previousFilter.elementFilterRules.get(1).type + " " + 
		filters.get(1).previousFilter.elementFilterRules.get(1).check);
System.out.println(filters.get(1).rule + " of");
System.out.println(
		filters.get(1).elementFilterRules.get(0).type + " " + 
		filters.get(1).elementFilterRules.get(0).check);
System.out.println(
		filters.get(1).elementFilterRules.get(1).attribute + " " + 
		filters.get(1).elementFilterRules.get(1).type + " " + 
		filters.get(1).elementFilterRules.get(1).check);
```
produces the follwing output
```text
The CSS selector: .myClass > img[src$=.jpg], ol#thisId + li[data-myData='some data value'] was parsed to generate

HAS_CLASS myClass
IS_PARENT of
TAG_EQUALS img and
src ATTRIBUTE_ENDS_WITH .jpg
Or
TAG_EQUALS ol and
ID_EQUALS thisId
PREVIOUS_SIBLING of
TAG_EQUALS li
data-myData ATTRUBUTE_EQUALS some data value
```









