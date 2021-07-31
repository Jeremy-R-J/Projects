const paginate = (followers) => {
  const itemsPerPage = 12;
  const pages = Math.ceil(followers.length / itemsPerPage);
  //   the following creates an array of arrays
  const newFollowers = Array.from({ length: pages }, (_, index) => {
    const start = index * itemsPerPage;
    return followers.slice(start, start + itemsPerPage);
  });
  return newFollowers;
};

export default paginate;
