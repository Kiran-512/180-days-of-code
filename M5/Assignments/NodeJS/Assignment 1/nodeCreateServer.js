/*Read the parameters from the https request and show back the params in response
params are 
empno
empname
deptid
*/

const xhttp = require('http');
let xurl = require("url")

xhttp.createServer((req,res)=>{
//this function will get called when th e request is made from the client side on port no 99
    console.log("Server i listening at port 120...")
    let params = xurl.parse(req.url,true).query
    let msg = params.empno + " " + params.ename + " "+params.deptid
    res.write(msg)
    res.end()
}).listen(120);

//http://localhost:120/?empno=101&ename=Kiran&deptid=10 

//101 Kiran 10