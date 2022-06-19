window.addEventListener("DOMContentLoaded",()=>{
    document.getElementById("DOM").innerText = ("All is fine now..")
})

 var arr = ["Kiran","Rahul","Karan","Rahul","Pandey","Aman"]

 var a =[NaN,null,undefined,"123","Kiran",true,1,0]

// =========== indexOf()
// returns the index of element in the array if not found it returns -1
var res = arr.indexOf("Rahul")
document.write(res)// 1

res = arr.indexOf("Rahul",1)
document.write(res)// 1

res = arr.indexOf("Rahul",2)
document.write(res)// 3

res = a.indexOf(NaN)
document.write("Index of NaN is " + res + "<br>")// Index of NaN is -1

res = a.indexOf(null)
document.write("Index of null is " + res + "<br>")// Index of NaN is 1

res = a.indexOf(undefined)
document.write("Index of undefined is " + res + "<br>")// Index of undefined is 2

res = a.indexOf(true)
document.write("Index of true is " + res + "<br>")// Index of true is 5

// ========== lastIndexOf()
// returns the index of element which is  last in the sequence in case of duplicate element in the array if not found it returns -1
// basically this starts finding the index from the right end if the search index is not specified
// if specified then it will search from right to left from the specified index(inclusive)

res = arr.lastIndexOf("Rahul")
document.write(res)//3

res = arr.lastIndexOf("Karan")
document.write(res)//2

res = arr.lastIndexOf("Karan",4)
document.write(res)// 2

res = arr.lastIndexOf("Karan",1)
document.write(res)// -1 as here Karan is not in the aray in index from 1 to 0


// ===== includes()
// returns true or false if the element found in the array or not

res = arr.includes("Karan")
document.write(res) // true

res = arr.includes("Pranit")
document.write(res) // false

res = a.includes(NaN)
document.write("Index of NaN is " + res + "<br>")// Index of NaN is true

res = a.includes(null)
document.write("Index of null is " + res + "<br>")// Index of null is true

res = a.includes(undefined)
document.write("Index of undefined is " + res + "<br>")// Index of undefined is true

res = a.includes(true)
document.write("Index of true is " + res + "<br>")// Index of true is true


// ======== some(funcName)
// returns true if at least for one value in array the condition is true mentioned in the function
// checks if any element in the array passes the test in the function

var ages = [10,4,25,17,22]

//Normal function
//Method 1
function anyAdult(){
    var age;
    return age>=18;
}
res = ages.some(anyAdult)
document.write("<br>" +res)// false 
// whenever we use any function any array methods we must have one variable as an argument so, that can take up the value of array elements while iteration

// here var "value" will get the every value of ages array, when used with some()! Iterration in an array is not required!

//Method 2
function anyAdultNew(value){
    return value>=18;
}

res = ages.some(anyAdultNew)
document.write("<br>" + res)// true

//NOTE : here method 2 of sriting function is valid i.e. we must one variable asn func argument

// arrow function for the same thing
let anyAdultArrow = (age) => (age >= 18);
// let anyAdultArrow = ages => (age >= 18);
// let anyAdultArrow = ages => age >= 18;


//method 1
res = ages.some(anyAdultArrow)
document.write("<br>" + res)// true

//method 2
res = ages.some(ele => ele >= 18)
document.write("<br>" + res)// true


// ======== every(funcName)
// only difference from some() is condition of func must return true for every element of an array

res = arr.every(isKid)

function isKid(age){
    return age<=5
}
 document.write("<br>" + res)// false // because not all people has age less than equals to 5 so every() return false as everyine must be of ages less than equals 5 to return true

// ============= find(FunName)
// find() return the value of the first element in the array which passes the test and it wont check the values next to the element

var ages = [10,4,25,17,22]

res = ages.find(firstAdult)

function firstAdult(value){
    return value>= 18;
}

document.write(res); // 25


// ============ findIndex(FunName)
// returns the index of that element found with find method above

res =ages.findIndex(value => value>=18)
document.write(res) // 2

// ======= filter(funcName)
// filter will create the array of all the elements which passes the test defined inside the function

var ages = [10,4,25,17,22]

res = ages.filter(value => value>=20)

document.write("<br>" + res, typeof res); //25,22 object

//alternate we can write arrow function as

let filterChilds = ele => ele <=10;

res = ages.filter(filterChilds)

document.write("<br>" + res, typeof res); //10,4 object

// ============ forEach()

var  arrr = [1,2,3,43,5,6,7,8,9,0]

arrr.forEach(val => document.write(val + "  "))// 1 2 3 43 5 6 7 8 9 0

// ERROR 
// [1,2,3,43,5,6,7,8,9,0].forEach(val => document.write(val))

arrr.forEach(function(){
    var val;
    document.write(val + " ")
})
//undefined undefined undefined undefined undefined undefined undefined undefined undefined undefined


arrr.forEach(function(){
    var val = 0;
    document.write(val + " ")
})
// 0 0 0 0 0 0 0 0 0 0

/* 
Conclusion : to access the elements of an array we must pass 
first parameter in the function inside forEach loop to access the array elements and second variable to access the index

array.forEach((element,index)=> document.write(index + " " + element))

*/

arrr.forEach((element,index)=> document.write(index + " : " + element + " <br> " ))
/*
0 : 1
1 : 2
2 : 3
3 : 43
4 : 5
5 : 6
6 : 7
7 : 8
8 : 9
9 : 0
*/


arrr.forEach((a,b)=> document.write(b + " : " + a + " <br> " ))
/*
0 : 1
1 : 2
2 : 3
3 : 43
4 : 5
5 : 6
6 : 7
7 : 8
8 : 9
9 : 0
*/