import React from "react";
import { Link } from "react-router-dom";
import pic from "../indpic.jpg";

const Error = () => {
  return (
    <section className="error-page section">
      <div className="error-container">
        <h1>You choice didn't quite work!</h1>
        <img src={pic} alt="" />
        <Link to="/" className="btn btm-primary">
          Home
        </Link>
      </div>
    </section>
  );
};

export default Error;
