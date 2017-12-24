# Html5Builder
The Html5Bulider is a simple light weight utility for dynamically generating HTML pages and snippets. It extends the XMLBuilder and consequently has a similar API. The Html5Builder API ordinarily restricts the user to only generate valid HTML 5, however the underlying XMLBuilder API is accessible and using the XMLBuilder methods allows the user to create non HTML 5 compliant documents. The Html5Builder can generate whole pages including the <DOCTYPE> tag and optionally the XML prolog if required. By default the DOCTYPE tag is the standard HTML 5 DOCTYPE tag, however it can also produce XHTML DOCTYPEs and by default properly closes all HTML tags compliant with the XHTML standard.

Included with the Html5Builder is a very simple MediaQueryBuilder that allows for dynamic generation of syntactically correct media queries for injection into relevant HTML attributes.

The basic structure of the Html5Builder API has classes for each HTML element with `set*(...)` methods to set attributes and `<htmlTag>()` methods to create child elements of the current element with the relevant tag (where `<htmlTag>` is the tag of a valid HTML child element of the current element. The `up()` method of the XMLBuilder has been extended to `up(Class c)` where `c` refers to the class of the parent element thus providing compile time validation of the document structure.

For example output and detailed documentation please view the [Html5Builder](https://simonemmott.github.io/Html5Builder/index.html) documentation

### License

[GNU GENERAL PUBLIC LICENSE v3](http://fsf.org/)

## Basic Example

The Html5Builder can easily generate HTML pages.

This code:
```java
Html5Builder hb = new Html5Builder();

hb.page().toHtml(new PrintWriter(System.out)).flush();
```
Produces the following HTML document.
```html
<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
	</head>
	<body/>
</html>
```
Note the automatic inclusion of the DOCTYPE tag defining an HTML 5 document and the automatic inclusion of the head and body tags and the meta viewport specification causing the viewport to automatically scale with the device width.

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

### Creating HTML Pages

The simplest way to create an HTML page is through the `page()` method of Html5Builder.

This code:
```java
Html5Builder hb = new Html5Builder();

hb.page().toHtml(new PrintWriter(System.out)).flush();
```
produces an HTML 5 compliant page as below.
```html
<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
	</head>
	<body/>
</html>
```

More detailed control can be achieved over the resultant page.

The `page()` method is overloaded with a more complex variant that allows control over the `<DOCTYPE>` tag and XML prolog. The method `page(boolean includeXmlProlog, boolean allowOptionalEndTags, boolean system, String fpi, String url)` creates an HTML page where with the following parameters

|Parameter           |Description|
|--------------------|-----------|
|includeXmlProlog    | True if the xml prolog should be included with the <DOCTYPE> tag |
|allowOptionalEndTags| True if the page allows empty elements to finish without an end tag. **NOTE** End tags are required for XHTML pages. Html5Builder disallows optional end tags by default |
|system              | True if the document is a system i.e. private document |
|fpi                 | The formal public identifier of this document |
|url                 | The URL of the XML DTD for this page |

The following code shows creating an HTML page with a custom `<DOCTYPE>` tag including the XML prolog
```java
Html5Builder hb = new Html5Builder();

hb.page(true, // includeXmlProlog
		true, // allowOptionalEndTags
		true, // system
		"-//K2//K2 Sample document v1.0//EN", // Formal Public Identifier
		"http://k2.com/sample/sampleDoc.dtd") // URL of document DTD
.toHtml(new PrintWriter(System.out)).flush();
```
And produces the following output
```html
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html SYSTEM "-//K2//K2 Sample document v1.0//EN" "http://k2.com/sample/sampleDoc.dtd">
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
	</head>
	<body/>
</html>
```
### Controlling the page layout
The layout of an HTML document is an indented hierarchy of XML elements. This structure limits the possibilities for changing the layout of an HTML page.  However it is possible to control the size of the indent and whether or not to include a prolog with the page.

An Html5Builder instance allows the definition of the indent string which is repeated for each level of indent in the resultant document through the method `setIndent(String)` and whether or not to include the document prolog through the method `includeProlog(Boolean)`. Both of these methods return the Html5builder instance for method chaining.

The following code shows these methods in action:
```java
Html5Builder hb = new Html5Builder().includeProlog(false).setIndent("  ");

hb.page().toHtml(new PrintWriter(System.out)).flush();
```
Which produces the following output.
```html
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body/>
</html>
```
**Note** The reduced indent and the lack of `<DOCTYPE>` tag.

### Setting the user agent information
HTML pages are served to a specific user agent. The user agent details the type of device displaying the page to the end user. It can be useful to know the details of the user agent when generating dynamic HTML pages and snippets. The user agent information can be given to the Html5Builder instance using the `setUserAgentInfo(...)` method of the Html5Builder instance. This method returns the Html5Builder instance for method chaining

This code sets the user agent as Chrome version 32 or higher.
```java
UserAgentInfo uaInfo = new UserAgentInfo(UserAgentType.CHROME, 32);

Html5Builder hb = new Html5Builder().setUAgentInfo(uaInfo);
```

### Seting the Html5Builders warning logger

Some combinations of options are not checked at compile time. To prevent the resultant code from throwing errors for invalid combinations of tags and attributes when the Html5Builder instance encounters such issues it typically skips the offending attribute to preserve compliance with the Html 5 standard and includes a warning in the system log. 

By default the Html5Builder warning messages are sent to an anonymous logger. Typically this will log to standard output.

It is possible to customise the Html5Builders warning log throught the creation of a custom Logger instance and passing it to the Html5builder instance through the `setWarngingLog(Logger)` method.

The example below shows setting a custom warning logger.
```java
Logger htmlWarningLog = Logger.getLogger("Html5Builder warning log");

Html5Builder hb = new Html5Builder().setWarngingLog(htmlWarningLog);
```
The `setWarningLog(Logger)` method returns the Html5Builder instance for method chaining.


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

#### Working with attributes
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

**NOTE** All the attribute methods return the current element for method chaining

In addition to the global attributes that are available on all HTML elements most elements include the event handling attributes. See [W3C - Event Attributes](https://www.w3schools.com/tags/ref_eventattributes.asp). The event attributes are also implemented using `set<Attribute-Name>(...)` methods.

An element may define attributes that are specific to that particular element. Such element specific attributes are available on the element in question using the `set<Attribute-Name>(...)` methods.

**NOTE** The underlying XMLBuilder methods are also available and any attribute can be set on any element using the XMLBuilder `attribute(...)` methods.

**NOTE** Where an attribute is defined as having one of a set of known values these are implements as enumerations rather than the default `set<Attribute-Name>(String value)` method signature.

**NOTE** Where appropriate attributes some are set using an `Integer` or `Boolean` value rather than a `String` value and in some cases attributes can be set to either one of a list of specified values or an open string value. In these cases the `set<Atribute-Name>(...)` methods are overloaded to allow the full range of values defined by the HTML 5 standard.

#### Working with elements

Adding a new child element to an existing element is achieved through the `<tag>()` methods available on the existing element where `<tag>` is the tag of the element to be added as a child element. The `<tag>()` methods are only available on elements that allow that tag as a child element and return the newly created child element.

Since each node on an HTML hierarchy generated by the Html5Builder is implemented as a specific class the `up()` method of the XMLBuilder is not sufficient to return control to the parent element and allow method chaining to set attributes specific to the parent element or add child elements specific to the parent element. For this reason the `up()` method has been extended with the `up(Class cls)` method where the class `cls` identifies the class of the parent element. If no further method chaining is required from the parent element beyond going `up(...)` another level the XMLBuilder method `up()` can be used omitting the class of the parent element.

#### Html heading elements

HTML defines 6 heading elements `<h1>` to `<h6>`. When HTML is being generated in snippets it is not known at design time how deep in a document a snippet will be placed and therefore what heading level to ascribe to heading elements within an HTML snippet. For this reason Html5Builder defines a generic heading element. `<h>` This element is not part of the HTML 5 standard. However when a `<h>` element is included in a document the concrete level of the HTML heading tag is derived from the location of the `<h>` tag within the final page.

When the `<h>` tag is rendered with the `toHtml(...)` methods the concrete tag of hte `<h>` element is calculated by examining the parents of the `<h>` tag and looking for the nearest HTML heading tag `<h1>` to `<h6>` that is the previous sibling of one of the `<h>` tags parents. It then extracts the level of the nearest HTML heading tag and increments it by one up to a maximum of 6 and applies this level to the `<h>` tag. If not prior HTML heading tags are identifed then the `<h>` tag is rendered as an `<h1>` element.

The following code:
```java
Html5Builder hb = new Html5Builder().setIndent("  ");
hb.page()
	.body
		.section()
			.h().text("This is the top level header").up(HtmlSection.class)
			.div()
				.p().text("This is a paragraph in the highest level").up(HtmlDiv.class)
				.p().text("This is another paragraph in the highest level").up(HtmlDiv.class)
				.section()
					.h().text("This is a header below the top level").up(HtmlSection.class)
					.div()
						.p().text("Yet more paragraphs").up(HtmlDiv.class)
						.section()
							.h().text("This is a low level header").up(HtmlSection.class)
							.div()
								.p().text("This is a parapgraph a the lowest level").up(HtmlDiv.class) 
								.up(HtmlSection.class)
							.up(HtmlDiv.class)
						.up(HtmlSection.class)
					.up(HtmlDiv.class)
				.section()
					.h().text("This is a another header below the top level").up(HtmlSection.class)
					.div()
						.p().text("Yet another paragraph").up(HtmlDiv.class)
						.section()
							.h().text("This is another lowest level header").up(HtmlSection.class)
							.div()
								.p().text("This is another paragraph at the lowest level").up(HtmlDiv.class) 
								.page()
	.toHtml(new PrintWriter(System.out)).flush();;
```
Produces this HTML
```html
<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body>
    <section>
      <h1>This is the top level header</h1>
      <div>
        <p>This is a paragraph in the highest level</p>
        <p>This is another paragraph in the highest level</p>
        <section>
          <h2>This is a header below the top level</h2>
          <div>
            <p>Yet more paragraphs</p>
            <section>
              <h3>This is a low level header</h3>
              <div>
                <p>This is a parapgraph a the lowest level</p>
              </div>
            </section>
          </div>
        </section>
        <section>
          <h2>This is a another header below the top level</h2>
          <div>
            <p>Yet another paragraph</p>
            <section>
              <h3>This is another lowest level header</h3>
              <div>
                <p>This is another paragraph at the lowest level</p>
              </div>
            </section>
          </div>
        </section>
      </div>
    </section>
  </body>
</html>
```
**NOTE** The automatic conversion of the `<h>` element into `<h1>` to `<h3>` elements

**NOTE** The inclusion of a `<div>` element as the next sibling of the `<h>` elements to allow child `<h>` elements to find their nearest heading as the previous sibling.

#### Example

Below is an example of an HTML page generated by the Html5Builder

This code:
```java
Html5Builder hb = new Html5Builder().setIndent("  ").setWarngingLog(Logger.getLogger("Html Builder Warning"));

hb.page()
	.head
		.title("Sample page generatd by Html5Builder")
		.author("Simon Emmott")
		.description("This page is a sample page generated by the Html5builder")
		.keywords("Html5Builder", "Example")
		.up(HtmlPage.class)
	.body
		.section()
			.h().text("Html5Builder sample page").up(HtmlSection.class)
			.div()
				.p().text("The example shows a very simple page generated using the Html5Builder").up(HtmlDiv.class)
				.p()
					.text("For more details on the Html5Builder please see the Github project ")
					.a().setHref("https://github.com/simonemmott/Html5Builder").text("Html5Builder").up(HtmlP.class)
					.text(" or the Html5Builders ")
					.a().setHref("https://simonemmott.github.io/Html5Builder/javadoc/").text("javadoc").page()
.toHtml(new File("docs/sample.html"));
```
Produces this HTML as a file which can be viewed at [sample](https://simonemmott.github.io/Html5Builder/sample.html)
```html
<!DOCTYPE html>
<html>
  <head>
    <title>Sample page generatd by Html5Builder</title>
    <meta name="author" content="Simon Emmott">
    <meta name="description" content="This page is a sample page generated by the Html5builder">
    <meta name="keywords" content="Html5Builder, Example">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body>
    <section>
      <h1>Html5Builder sample page</h1>
      <div>
        <p>The example shows a very simple page generated using the Html5Builder</p>
        <p>
          For more details on the Html5Builder please see the Github project 
          <a href="https://github.com/simonemmott/Html5Builder">Html5Builder</a>
           or the Html5Builders 
          <a href="https://simonemmott.github.io/Html5Builder/">javadoc</a>
        </p>
      </div>
    </section>
  </body>
</html>
```











