var element;

console.log(typeof element); // undefined

console.log((element = document), typeof element); // #document object

console.log((element = document.all), typeof element); //return the collection of all elements with the index value

/*
HTMLAllCollection(12) [html, head, meta, meta, meta, title, body, div#header, h1, div.nav, h1, script, viewport: meta, header: div#header]
0: html
1: head
2: meta
3: meta
4: meta
5: title
6: body
7: div#header
8: h1
9: div.nav
10: h1
11: script
12: script
header: div#header
viewport: meta
*/
console.log((element = document.all[7]), typeof element); // div#headeraccessKey: ""align: ""ariaAtomic: nullariaAutoComplete: nullariaBusy: nullariaChecked: nullariaColCount: nullariaColIndex: nullariaColSpan: nullariaCurrent: nullariaDescription: nullariaDisabled: nullariaExpanded: nullariaHasPopup: nullariaHidden: nullariaInvalid: nullariaKeyShortcuts: nullariaLabel: nullariaLevel: nullariaLive: nullariaModal: nullariaMultiLine: nullariaMultiSelectable: nullariaOrientation: nullariaPlaceholder: nullariaPosInSet: nullariaPressed: nullariaReadOnly: nullariaRelevant: nullariaRequired: nullariaRoleDescription: nullariaRowCount: nullariaRowIndex: nullariaRowSpan: nullariaSelected: nullariaSetSize: nullariaSort: nullariaValueMax: nullariaValueMin: nullariaValueNow: nullariaValueText: nullassignedSlot: nullattributeStyleMap: StylePropertyMap {size: 0}attributes: NamedNodeMap {0: id, id: id, length: 1}autocapitalize: ""autofocus: falsebaseURI: "http://127.0.0.1:5500/index.html"childElementCount: 2childNodes: NodeList(5) [text, h1, text, div.nav, text]children: HTMLCollection(2) [h1, div.nav]classList: DOMTokenList [value: '']className: ""clientHeight: 95clientLeft: 0clientTop: 0clientWidth: 322contentEditable: "inherit"dataset: DOMStringMap {}dir: ""draggable: falseelementTiming: ""enterKeyHint: ""firstChild: textfirstElementChild: h1hidden: falseid: "header"inert: falseinnerHTML: "\n           <h1>Title</h1>\n           <div class=\"nav\">\n               <h1>WorkForce</h1>\n           </div>\n       "innerText: "Title\nWorkForce"inputMode: ""isConnected: trueisContentEditable: falselang: ""lastChild: textlastElementChild: div.navlocalName: "div"namespaceURI: "http://www.w3.org/1999/xhtml"nextElementSibling: scriptnextSibling: textnodeName: "DIV"nodeType: 1nodeValue: nullnonce: ""offsetHeight: 95offsetLeft: 8offsetParent: bodyoffsetTop: 21offsetWidth: 322onabort: nullonanimationend: nullonanimationiteration: nullonanimationstart: nullonauxclick: nullonbeforecopy: nullonbeforecut: nullonbeforematch: nullonbeforepaste: nullonbeforexrselect: nullonblur: nulloncancel: nulloncanplay: nulloncanplaythrough: nullonchange: nullonclick: nullonclose: nulloncontextlost: nulloncontextmenu: nulloncontextrestored: nulloncopy: nulloncuechange: nulloncut: nullondblclick: nullondrag: nullondragend: nullondragenter: nullondragleave: nullondragover: nullondragstart: nullondrop: nullondurationchange: nullonemptied: nullonended: nullonerror: nullonfocus: nullonformdata: nullonfullscreenchange: nullonfullscreenerror: nullongotpointercapture: nulloninput: nulloninvalid: nullonkeydown: nullonkeypress: nullonkeyup: nullonload: nullonloadeddata: nullonloadedmetadata: nullonloadstart: nullonlostpointercapture: nullonmousedown: nullonmouseenter: nullonmouseleave: nullonmousemove: nullonmouseout: nullonmouseover: nullonmouseup: nullonmousewheel: nullonpaste: nullonpause: nullonplay: nullonplaying: nullonpointercancel: nullonpointerdown: nullonpointerenter: nullonpointerleave: nullonpointermove: nullonpointerout: nullonpointerover: nullonpointerrawupdate: nullonpointerup: nullonprogress: nullonratechange: nullonreset: nullonresize: nullonscroll: nullonsearch: nullonsecuritypolicyviolation: nullonseeked: nullonseeking: nullonselect: nullonselectionchange: nullonselectstart: nullonslotchange: nullonstalled: nullonsubmit: nullonsuspend: nullontimeupdate: nullontoggle: nullontouchcancel: nullontouchend: nullontouchmove: nullontouchstart: nullontransitioncancel: nullontransitionend: nullontransitionrun: nullontransitionstart: nullonvolumechange: nullonwaiting: nullonwebkitanimationend: nullonwebkitanimationiteration: nullonwebkitanimationstart: nullonwebkitfullscreenchange: nullonwebkitfullscreenerror: nullonwebkittransitionend: nullonwheel: nullouterHTML: "<div id=\"header\">\n           <h1>Title</h1>\n           <div class=\"nav\">\n               <h1>WorkForce</h1>\n           </div>\n       </div>"outerText: "Title\nWorkForce"ownerDocument: documentparentElement: bodyparentNode: bodypart: DOMTokenList [value: '']prefix: nullpreviousElementSibling: nullpreviousSibling: textscrollHeight: 95scrollLeft: 0scrollTop: 0scrollWidth: 322shadowRoot: nullslot: ""spellcheck: truestyle: CSSStyleDeclaration {accentColor: '', additiveSymbols: '', alignContent: '', alignItems: '', alignSelf: '', …}tabIndex: -1tagName: "DIV"textContent: "\n           Title\n           \n               WorkForce\n           \n       "title: ""translate: truevirtualKeyboardPolicy: ""[[Prototype]]: HTMLDivElement 'object'

