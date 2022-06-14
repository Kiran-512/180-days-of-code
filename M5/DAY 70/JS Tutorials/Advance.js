// =========== template string literals
let user = "Kiran";
let userID = "101";
let str = `Mr.${user}, your userID is "${userID}"`; //Mr.Kiran, your userID is "101"
console.log(str);

// =========== callback function

// A callback function is a function passed into another function as an argument, which is then invoked inside the outer function to complete some kind of routine or action.

function greeting(name) {
  // alert('Hello ' + name);
}

function processUserInput(fucn) {
  // var name = prompt('Please enter your name.');
  setTimeout(()=>{
     fucn(name)
    }, 3000);
}

processUserInput(greeting);

//=========== Arrow function

let welcome = () => console.log("Welcoem to ES6");

/*
Below is the arrow function from above line
() => console.log("Welcome to ES6");
*/

console.log(typeof welcome);

// We use { } is we have multiple statements
welcome = () => {
    console.log("Welcome to ES6")
    console.log("You can start the thrilling journey OF js from here!")
};

let sumArrow = (a,b) => a+b;

console.log(sumArrow(10,20))//30

console.log(typeof sumArrow);//function

// =========== Rest Operator(...)
// similar to the var args in java

function staticSum(a, b) {
  return a + b;
}
//Above function gives sum of ONLY two arguments passed

//NOTE : for the each argument for a function, "Arguments" object is created and with the help for forin loop we can access the argument by their index value

//solution is
//below function can add all the arguments
function sum() {
  var sum = 0;
  for (var i in arguments) {
    sum += arguments[i];
  }
  return sum;
}

var a = sum(10, 20);
console.log(a); // 30

a = sum(10, 20, 30);
console.log(a); // 30

a = sum(10, 20, 30, 40);
console.log(a); //30

//problem is what if any argument is string or other than number, then it concatenate the values instead of adding
function sumError() {
  console.log(arguments);
  var sum = 0;
  for (var i in arguments) {
    sum += arguments[i];
  }
  return sum;
}

var a = sumError("kiran", 10, 20);
console.log(a); // 0kiran1020
/*
see the arrgument Object for the obove parameters passed:
Arguments(3) ['kiran', 10, 20, callee: ƒ, Symbol(Symbol.iterator): ƒ]
0: "kiran"
1: 10
2: 20
callee: ƒ sumError()
length: 3
Symbol(Symbol.iterator): ƒ values()
[[Prototype]]: Object
*/

a = sumError("kiran", 10, 20, 30);
console.log(a); // 0kiran102030
/*
see the arrgument Object for the obove parameters passed:
Arguments(4) ['kiran', 10, 20, 30, callee: ƒ, Symbol(Symbol.iterator): ƒ]
0: "kiran"
1: 10
2: 20
3: 30
callee: ƒ sumError()
length: 4
Symbol(Symbol.iterator): ƒ values()
[[Prototype]]: Object
*/

a = sumError("kiran", 10, 20, 30, 40);
console.log(a); //0kiran10203040
/*
see the arrgument Object for the obove parameters passed:
Arguments(5) ['kiran', 10, 20, 30, 40, callee: ƒ, Symbol(Symbol.iterator): ƒ]
0: "kiran"
1: 10
2: 20
3: 30
4: 40
callee: ƒ sumError()
length: 5
Symbol(Symbol.iterator): ƒ values()
[[Prototype]]: Object
*/

//solution Rest Operator(...) // in function argument

function sumWithSpread(name, ...args) {
  var sum = 0;
  for (var i in args) {
    sum += args[i];
  }
  return name + " has Rs." + sum + " with him";
}

a = sumWithSpread("Kiran", 10, 20);
console.log(a); // Kiran has Rs.30 with him

a = sumWithSpread("Kiran", 10, 20, 30);
console.log(a); // Kiran has Rs.60 with him

a = sumWithSpread("Kiran", 10, 20, 30, 40);
console.log(a); //Kiran has Rs.100 with him

// ERROR :
// function sumWithSpread(...args,name){}
//A rest parameter must be last in a parameter list.ts(1014)

// =========== spread operator
// Issue with the ret oiperator is when we pass an array as parameter

function mulFunc(...args){
    console.log(args)
    var mul = 1;
    for (const key in args) {
        mul*=args[key]
    }
    return mul;
}

var a = [10,20,30,40]

