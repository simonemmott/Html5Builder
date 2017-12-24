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

## Working With Html5Builder
The Html5Builder API allows the creation of HTML pages through the `Html5Builder.page(...)` methods. These methods produce a full page of HTML including the `<DOCTYPE>` tag and the `<html>`, `<head>` and `<body>` tags. The `page(...)` methods return an instance of HtmlPage which includes the public fields `head` and `body` that relate to the `<head>` and `<body>` elements respectively

The Html5Builder API includes java classes for each valid HTML 5 element and each class contains methods to set the element valid attributes and valid child elements. These elements are created through calls to the `Html5Builder.element(Class c)`

In all cases the HTML document or snippet is assembled by calls to the `set*(...)` methods to set attribute values and the `<htmlTag>()` methods to create and focus on child elements and the `up(...)` methods to step back up the document path. In the case of HTML documents the `page()` method returns focus back to the documents HtmlPage instance.

The assembled document or snippet is output using the `toHtml(...)` methods.


## Page Examples

### Populating the `<head>` element

HTML pages define meta data about the page. Html5Builder provides methods on the head element of the page to set common page meta data. The head element provides the following methods:

1. `keywords(String ... keywords)`
This method sets the keywords for the page. Duplicate words are automatically removed  and repeated calls to this method add to existing keywords. A string containing several words separated by commas or white space is treated as separate words.
1. `description(String description)`
This method sets the description of the page. Duplicate calls to this method replace the description of the page.
1. `title(String title)`
This method sets the title of the page. Duplicate calls to this method replace the title of the page.
1. `author(String author)`
This method sets the author of the page. Duplicate calls to this method replace the author of the page.
1. `refreshRate(Integer refreshRate)`
This method identifies that the page should automatically refresh and sets the refresh rate in seconds.
1. `viewport(String viewport)`
This method sets the contents of the viewport meta tag to the given string. If this method is not called then the default viewport meta tag is used. The default viewport meta tag causes the viewport to automatically adjust to the medias screen size.
1. `base(String href)`
This method set the base URL for the page. Duplicate calls to this method replace the base href for the page.

The code below shows the invocation of these methods.
```java
Html5Builder hb = new Html5Builder();

hb.page()
	.head
		.title("This is the page title")
		.author("Simon Emmott")
		.description("This is the page description")
		.keywords("hello", "world", "and", "more", "words", "lots, and, lots, of, words")
		.keywords("many", "words")
		.base("http://www.example.com/mySite/")
		.page()
.toHtml(new PrintWriter(System.out)).flush();
```
Which produces the following output
```html
<!DOCTYPE html>
<html>
	<head>
		<title>This is the page title</title>
		<meta name="author" content="Simon Emmott">
		<meta name="description" content="This is the page description">
		<meta name="keywords" content="lots, world, and, more, of, words, hello, many">
		<base href="http://www.example.com/mySite/">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
	</head>
	<body/>
</html>
```
All the above methods can be replicated using the normal API methods

The above html can also be produced by the following code:
```java
Html5Builder hb = new Html5Builder();

hb.page()
	.head
		.title()
			.t("This is the page title")
			.up(HtmlHead.class)
		.meta()
			.setName(MetaName.AUTHOR)
			.setContent("Simon Emmott")
			.up(HtmlHead.class)
		.meta()
			.setName(MetaName.DESCRIPTION)
			.setContent("This is the page description")
			.up(HtmlHead.class)
		.meta()
			.setName(MetaName.KEYWORDS)
			.setContent("lots, world, and, more, of, words, hello, many")
			.up(HtmlHead.class)
		.base()
			.setHref("http://www.example.com/mySite/")
			.page()
.toHtml(new PrintWriter(System.out)).flush();
```
**NOTE** By using the normal API methods the keywords have to be on in a single string of comma separated words and multiple inclusions of the meta tags for title, author and description etc. become possible with consequences for the generated HTML.

### Populating the `<body>` element

All HTML elements share a set of global attributes as defined by [W3C - HTML Gloabl Attributes](https://www.w3schools.com/tags/ref_standardattributes.asp). These attributes are implemented as `set<Attribute-Name>(...)` methods. Where `<Attribute-Name>` refers to the name of the attribute. These methods are available on all HTML elements. Some of these attributes like the `class` and `data-*` attribute allow multiple values. In these cases specific methods exist to manage these *special* attributes.

These special methods are listed below:

1. `addClass(String cls)`
This method adds the class defined by the variable  `cls` to the list of classes defined by the `class` attribute. If the class attribute has not been set it will be set to the value of the `cls` variable.
1. `removeClass(String cls)`
This method removes the class defined by the variable `cls` from the list of classes defined by the `class` attribute. If class to be removed is the last class in the class list then the `class` attribute is removed from the element.
1. `addData(String id, String value)`
This method defines the value for the data attribute `data-<id>` where `<id>` is the identifier of the data attribute defined by the variable `id` and sets its value to the value of the `value` variable.
1. `addStyle(String cssAttribute, String value)`
This method add a CSS style to the element for the given CSS attribute and value.
**NOTE** No validation is implemented on the CSS attribute and duplicate CSS attributes are not prevented.
1. `setNullattributeHandling(NullAttributeHandling nullAttributeHandling)`
This attribute defines how null attributes should be handled for this element. The possible values for this method are:

|Enumeration|Description|
|-----------|-----------|
|SKIP       |If the attribute value is null the attribute is not included in the HTML output|
|BLANK      |If the attribute value is null the attribute is included in the HTML output but without an equals clause `="<value>"`.|
|USE_NULL   |If the attribute value is null the attribute is included in the HTML output but with the equals clause of `="null"`.|




Elements in the body section can be classified as *phrasing elements* or *flow elements*. Both phrasing elements and flow elements share a set of common attributes