document.write(document.all[7]); // [object HTMLDivElement]

document.write(document.title); // JS tutorials

console.log(document.title); // JS tutorials

document.write(document.body); //[object HTMLBodyElement]

console.log(document.body); // body html

document.write(document.head); // [object HTMLHeadElement]

console.log(document.head); //head html

console.log(document.links); // Will display all th elinks in colelction form withindex for each link // HTMLCollection []length: 0[[Prototype]]: HTMLCollection

//to target link as per the index
var index;
console.log(document.links[index]);

document.forms;
document.images;
document.doctype;
document.URL; // URL OF THE Document
document.domain; // returns the domain
document.baseURI; // returns the RETURNS the entire link

document.getElementById("header"); // returns the collection of all the  elements with id specified //
document.getElementsByClassName("nav"); // returns the collection of all the elements with the class specified //
console.log(document.getElementsByTagName("div")); // returns the collection of all the div elements //
/*
HTMLCollection(2) [div#header, div.nav, header: div#header]
0: div#header
1: div.nav
header: div#header
length: 2
[[Prototype]]: HTMLCollection
*/

//to choose specific tag as per the index
console.log(document.getElementsByTagName("div")[1]);

// ============  What we can get from the DOM?
/*
HTML
innerHTML

Text
innerText

Attributes
getAttribute()
getAttributeNode
Attributes
*/

//to view properties of document
/*
for(var key in document){
    document.write(key +"  "+ document[key]+ "</br></br>")
}
*/

element = document.getElementById("header").innerHTML;
console.log(element);
/*
           <h1>WorkForce</h1>
           <div class="nav">
               <ul class="menu-options">
                   <li><a href="">Home</a></li>
                   <li><a href="">About</a></li>
                   <li><a href="">Career</a></li>
                   <li><a href="">Contact us</a></li>
                   <li><a href="">Login</a></li>
               </ul>
           </div>
*/
element = document.getElementById("header").innerText;
console.log(element);
/*
WorkForce
Home
About
Career
Contact us
Login
*/
element = document.getElementById("header").getAttribute("class"); //menu
console.log(element);

element = document.getElementById("header").getAttribute("style"); //outline: none;
console.log(element);

element = document.getElementById("header").getAttribute("onClick"); //func()
console.log(element);

element = document.getElementById("header").getAttributeNode("onClick"); //onClick ="func()"
console.log(element);

element = document.getElementById("header").getAttributeNode("onClick").value; //func()
console.log(element);

//Attributes will returnt he mapped collection of all the attributes on that element with id "header"
element = document.getElementById("header").attributes;
console.log(element);
/*
NamedNodeMap {0: id, 1: class, 2: style, 3: onclick, id: id, class: class, style: style, onclick: onclick, length: 4}
0: id
1: class
2: style
3: onclick
class: class
id: id
onclick: onclick
style: style
length: 4
[[Prototype]]: NamedNodeMap
*/

element = document.getElementById("header").attributes[1];
console.log(element); //class ="menu"

element = document.getElementById("header").attributes[1].value;
console.log(element); //menu

element = document.getElementById("header").attributes[1].name;
console.log(element); //class

// Set Methods
/*
innerHTML
innerText
seAttribute
Attribute
removeAttribute
*/

document.getElementById("title").innerText = "New Title"; // this will changed to to the normal text

document.getElementById("title").innerText = "<h1>New Title</h1>"; // <h1>New Title</h1>

document.getElementById("title").innerHTML = "<h1>New Title</h1>"; // with this we will have title under h1 tag

//========================== SET Attributes name and values ============

// ==========  setAttribute("name","values")

document.getElementById("header").setAttribute("style", "border:1px solid red");

//document.getElementById("header").setAttribute("style","visibility:hidden")

// ==========  Attributes

//return the colection of all the attributes for the element OR ID or Class etc. as specified in previous tag

console.log(document.getElementById("header").attributes);

/*
NamedNodeMap
0: id
1: class
2: style
3: onclick
class: class
id: id
onclick: onclick
style: style
length: 4
[[Prototype]]: NamedNodeMap
*/