console.log(mulFunc(a)); // NaN
/*
See the arrgument Object for the obove parameters passed:
In this case entire array is treaded as a unit at index one and hence we got NaN as output

[Array(4)]
0: (4) [10, 20, 30, 40]
length: 1
[[Prototype]]: Array(0)
*/

//here spread operator comes into the picture

console.log(mulFunc(...a)); //240000
/*
See the arrgument Object for the obove parameters passed:

Now with spread Operator each of the element of array is placed at different index

(4) [10, 20, 30, 40]
0: 10
1: 20
2: 30
3: 40
length: 4
[[Prototype]]: Array(0)
*/

// =============== destructruging arrays 

var a =["Kiran",26,"Kalamboli"]

let [name,age,locationn] = a ;

console.log(name) // Kiran
console.log(age) // 26
console.log(locationn) // Kalamboli

let [sname, ...args] = a;

console.log(sname) // Kiran
console.log(args, typeof args) //'object'
/*
(2) [26, 'Kalamboli']0: 261: "Kalamboli"length: 2[[Prototype]]: Array(0)
)
*/

// ======== function with the arguments and parameter as an array 

function studentDetails([name,age=22,city]){
console.log(name) // Kiran
console.log(age) // 26
console.log(locationn) // Kalamboli
}

studentDetails(["Kiran",26,"Kalamboli"])
/*
Kiran
26
Kalamboli
*/

studentDetails(["Kiran","Kalamboli"])
/*
Kiran
Kalamboli
Kalamboli
*/

studentDetails(["Kiran",,"Kalamboli"])
/*
Kiran
22
Kalamboli
*/

// ======= function with returning array

function studentDetail(name,age=20,city){

  return[name,age,city]
}

var stu = studentDetail("kiran",26,"kalamboli")

console.log(stu)

/*
(3) ['kiran', 26, 'kalamboli']
0: "kiran"
1: 26
2: "kalamboli"
length: 3
[[Prototype]]: Array(0)
*/

let [sfname,sage,scity] =studentDetail("kiran",26,"kalamboli")

console.log(sfname)//kiran
console.log(sage)//26
console.log(scity)//kalamboli

// ======= object destructring

let User ={
  u_name :"Kiran",
  u_age:26,
  u_city:"pune"
}

var {u_name,u_age,u_city} = User;

console.log(u_name) // kiran
console.log(u_age) // 26
console.log(u_city) // pune

//if we dont want any inbetween roperty

// var {u_name,,u_city} = User; // ERROR with object destructuring but this is possible with the array destructuring

var {u_name,u_city} = User;
console.log(u_name) // kiran
console.log(u_city) // pune

//alias to the proiperties of an object

var {u_name : fname ,u_city: shehar} = User;

console.log(fname) //kiran
console.log(shehar)//pune

// ================  object literals

var Name = "Kiran";
var Age = 26;
var Lname ="Pandey"
let n = "stream"
let s = "subject"

var studentt = {
  Name,
  Age,
  locationnn : "kalamboli",
  [n] : "commerce",
  [s+"1"]:"Finance",
  [s+"2"]:"SI & CI",
  marks :function(){
    return 90;
  },
  fullName(){
    return this.Name + " "+this.Lname
  }
}

// We can write function directly instead of funtion keyword
//if we defined variable outside and want to use the same then we don't have to write it in "key:value" pair we can write it driectly

console.log(studentt)

/*
{Name: 'Kiran', Age: 26, locationnn: 'kalamboli', stream: 'commerce', subject1: 'Finance', …}
Age: 26
Name: "Kiran"
fullName: ƒ fullName()
locationnn: "kalamboli"
marks: ƒ ()
stream: "commerce"
subject1: "Finance"
subject2: "SI & CI"
[[Prototype]]: Object
*/

// =========== function returns object in ES6 version

var fname  = "kiran"
var lname ="yadav"
var course ="B.tech"

function Student(fname,lname,course){
  let fullName = fname+" "+lname;
  return{fullName,course};// important is return type
}

console.log(Student(fname,lname,course))
/*
{fullName: 'kiran yadav', course: 'B.tech'}
course: "B.tech"
fullName: "kiran yadav"
[[Prototype]]: Object
*/

var res =  Student(fname,lname,course)

console.log(res.fullName)//kiran yadav
console.log(res.course)//B.tech

console.log(res.fname)//undefined


// ============= class and Objects

