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
document.baseURI; // returns the entire link

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
getAttribute("attributeName") // return the value of attributeName specified
getAttributeNode("attributeName") // returns the key:value pair for the attributeName specified, we can acces by uding ".value"
Attributes // returns the collection of all the attributes of the targeted element, we can access by "attributes[index]"

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

// =============== getAttribute(attributeName)

element = document.getElementById("header").getAttribute("class"); //menu
console.log(element);

element = document.getElementById("header").getAttribute("style"); //outline: none;
console.log(element);

element = document.getElementById("header").getAttribute("onClick"); //func()
console.log(element);

// ============ getAttributeNode("attributeName")

element = document.getElementById("header").getAttributeNode("onClick"); //onClick ="func()"
console.log(element);

// element = document.getElementById("header").getAttributeNode("onClick").value; // func()
// console.log(element);

//Attributes will return the mapped collection of all the attributes on that element with id "header"
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


//We can also change the properties with "style" as below
document.querySelector(".list").style.backgroundColor = "pink";

// =================== className

//className - will update the class to the given values, we can set one or multiuple class values with this className method
//Only problem is that it willremove the old class

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
classList return all the classes in array format with the proper
index for each class
*/

element = document.querySelector(".abc").className;
console.log(element, typeof element); // abc xyz string

element = document.querySelector(".abc").classList;
console.log(element,typeof element); // object
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
//and many more...

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

// ==================== DOM traversal Methods

//parentElement -- will return null if elements has no parent
//parentNode -- will return somehting always even ifelements has no parent
//Children
//childNodes
//firstChild
//lastChild
//firstElementChild
//lastElementChild
//nextElementSibling
//nextSibling
//previousSibling
//previousElementSibling
//nextElementSibling

var a = document.getElementById("inner").parentElement // returns the direct parent
console.log(a)//div#outer

a = document.getElementById("inner").parentNode// returns the direct parent
console.log(a)//div#outer

a = document.getElementById("main").parentElement
console.log(a) // null

a = document.getElementById("main").parentNode
console.log(a)//#document

//============ children and childNodes

document.getElementById("outer").children// returns the collection of direct childs

document.getElementById("outer").childNodes // returns the collection of all direct and nested children of direct childrens this also COUNTS THE ENTER OR SPACE as text node

//IMP NOTE : We can not style the UNDEFINED(Enter or blank space returned by the childNodes)

//We can access those by providing the index of particular child
// children[index]
// childNodes[index]


// Difference between first child and firstElemenChild
/*
As we have seen that chiuldNodes returns all the childincluding the enter and blank spoaces as text
and Children return ONLY direct element childs of particular element

Similarly firstElementChild targets the first element child of the collection which is returned by the Children method

and firtChild targets the first child returned by the childNodes collection
*/
document.getElementById("outer").firstElementChild; // target the h2 element

document.getElementById("outer").firstChild // targets the first child which is text (due to enter and space)

document.getElementById("outer").lastElementChild // targets the last direct child element of the outer element returned by the collection of children

document.getElementById("outer").lastChild// targets the last child returned by the colelction of the childNodes

//Since there is no space in the div with id #C-Child, firstChild would be C and firstElementChidl is null as there is no any element in that div
a = document.getElementById("C-Child").firstChild
console.log(a) //C
a = document.getElementById("C-Child").firstElementChild
console.log(a)//null

// ============= sibling

//nextSibling
//previousSibling
//nextElementSibling
//previousElementSibling

//element methods
//We we specify element it will search for html element to target
// in case if we have the sapce or enter it will ignore the space and enter


//non-element methods
//it will target the those nodes which may or may not be the html elements (text node generated due to space or enetr is noth the html element and it has value UNDEFINED which can no tbe styled)

// ==================== DOM create Methods

//createElement
//createTextNode
//createComment


//We can not direclty creat elemnemnt l;ike this so check oput below process till appendChild

// var a = document.getElementById("section2").createElement("h2");
/*
Uncaught TypeError: document.getElementById(...).createElement is not a function
at myScriptDOM.js:493:37
*/

var Newelement = document.createElement("h2");
console.log(Newelement) // <h2></h2>

var newText = document.createTextNode("This is heading with the JS");
console.log(newText) // <

//==================== DOM Append Methods

// appendChild
// insertBefore

Newelement.appendChild(newText)

document.getElementById("section2").appendChild(Newelement)

