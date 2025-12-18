// TodoList.js

// Imprt the Todo class from the Todo.js module
import { Todo } from './Todo.js';

// The TodoList class manages a list of Todo items and handles their display in the DOM
export class TodoList {
    constructor() {
        this.todos = []; // Array to store Todo items
    }

    // Method to add a new Todo item to the list and update the display and re-render the list in the DOM
    addTodo(todo) {
        this.todos.push(todo); //Adds the new todo to the todos array
        this.render(); // Calls the render method to update the DOM
    }

    // Method to render the list of Todo items in the DOM
    render() {
        const todoList = document.getElementById('todo-list'); // Selects the <ul> element where todos will be displayed
        todoList.innerHTML = ''; // Clear the existing list items before re-rendering
        
        this.todos.forEach(todo => {
            const li = document.createElement('li'); // Create a new <li> element for each todo
            li.innerHTML = todo.getDetails(); // Set the inner HTML of the <li> using the getDetails method

            const completeButton = document.createElement('button'); // Create a button to mark the todo as complete
            completeButton.className = 'completeButton'; // Adds styling class to the button
            completeButton.textContent = 'Complete'; // Set the button text

            // Adds an event listener to the button to handle marking the todo as complete
            completeButton.onclick = () => {
                todo.complete(); // Mark the todo as complete
                this.render(); // Re-render the list to reflect the change
            };

            li.appendChild(completeButton); // Append the button to the <li> element
            todoList.appendChild(li); // Append the <li> to the <ul> in the DOM
        });
    }
}