"use strict";

/*---------------------------------------------------------------------------------------------------------*/

console.log("typeof [1,2,3,4]: ", typeof [1, 2, 3, 4]);
console.log("typeof [1,2,3,4]: ", typeof {name: 'Hello', occupation: 'Student'});
console.log(('a' + 5));

/*---------------------------------------------------------------------------------------------------------*/

if ({value: false}) {
    console.log("This is true");
} else {
    console.log("This is false");
}
console.log("x: " + x);
let x = 10;

/*---------------------------------------------------------------------------------------------------------*/

function addNumbers(a, b) {
    return a + b;
}

const result = addNumbers(5, 10); // result is 15
console.log("Result: " + result);

/*---------------------------------------------------------------------------------------------------------*/

function outerFunction() {
    const outerVar = 'I am from outer function!';
    function innerFunction() {
        console.log(outerVar);
    }
    return innerFunction;
}
const closureExample = outerFunction();
closureExample(); // Logs: I am from outer function!
let myObject = {pet : "Cat"};
console.log(myObject.pet); // Logs: Cat

/*---------------------------------------------------------------------------------------------------------*/

function adoptDog(obj){
    obj.pet = "Dog";
}
adoptDog(myObject);
console.log(myObject.pet); // Logs: Dog

/*---------------------------------------------------------------------------------------------------------*/

(function () {
    // do this right now
    console.log("This function runs immediately!");
})();

function proccessNumber(num, callback ){
    const result = callback(num);
    console.log("Processed number: " + result);
}

/*---------------------------------------------------------------------------------------------------------*/

var myName = "Chetan";
console.log(myName[1]);

const double = (num) => num * 2;
const divideNum = (x, y) => { 
    return x / y;
};
proccessNumber(5, double); // Processed number: 10

/*---------------------------------------------------------------------------------------------------------*/

// const number = [1,2,3,4,5];

// addNumbers.forEach(function (number) {
//     console.log(number * 2); //Double each number
// });
 
const numbers = [1,2,3,4,5];

const doubledNumbers = numbers.map(function(number) {
    return number * 2; // Creating a new array with doubled numbers
});

console.log(doubledNumbers); // Output: [2,4,6,8,10]
console.log(doubledNumbers.filter(number => number % 2 === 1));

/*---------------------------------------------------------------------------------------------------------*/

const people=[
    {name: "Chetan", age: 24},
    {name: "John", age: 30},
    {name: "Jane", age: 22},
    {name: "Doe", age: 28},
    {name: "Smith", age: 99}
]

const filteredpeople = people.filter(people => people.age > 25);
console.log(filteredpeople.forEach(people => console.log(people)));

/*---------------------------------------------------------------------------------------------------------*/

let array = [1,2,3];
console.log(array.length); // 3
console.log(array__proto__); // Accessing the prototype of the array []
console.log(array.concat([4,5,6])); // adds [4,5,6] to the end of the array
console.log(array.every(num => num < 5)); // checks if every element is less than 5

function sayHello(){
    return "Hello World!!";
}
var w = 1;
var y = 2;
console.log(`${satHello()}, The product of the variables ${w} and ${y} are ${w * y}`);

/*---------------------------------------------------------------------------------------------------------*/