// ========== insertBefore
// Since wit the help of appendCHild we can append the childs in the heirachy i.e next in the dom sequence
// If we want to append before any child or elemengt tag then we must go with the insertBefore as below

var Newelement2 = document.createElement("h1")

var newText2 = document.createTextNode("Heading goes here...")

Newelement2.appendChild(newText2)

var target = document.getElementById("section2") 
target.insertBefore(Newelement2,target.children[0])

// ========== 75-80

// ============= Form Events

document.getElementById("Name").addEventListener("focus",funcFocus)

function funcFocus(){
  document.getElementById("Name").style.backgroundColor = "lime"
}

function onFocus(element){
  element.style.backgroundColor = "lime"
}

function BlurrFunc(element){
  element.style.backgroundColor=" "
}

// ============ oninput event

// document.getElementById("pass").addEventListener("input",inputFunc)

function inputFunc(){
  var a = document.getElementById("pass").value;
  // console.log(a)
  // document.getElementById("section2").innerHTML=a;

  // var len = a.length;

  // if(len!=8){
  //   alert("Please enter password of 8 character ")
  // }
}


// ================ onchange event

document.getElementById("pass").addEventListener("change",function() {
  var a = document.getElementById("pass").value;
  // console.log(a)
  // document.getElementById("section2").innerHTML=a;
  var len = a.length;
  if(len<8){
    alert("Please enter password of 8 character ")
  }
})

document.getElementById("Country").addEventListener("change", function(){
  var a = this.value;
  document.getElementById("section2").innerText = a;

})

//Difference between input and change events is that
// - oninput will get active all the time we input something
// - onchange will active only when the focus is lost from particular input element

//============= onselect event
// when user select the text this event is triggered

//NOT APPLICABLE ON OTHER ELEMENT OTHER THAN FORM ELEMENTS
document.getElementById("section4").addEventListener("select",function(){
  var a = this.value;
  console.log("User selected the text")
})

//Applicable only on the form elements
document.getElementById("textAREA").addEventListener("select",function(){
  var a = this.value;
  console.log("User selected the text")
})

//=============== onsubmit event
//When user clicks on submit then this event gets triggered

document.getElementById("farum").addEventListener("submit",function(){
  var x = document.getElementById("Name").value;
  x = x.trim();// use of trim function as the type of every input is string
  console.log(typeof x)
      alert("Welcome onboard Mr. " + x)
})

// ============ invalid event
// applicable only for html 5 features

document.getElementById("email").addEventListener("invalid",function(){
  alert("Please correct dalo yar tum email ID")
  // document.getElementById("msg").innerText = "Enter the correct email ID"
})

// ============ setInterval(funcName,nilliseconds)
// used in JS animations
// 1 seconds = 1000 ms 

// to stop the animation at particular time we use clearInterval(variableName)
// here "variableName" is the varioable which stores the setInterval()

var a = 0;
var inter = setInterval(anim,100) // here function anim is called after eveyr 0.5 seconds

function anim(){
  a = a+10
  var target = document.getElementById("box")
  if(target.style.marginLeft == 500 + "px"){
    // a = 0 ;
    clearInterval(inter)
  }
  else{
    target.style.marginLeft = a + 'px'; 
    console.log(target.style.marginLeft)
  }
}


// =========== setTimeout(functName,milliseconds)
// here after milliseconds the function will be called ONLY once

var timee = setTimeout(anima,5500)

function anima(){
  console.log("Executed Only once")
  var target = document.getElementById("box")
  if(target.style.marginLeft == 500 + 'px')
  {
    target.style.backgroundColor ="pink"
    target.style.border="2px solid black"
  }
}

//alternate wayof writing function without name

/*
setTimeout(function (){
  console.log("Executed Only once")
  var target = document.getElementById("box")
  if(target.style.marginLeft == 500 + 'px')
  {
    target.style.backgroundColor ="pink"
    target.style.border="2px solid black"
  }
},5000)
*/

//clearTimeout()

document.getElementById("box").addEventListener("click", funcClearTimeOut)

function funcClearTimeOut(){
  console.log("Animation stopped")
  clearTimeout(timee);  
}

document.getElementById("btn").addEventListener("click", funcClearTimeOut)

function funcClearTimeOut(){
  console.log("Animation stopped")
  clearTimeout(timee);  
}
// ================ BOM Broswer Object Model
// methods realted tothe broswers
//window.innerHeight
//window.outerHeight

//window.open(URL,target,size(height, width etc.))
//window.close()

