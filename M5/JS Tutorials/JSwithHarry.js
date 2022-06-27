var a = window.localStorage;
console.log(a);
/*
Storage {selected-theme: 'dark', selected-icon: 'uil-moon', length: 2}
selected-icon: "uil-moon"
selected-theme: "dark"
length: 2
[[Prototype]]: Storage
*/

// a = window.localStorage.selected-icon;
console.log(a)//

// ======== function 
// localStorage.setItem('key','value')
// localStorage.getItem('key')// return the value for specified key

localStorage.setItem('name','kiran')
localStorage.setItem('name2','yadav')


localStorage.getItem('name')// return the value for specified key

// clear();
localStorage.clear();

//removeItem('key')
localStorage.removeItem('name');

//save array to localstorage
let array = ['kiran','rahul','pranit']

window.localStorage.setItem('users',array) // this will store array in string
/*
"kiran", "rahul", "pranit"
*/


window.localStorage.setItem('users',JSON.stringify(array)) // this will store array in array format
/*
["kiran", "rahul", "pranit"]
0: "kiran"
1: "rahul"
2: "pranit"
*/

//retrieve the data from local storage
var user = JSON.parse(localStorage.getItem('users'))
console.log(user)
/*
(3) ['kiran', 'rahul', 'pranit']
0: "kiran"
1: "rahul"
2: "pranit"
length: 3
[[Prototype]]: Array(0)
*/

// ======== SESSION storage =======
//hold data in key value pair and has same functions as like localStorage


