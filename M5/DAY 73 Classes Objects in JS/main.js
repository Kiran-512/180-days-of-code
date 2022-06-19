// ==========       JS from Angela      =============

// variables
var a = 10
var b =20
var c = a+b;

// alert(a+b)
// alert("a+b")

// prompt("What is your name?")

// var name = prompt("What is your name?")
// alert("Your name is "+ name)

//count the no of words type and remaing words from 40

// var tweet = prompt("Your Tweet");
// var tweetCount = tweet.length
// alert("You have typed the total nof words " + tweetCount + ", and the remaining words are "+(40-tweetCount) )

// ==========       String concetenation      =============

//slice()

/*
var tweet = prompt("Your Tweet");
var tweetUnder140 = tweet.slice(0,140);
alert(tweetUnder140)
*/

// alert(prompt("Your Tweer").slice(0,20));

/*
var name = "kIRAN YadaV"
name = name.toUpperCase();

var yourName = prompt("Enter your name");
var firstLetter = yourName.slice(0,1);
firstLetter = firstLetter.toUpperCase();
alert("Hello " + firstLetter+yourName.slice(1,yourName.length).toLowerCase())

*/

// Random number generation 0 - 0.999999999999999
/*
prompt("Your name")
prompt("partner's name")
var n = Math.random()
n = n*100;
alert("Your Love score is "+ Math.floor(n))
*/

/*
var unum = prompt("Identyfy the number between 1 to 10? ")
var n = Math.random();
n = Math.floor(n*10 + 1)
if(unum === n ){
    alert("You wont, its the same number given by computrer "+ n)
}
else{
    alert("You lost try next time  " + n)
}
*/

//LEAP YEAR FUNCTION
/*
function isLeap(year) {
        //Write your code here.    
    if(year%4 === 0){
            if(year%100 === 0 && year%400 === 0){
            alert("Leap year!")
            }
            else{
                alert("Not Leap year!")
            }
        }
    else{
            alert("Not Leap year!")
        }
    }

isLeap(2024);
*/






















