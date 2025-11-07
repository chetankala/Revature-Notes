// using promise chaining with then()
fetch('https://jsonplaceholder.typicode.com/users/1')
// get response object, return response body 
.then(response => response.json())
// extra data, log it to the console
.then(json => console.log(json))

// using async/await syntax
async function fetchUserData() {
    // wait for the fetch to complete
    const response = await fetch('https://jsonplaceholder.typicode.com/users/1');

    // wait for the response body to be parsed as JSON
    const data = await response.json();

    // log the data to the console
    console.log(data);
}

// call the async function
fetchUserData();