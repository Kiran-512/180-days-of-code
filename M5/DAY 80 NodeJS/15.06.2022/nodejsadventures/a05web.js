const http = require('http');
const url = require("url");

http.createServer((req, res) => {

    //function is going to get calld when request is made
    let params = url.parse(req.url, true).query; // we are reading query string and getting
    //parameters passed in form of an object
    let msg = params.empno + "  " + params.ename + " " + params.deptid;
    res.write(msg);//this is response
    res.end();
}).listen(99);

//http://127.0.0.1:99/empno=101&ename=Kiran&deptid=10


