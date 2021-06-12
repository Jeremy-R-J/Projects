import React, { createElement } from "react";
import ReactDom from "react-dom";
import "./index.css";

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
      <Book />
      <Book />
      <Book />
      <Book />
      <Book />
      <Book />
    </section>
  );
}

const Book = () => {
  return (
    <article className="book">
      <Image />
      <Title />
      <Author />
    </article>
  );
};
const Image = () => (
  <img
    src="https://images-na.ssl-images-amazon.com/images/I/81eB%2B7%2BCkUL._AC_UL200_SR200,200_.jpg"
    alt=""
  />
);
const Title = () => <h1>I love you to the moon and back</h1>;
const Author = () => (
  <h4 style={{ color: "#617d98", fontSize: ".75rem", margin: ".25rem" }}>
    Amelia Hepworth
  </h4>
);

ReactDom.render(<BookList />, document.getElementById("root"));
