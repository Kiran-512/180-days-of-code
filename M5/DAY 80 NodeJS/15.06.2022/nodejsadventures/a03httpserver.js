const http = require("http"); // exporting the module http from NodeJS library
let url = require("url"); // exporting the module url 

http.createServer((req, res) => { // using the createServer method from the http module in our code with the variable in which that module in imported

    //entire syntax is waste of time but do it.
    var q = url.parse(req.url, true).query;
    console.log("call back funtion");
    res.write("hello server " + q.x); // http://127.0.0.1:99/?x=0 // hello server 0
    res.end();
  }).listen(99); // port no which vary in long range 
