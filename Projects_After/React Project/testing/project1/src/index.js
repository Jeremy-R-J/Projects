import React from "react";
import ReactDom from "react-dom";
import "./index.css";
import { books } from "./books";
import SpecificBook from "./Book";
//CSS
//stateless functional component
//always return JSX
//div / section / article fragment
//className instead of class
//close every element
//formatting
//nested components, React tools

function BookList() {
  return (
    <section className="booklist">
      {books.map((book) => {
        return <SpecificBook key={book.id} {...book}></SpecificBook>;
      })}
    </section>
  );
}

ReactDom.render(<BookList />, document.getElementById("root"));
