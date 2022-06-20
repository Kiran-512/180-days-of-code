const express = require('express')
const app = express();

app.use(express.static("staticResources"));// All the files inside this folder 
// we can directly access as https://localhost:portNumber/fileName.ext and server wont process them as they are stored in the static folder

//when "/abc" URI is requested below event will occur
app.get("/abc",(req,res)=>{
    res.send("abc is called and responded")
})

app.get("/def",(req,res)=>{
    res.send("def is called and responded")
})

//to read the params from the URL in express JS
app.get("/login",(req,res)=>{
    console.log("login is requested...")
    
    let empid = req.query.empid; 
    let pass = req.query.password; 
    let userDetails = {empid:empid,password : pass}
    res.send(userDetails) // without AJAX entire page will be loaded and request will be opened up in the new page 
})
// http://localhost:1200/login?empid=12&password=12
// {"empid":"12","password":"12"} for above link

app.get("/rec",(req,res)=>{
    res.send("rec is called and responded")
})

app.listen(1800,()=>{
    console.log("Server is listening at the port no 1800...")
})

/*
Install express JS =>

node -v 
npm -v

npm init
next next next

yes
--> this will create package.json file which will store the the package info and all library details

npm install express 
 -- And you are done with the installation of express JS
*/