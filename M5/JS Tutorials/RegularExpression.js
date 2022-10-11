/*
Topics

Basic functions 
Metacharacters Symbols
Character symbols

*/

console.log('Regular Expression Demo')

var regex = /name/

console.log(regex) // /name/
console.log(regex.source) //name
console.log(typeof regex)//object

// ============= flags
regex = /name/g;//global scope
regex = /name/i;// made case insensitive


// Functions to match the expression

//=========== exec(string)
//-- returns array for match and null for not match

let s = 'The name of that student was taken for some taks'

let result = regex.exec(s)

console.log(result)
/*
['name', index: 4, input: 'The name of that student was taken for some taks', groups: undefined]
0
: 
"name"
groups
: 
undefined
index
: 
4
input
: 
"The name of that student was taken for some taks"
length
: 
1
[[Prototype]]
: 
Array(0)
*/
s = 'The name of that student was taken for some taks and name of other studnet was also taken'

regex = /name/g; //here global flag is used!

let res1 = regex.exec(s);
console.log(res1);
/*
['name', index: 4, input: 'The name of that student was taken for some taks and name of other studnet was also taken', groups: undefined]
0
: 
"name"
groups
: 
undefined
index
: 
4
input
: 
"The name of that student was taken for some taks and name of other studnet was also taken"
length
: 
1
[[Prototype]]
: 
Array(0)
*/
let res2 = regex.exec(s);
console.log(res2);
/*
['name', index: 53, input: 'The name of that student was taken for some taks and name of other studnet was also taken', groups: undefined]
0
: 
"name"
groups
: 
undefined
index
: 
53
input
: 
"The name of that student was taken for some taks and name of other studnet was also taken"
length
: 
1
[[Prototype]]
: 
Array(0)
*/
let res3 = regex.exec(s);
console.log(res3);

//null - as there is no matching string as regex hence returned null third time!

//============ test(string)
//-- return true or false based on search

var regex4 = /cup/g;

var str = "India won first world cup in 1983!"
console.log(regex4.test(str))//true

str = "some random string here..."
console.log(regex4.test(str))//false

// ================= match()
// -- returns array of result or null!
// difference from exec() function is that match() takes regex as a param and return array of all matching values when searched with a global flag!


regex = /very/;
str = "mumbai is very beautiful city and mumbai is pleasant city too"
// var res = regex.match(str); -- Wrong way
var res = str.match(regex);
console.log(res)
/*
['very', index: 10, input: 'mumbai is very beautiful city and mumbai is pleasant city too', groups: undefined]
0 : "very"
groups : undefined
index : 10
input : "mumbai is very beautiful city and mumbai is pleasant city too"
length : 1
[[Prototype]] : Array(0)
*/

str = "mumbai is very beautiful city and mumbai is pleasant city too"
regex = /too/g;
var res = str.match(regex);
console.log(res)
/*
['too']
0 : "too"
length : 1
[[Prototype]] : Array(0)
*/

str = "mumbai is very beautiful city and mumbai is pleasant city too"
regex = /mumbai/g;
var res = str.match(regex);
console.log(res)
/*
(2) ['mumbai', 'mumbai']
0 : "mumbai"
1 : "mumbai"
length : 2
[[Prototype]]
:
Array(0)
*/

// ============ str.search(regex)
// -- return index of regex and if not found then return -1

str = "mumbai is very beautiful city and mumbai is pleasant city too"
regex = /city/g;//regex = /city/;
var res = str.search(regex);
console.log(res)//25

// ========= replace()
// -- repalces our regex with some other value
// -- if global flag is not given to regex then the first match will be replaced!!

regex = /mumbai/;
res = str.replace(regex, "MUMBAI");

console.log(res);//MUMBAI is very beautiful city and mumbai is pleasant city too

console.log(str);//mumbai is very beautiful city and mumbai is pleasant city too

regex = /city/g;
res = str.replace(regex, "MUMBAI");

console.log(res);//mumbai is very beautiful MUMBAI and mumbai is pleasant MUMBAI too

console.log(str);//mumbai is very beautiful city and mumbai is pleasant city too

// ============= metacharacters in regex

regex = /^kiran/; //any string starts with kiran
regex = /^kiransasd/; //any string starts with kiransasd
regex = /^k/; //any string starts with k

regex = /[^a-x]iran/;// any string doesnt have a-x before {iran}

regex = /bai$/ // used when to check string ends with 'bai'

regex = /m.mbai/;// matched any one character eg. will match for m[a-z]mbai

regex = /m*bai/; //matches any no of characters

// What if we want actual * in string 
regex = /m\*bai/; // here searching for m*bai


//optinal letters

regex = /ki?ran?/ //here i and n are optional in a regex to be searched

// ========= character sets

regex = /mu[a-z]mbai/;// any character in between a to z
regex = /mu[uo]mbai/; // can be any character from u or o

regex = /mu[^atr]mbai/;//not from a,t or r
//mubmbai, musmbai,muvmbai matching pairs
//muambai, mutmbai, murmbai non matching pairs!

regex = /som[a-pA-P]andom[1-5a-c]string?/;

//Quantifiers:

regex = /kir{2}an/; // here r must come twice to match

regex = /kir{0,2}an/; // here r must come twice or not even single time to match

//Groupings:

regex = /(har){2}([0-9]r){3}/;// here har must come twice and [0-9]r must come thrice!!

