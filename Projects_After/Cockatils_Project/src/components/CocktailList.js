import React from "react";
import Cocktail from "./Cocktail";
import Loading from "./Loading";
import { useGlobalContext } from "../context";

const CocktailList = () => {
  const { cocktails, loading } = useGlobalContext();
  console.log(cocktails);
  if (loading) {
    return <Loading />;
  }
  if (cocktails.length < 1) {
    return (
      <h2 className="section-title">Time to rethink this search no matches!</h2>
    );
  }

  return (
    <div>
      <h2>cocktail list</h2>
    </div>
  );
};

export default CocktailList;
