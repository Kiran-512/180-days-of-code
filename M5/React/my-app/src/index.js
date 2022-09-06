import React from "react";
import ReactDom from "react-dom"; // imported so that we can inject our function into root div of index.html

//setup css
import './index.css';
import { books } from './books';// since books is a js file we dont need a extension
import Book from './Book'; // import SpecificBook from './Book'; // this will work as name doent matters in case of default export, but in case, if its not a default then name must match with the exported variables or functions! 

import { message } from './testing/testing';
console.log(message);//Greetings of the day!

function Booklist() {
  return (
    <section className="booklist">
      {books.map((book, index) => {
        return <Book key={book.id} {...book}></Book>;
      })}
    </section>
  );
}

ReactDom.render(<Booklist />, document.getElementById("root"));

//unlike html in react app, we must strictly use html with oepning and closing tags wherever needed
//<Greeting/> OR <Greeting></Greeting> both are Ok
//  return <h1>This is first component</h4> => Error!!

//Render method has two params, 1> What we are gonna render and 2> Where we gonna render it!
