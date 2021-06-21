import React from "react";
import { useGlobalContext } from "./context";
const SearchForm = () => {
  const { query, setQuery, error } = useGlobalContext();
  return (
    <form
      action=""
      className="search-form"
      onSubmit={(e) => e.preventDefault()}
    >
      <h2>Find Your Movies in the search bar!</h2>
      <input
        type="text"
        className="form-input"
        value={query}
        onChange={(e) => setQuery(e.target.value)}
        placeholder="Type Here"
      />
      {error.show && <div className="error">{error.msg}</div>}
    </form>
  );
};

export default SearchForm;
