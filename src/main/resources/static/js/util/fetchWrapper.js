/**
 * 
 */
export const fetchWrapper = async (pathname, option = { method: "GET" }) => {
  const hostname = 'https://jsonplaceholder.typicode.com';

  const endpoint = hostname + pathname;

  return await fetch(endpoint, { method: option.method }).then(
    (res) => res.json()
  );
};