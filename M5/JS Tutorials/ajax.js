// ====== JSON

//JSON (JavaScript Object Notation) is a lightweight data-interchange format. It is easy for humans to read and write. It is easy for machines to parse 

// AJAX is run on client side wherein NodeJS is run on server side

/*
XMLhttpRequest

STAGES :
1: REQUEST NOT 
2:server connection established
3:request received
4:processing request
5:request finished and response is read
*/


// repsonseText()
// responseXML()

$(()=>{

  $("#btn").click(() =>{
    var xhttp = new XMLHttpRequest();
  
    xhttp.onreadystatechange = function () {
      if (this.readyState == 4 && this.status == 200) {
        console.log("its working onclick");
        console.log(xhttp.responseText);
        $("#demo").text(this.responseText);
      }else if(this.readyState == 0 ){
        console.log("req not initialised ")
      }else if(this.readyState == 2){
        console.log("req initialised ")
      }
    };
    xhttp.open('GET', "content/readme.txt", true);
    xhttp.send();
  })
  
  // xhttp.open("GET", "content/readme.txt", true);
  
  // GET - two mwthods other-one is POST, In GET rhe data is open anyone can see it wherein in POST data is hidden and widely used where data security is involed 
  
  // second is file Path2D, here we can give URL or file path from local system,
  
  // true - asynch mode status, true means its synchronous and false is asynch , if its false then code next to this line wont be intepreted and will wait untilthe response rcvs from the server
  
  //onreadystatechange - workjs like an event , on changing readyStage WE CAN give if lse condition inside this method
  
  // ==========    fetch()
  // introduced in ES6
  // fetch(file/URL) -> returns a Promise
  
  // fetch(file/URL).then() -> here then()also returns a promise
  
  fetch("content/readme.txt")
    .then(function (response) {
      console.log(response.text())
  /*
  Promise {<pending>}[[Prototype]]: Promise[[PromiseState]]: "fulfilled"[[PromiseResult]]: "Hello, Welcome to Ajax!"
  
  */
      return response.text();
    })
    .then(function (res) {
      console.log(res);
      $("#demo").text(res);
    })
    .catch(function (err) {
      console.log(err);
    });
  
  // === with the arrow function
  
  fetch("content/readme.txt")
    .then((response) => response.text())
    .then((res) => {
      console.log(res);
      $("#demo").text(res);
    })
    .catch((err) => console.log(err));
  
  // read with the fetch
  
  fetch("https://jsonplaceholder.typicode.com/users")
    .then((res) => res.json())
    .then((fRes) => {
      console.log(fRes);
      let res = "";
      for (let key in fRes) {
        $("#details").html(fRes); // this only prints the value of last item in object and not all
        res += fRes[key].name + "<br>";
      }
      $("#details").html(res);
    });
  
  // insert, update and delete with the fetch()
  
  /*
  POST - for inserting a new record on the server
  PUT - for updating the exsting record on the server
  DELETE - to delete the record from the server
  */
  
  let obj = {
    name: "Akshay",
    skill: "Driver",
  };
  
  fetch("https://jsonplaceholder.typicode.com/users", {
    method: "POST",
    body: JSON.stringify(obj),
    headers: {
      "content-type": "application/json",
    },
  })
    .then(res => res.json())
    .then(json => console.log(json));
  
  /*
    {name: 'Akshay', skill: 'Driver', id: 11}
      id: 11
      name: "Akshay"
      skill: "Driver"
      [[Prototype]]: Object
  */
  
  // get the detaisl from the regitration form
  
  let new_User = {
    uid: $("#uid").val(),
    name: $("#name").val(),
    email: $("#email").val(),
    pass: $("#password").val(),
  };
  fetch("content/freelancer.js", {
      method: "PUT",
      body: JSON.stringify(new_User),
      headers: {
        "content-type": "application/json",
      },
    })
      .then(res => {
          console.log(res)        
          // res.json()
      })
      .then(json => console.log(json));

})