//logical entity which cointains the state and behavious for its objects

class student{
  sid;
  sname;
  //even though we define the variable or not it doesn't matters at all
  constructor(sid,sname,sgrade){
    this.sid =sid;
    this.sname =sname;
    this.sgrade=sgrade;
  }
  display(){
    // console.log(this.sid+" "+this.sname+" "+this.sgrade)
  return (this.sid+" "+this.sname+" "+this.sgrade)
  }
  
}
let s1 = new student(101,"Kiran",90)
// s1.display(); // 101 Kiran 90
console.log(s1.display(), typeof s1.display()) //101 Kiran 90 string


class Test{
  a=100;
  static b=10;

  m1(){
    console.log("Its a non-static method")
  }
  
  static m2(){
    console.log("Its a static method")
  }
}


//static mwthods we can directly access
console.log(Test.a) // undefined
console.log(Test.b) // 10

// Test.m1() // Test.m1 is not a function

Test.m2() // Its a static method

let t1 = new Test()
console.log(t1.a)// 100
console.log(t1.b)// undefined

t1.m1()// Its a non-static method
// t1.m2()// Uncaught TypeError: t1.m2 is not a function

// prototype in JS
//prototype is an object in js WHICH IS ASSOCIATED WITH THE EVRY OBJECT AND FUNCTION BYDFAULT
class employee{

  constructor(eid,ename){
    this.eid =eid;
    this.ename =ename;
  }

}

//If we didn't defined the prototype then  each time we will get undefined value for each new object we create for this property// so its like a default value assinign to the new property created outisde of the class

employee.prototype.salary = 10000

//We can also add function as prototype

employee.prototype.display=function() {
  return "salary is  " + this.salary;
}

let e1 = new employee(101,"Kiran")
console.log(e1.eid)//101
console.log(e1.ename)//Kiran
console.log(e1.salary)//10000
e1.salary = 100000;
console.log(e1.salary)//100000
console.log(e1.display()) // salary is 100000

e2 = new employee()
console.log(e2.eid) //undefined
console.log(e2.ename)//undefined
console.log(e2.salary)//10000

// ======== modules in JS


// ======== Promise in JS
// PROMISE is object which used when we promise something and what action to take, if promise succeed and what action to take, if promise failed.

let condition = true;
let prom = new Promise(function(resolve,reject){

  if(condition){
    resolve("You are successFull")
  }
  else{
    reject("Ohh ho! try again letter")
  }
})

/*
Here 
- we created promise method
- then we passed once function with two arguments 
- those two arguments are the outcomes of the promise
- based on some condition inside the promise, one of the function from those two function will be called
- if condition is true,then resolve will be called
and and interanally call back function .then(onFulfillment) will be called
here, onFulfillment(msg) is a function which accept one argument, which is logged on console and for the
argument we pass parameter in resolve() in promise 
- in the same way if condition is false, then in the  
same way thing will be executed with reject() and then internbally .catch(onRejection) will be called
here, onRejection(msg) 
*/

console.log(prom)

/*
Promise {<fulfilled>: 'You are successFull'}[[Prototype]]: Promise[[PromiseState]]: "fulfilled"[[PromiseResult]]: "You are successFull"
*/

//passing argument to the promise function

function prom1(complete){
  return new Promise(function(resolve,reject){
    if (complete) {
      resolve("Hey! You Won")
    } else {
      reject("Hey! You dont worry, prepare harder!")
    }
  })
}

console.log(prom1(true));

/*
Promise {<fulfilled>: 'Hey! You Won'}
[[Prototype]]: Promise
[[PromiseState]]: "fulfilled"
[[PromiseResult]]: "Hey! You Won"
*/

// console.log(prom1(false));
/*
Uncaught (in promise) Hey! You dont worry, prepare harder!
(anonymous) @ Advance.js:502
prom1 @ Advance.js:497
(anonymous) @ Advance.js:514
*/

// Explicitely calling the callback function then(funcNameOnSuccess) and catch(funcNameOnRejection)

let onFullfillMent = (res)=>{
  console.log(res)
}

let onRejection = (err)=>{
  console.log(err)
}

prom1(true).then(onFullfillMent) // Hey! You Won
prom1(false).catch(onRejection)// Hey! You dont worry, prepare harder!

//method chaining
prom1(true).then(onFullfillMent).catch(onRejection)
// Hey! You Won

