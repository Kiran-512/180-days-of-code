
// http://localhost:90/?adults=1&child=0&infants=10

let x = require('http')
let y = require('url')
// here x and y are variables and we can take any name for it... url,htttp also

x.createServer(

    (req,res)=>{
        //this function will get called only when req is made
        let q = y.parse(req.url,true).query//why? I want to read parameters
        res.write(q.adults + " "+q.child +" "+q.infants)
        console.log("req handling function")
        res.end()// iof this si not written then iot will take alot of time to load in the browser 
    }
    
    ).listen(99)