// ==========  Attributes[index]

document.getElementById("header").attributes[2].value = "color:pink";

// ============== QuerySelector and QuerySelectorall ====================

// ============= querySelector("cssSelector")

//querySelector("CSS Selector") -- will select the very first element matching the selector specified
//querySelectorAll("CSS Selector") -- will select the all the elements matching the selector specified

// querySelector target the first in the sequence css selector

console.log(document.querySelector(".list"));
/*
<ul class="list">
<li>a</li>
<li>v</li>
<li>c</li>
 <li>d</li>
<li>e</li>
</ul>
*/

console.log(document.querySelector(".list").attributes);

/*
NamedNodeMap {0: class, 1: style, class: class, style: style, length: 2}
0: class
1: style
class: class
style: style
length: 2
[[Prototype]]: NamedNodeMap
*/

document.querySelector(".list").attributes[1].value =
  "border: 2px dotted black";

document
  .querySelector(".list")
  .setAttribute("style", "border: 10px dotted tomato");

//Variation 2 : select element from particlar class
console.log(document.querySelector(".col-md-6 li"));
{
  /* <li>tagging</li> */
}

// ============= querySelectorAll("cssSelector")

console.log(document.querySelectorAll(".list"));
/*
NodeList(3) [ul.list, p.list, div.list]
0: ul.list
1: p.list
2: div.list
length: 3
[[Prototype]]: NodeList
*/
// ==============  CSS styling Methods ====================

/*
style
className
classList
*/

// =================== style

console.log(document.querySelector(".list").style.border); // 10px dotted tomato // gives active property on the class list

// all CSS properties joined with "-" e.g background-color must be writtewn in camel case in JS styling

document.querySelector(".list").style.backgroundColor = "pink";

// =================== className

//className - will update the class to the given values, we can set one or multiuple class values with this className method

//Before changing the class names
element = document.querySelector(".col-md-6 ul ").className;
console.log(element); // list

document.querySelector(".list").className = "abc xyz";
//after changing class names
element = document.querySelector(".col-md-6 ul").className;
console.log(element); // abc xyz

//Since we add abc and xyz class to the <ul> wich earlier has list class not only classes are applied with the className
console.log(document.querySelectorAll(".list"));
/*
NodeList(2) [p.list, div.list]
0: p.list
1: div.list
length: 2
[[Prototype]]: NodeList
*/

// =================== classList

/*
diff is
className returns the all classes in a string format
wherein 
classList return all the classes in array format with the peroper
index for each class
*/

element = document.querySelector(".abc").className;
console.log(element); // abc xyz

element = document.querySelector(".abc").classList;
console.log(element);
/*
DOMTokenList(2) ['abc', 'xyz', value: 'abc xyz']
0: "abc"
1: "xyz"
length: 2
value: "abc xyz"
[[Prototype]]: DOMTokenList
*/

//classList has it's own method too!
//add
//remove

//===================== addEvenListner()

//ADDING EVENT USING DOM

// document.getElementById("header").onclick = func;

function func() {
  // document.getElementById("header").innerHTML= "<h1>Welcome to JS!</h1>"
  // document.getElementById("header").style.color= "white"
  // document.getElementById("header").style.backgroundColor= "black"
}

//SYNTAX
//addEventListener("event_name",functionName)
// OR
//addEventListener("event_name",function(){statements});
// OR
//addEventListener("event_name",functionName,useCapture)
//useCapture - has two values true or false
// this is bydefault false
// used when two element are nested and both of them have the same event

//USE :

document.getElementById("header").addEventListener("click", abc);

function abc() {
  document.getElementById("header").style.backgroundColor = "white";
  this.innerHTML = "<h1>NEW HEADING!!</h1>";
}
//here this refers to the object thru which the even listner is called i.e. ID header here

document.getElementById("header").addEventListener("mouseenter", function () {
  this.style.transition = "1s";
  document.getElementById("header").style.border = "10px solid blue";
});

document.getElementById("header").addEventListener("mmouseout", function () {
  this.style.transition = "1s";
  this.style.border = "none";
});

// ==================== same function use twice -> No Issues

document.getElementById("header").addEventListener("click", function () {
  document.querySelector("ul").style.display = "none";
});

// ================= removeEventListner("event",functionName)

// used to remove any existing event on the element

document.querySelector(".footer").addEventListener("click", backcolor);

function backcolor() {
  document.querySelector(".footer").style.backgroundColor = "purple";
  document.querySelector(".footer").style.height = "100px";
}

//Invalid function below pls ignore
// document.body.addEventListener("click",function(){
//     document.querySelector(".footer").style.height = "10vh"
// })
 
// ==================== classList methods 
// add("classname1","classname2",..."classnamesn")

// add(class,class,class....)
// remove(class,class,class....)
// toggle(class)
// contains(class)
// item(index)
// Length 


// add()
// remove()
// toggle()
// contains()
// item(index)
// Length 