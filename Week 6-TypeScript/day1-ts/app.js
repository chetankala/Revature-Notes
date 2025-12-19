"use strict";
Object.defineProperty(exports, "__esModule", { value: true });

// This annotation helps TypeScript understand the shape of the object
// function greet(person: Person){
//     return "Hello " + person.firstName + " " + person.lastName;
// }

var me = {
    firstName: "Chetan",
    lastName: "Kala"
};
console.log(me);
//let input = document.querySelector('input[type="text"]');

function greet(name) {
    return "Hello! ".concat(name);
}
greet.description = "this function greets a person with their name";
// interface GreetFunction extends Function {
//     description: string;
// }
// const myGreetFunction: GreetFunction = greet as GreetFunction;
// or 

var myGreetFunction2 = greet;
console.log(myGreetFunction2("Chetan"));
console.log(myGreetFunction.description);

