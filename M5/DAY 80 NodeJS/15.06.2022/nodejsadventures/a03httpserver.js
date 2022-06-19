const http = require("http"); // exporting the module http from NodeJS library
let url = require("url"); // exporting the module url 

http.createServer((req, res) => { // using the createServer method from the http module in our code with the variable in which that module in imported

    //entire syntax is waste of time but do it.
    var q = url.parse(req.url, true).query;
    console.log("call back funtion");
    res.write("hello server" + q.x);
    res.end();
  }).listen(99); // port no which vary in long range 
