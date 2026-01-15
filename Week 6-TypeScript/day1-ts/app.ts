import {Person} from './Person';

// function greet(person: Person) {
//     return `Hello, ${person.firstName} ${person.lastName}`;
// })

let me: Person = {firstName: "Chetan", lastName: "Kala"};
console.log(me);

// let input = document.querySelector("input[type='text']")!;

function greet(name : string): string {
    return `Hello, ${name}!`;
}
greet.description = "This function greets a person with their name.";

// interface GreetFunction extends Function {
//     description: string;
// }

//const myGreetFunction: GreetFunction = greet as GreetFunction;
//or

const myGreetFunction2 = greet;
console.log(myGreetFunction2("Chetan"));
console.log(myGreetFunction2.description);