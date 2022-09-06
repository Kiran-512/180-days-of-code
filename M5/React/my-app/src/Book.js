import React from 'react'

const Book = (props) => {
 const { id, author, title, url } = props;

 const btn = document.getElementById("author");
 //btn.addEventListener('click', (author) => { console.log(author); }); // page is not rendered with this line??!!!!

 const complexHandler = (author) => { console.log(author); };

 return (
  <article className="book" onMouseOver={(props) => {
   console.log(props);
  }}>
   <Image url={url}></Image>
   <h1>{title}</h1>
   <h1 onClick={() => console.log(author)}>{author.toUpperCase()}</h1>
   {/* <button id="author" type="button">Complex Button</button> */}

  </article>
 );
}

const Image = (props) =>
 <img src={props.url} alt="book" />


export default Book