// promise with the timeout function to get the data from server

function prom2(req){
  return new Promise((resolve,reject)=>{
      // promise pending area
      console.log("fetching the data from server ...")

      setTimeout(()=>{
      // req is the promise condition or situation which if get true with no obstacles then promise if fullfilled   
        if (req) {
          resolve("Request processed")
        }
        else{
          reject("Apologies for the delay, We will get back to you")
        }
      },1000)
    }
  )
}

prom2(true).then(onFullfillMent).catch(onRejection)
/*
After 3 seconds of p[age loading => 
-- Request processed
*/

// Even these explietly called function can be further reduced as below

prom2(true).then((res)=>{console.log(res)}).catch((err)=>{console.log(err)})
//Request processed

console.log(prom2(true))

function prom3(a,b){
  return new Promise((resolve,reject)=>{
      // promise pending area
      console.log("fetching the data from server ...")
      console.log("Calculating...")
      c = a/b;

      setTimeout(()=>{
      // req is the promise condition or situation which if get true with no obstacles then promise if fullfilled   
      let cond = (a,b)
      console.log(cond,typeof cond)
        if(cond) {
          resolve(`Division is  ${c}`)
        }
        else{
          reject("Apologies for the delay, We will get back to you")
        }
      },1000)
    }
  )
}

prom3(5,2).then((res)=>{console.log(res)}).catch((err)=>{console.log(err)}) // Dvision is 2.5

prom3(5,0).then((res)=>{console.log(res)}).catch((err)=>{console.log(err)}) // Dvision is 2.5


// ========= both the fundctions with .then(onFullfillMent()=>{},onRejection()=>{})


//======== promise with arrow function

let arrowProm = new Promise((x,y)=>{
  let p =0// some processing

  if(p==0)
    x("pass")
  else
    y("erro")
})

arrowProm.then(
  (pass)=>{console.log("sucess " + pass )},
  (fail)=>{console.log("failure " +fail)}
) // sucess pass

/*
NOTE :
let cond = (a,b)
Here cond variable will take the value of b always
so we want to show error if value of bis 0 then we can use this case of assging the value
OR ELSE 
We can directly use , let  cond = b 
*/

// ======= Promise.all()
// if all promises get resolved then ONLY .then() will be called
// if any one Promise() gets rejected then .catch() will be called

let promm = true;
let Prom1 = new Promise((resolve,reject)=>{
    console.log("this is the poending stage for prom1")
    setTimeout(()=>{
      if(promm)
      resolve("Prom1 has been resolve")
    else  
      reject("ERROR : Prom1")  
    },3000)
})

let Prom2 = new Promise((resolve,reject)=>{
  console.log("this is the poending stage for Prom2")
  setTimeout(()=>{
    if(promm)
    resolve("Prom2 has been resolve")
  else  
    reject("ERROR : Prom2")  
  },6000)
})

let Prom3 = new Promise((resolve,reject)=>{
  console.log("this is the poending stage for Prom3")
  setTimeout(()=>{
    if(promm)
    resolve("Prom3 has been resolve")
  else  
    reject("ERROR : Prom3")  
  },8000)
})

Promise.all([Prom1,Prom2,Prom3]).then(
  (pass)=>{
    console.log("All promises fullfilled")
  }).catch(  
    (error)=>{
      console.log.log("ERROR : Something went wrong")
    })

//================ promiseCall(p1,p2)

let promiseCall = function(data,whichOne){
  return function(resolve,reject){
    setTimeout(()=>{
      console.log(`the ${whichOne} promise has fulfilled from promiseCall`)
      resolve(data)
    },data*100)
  }
}; 

// these bewlo lines must be defined bewlo promiseCall function declaration
let p1  = new Promise(promiseCall(10,"p1first"))
let p2  = new Promise(promiseCall(20,"p2second"))
let p3  = new Promise(promiseCall(30,"p3third"))

let p4  = new Promise((resolve, reject)=>{
    console.log("the fourth promise is pending..")
    let x =0;
    if(x==0)
    resolve("The fourth promise has been resolved")
    else
    reject("Forth promise has been rejected")

})

Promise.all([p1,p2,p3]).then((data)=>{console.log("PromiceCall.all of p series resolved")
let total =0
for (const key in data) {
  total+=data[key]
}
console.log("total is "+ total)
}).catch((err)=>{console.log(err)})

// ======== Asynch and Await


