// app.js

// Import the Todo and TodoList classes from their respective modules
import { Todo } from './Todo.js';
import { TodoList } from './TodoList.js';

// Initialize a new TodoList instance, which will manage our todo items
const todoList = new TodoList();

// Get references to the form and input elements from the DOM
const form = document.getElementById('todo-form');
const input = document.getElementById('todo-input');

// Add an event listener to the form to handle adding new todos
form.addEventListener('submit', (event) => {
    event.preventDefault(); // Prevent the default form submission behavior in a traditional way (reloading the page)

    const description = input.value.trim(); // Get the trimmed value from the input field
    if (description) { // Check if the description is not empty
        const newTodo = new Todo(description); // Create a new Todo instance 
        todoList.addTodo(newTodo); // Add the new todo to the TodoList
        input.value = ''; // Clear the input field after adding the todo
    }
});