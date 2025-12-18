// app.js

import { Todo } from './Todo.js';
import { TodoList } from './TodoList.js';
import { TodoService } from './TodoService.js';

// Initialize a new TodoService with the base URL of the API
const todoService = new TodoService(); // Replace with your actual API URL

// Initialize a new TodoList instance to manage the todo items
const todoList = new TodoList();
const form = document.getElementById('todoForm');
const input = document.getElementById('todoInput');

// Fetch and display existing todos from the service when the app loads
async function loadTodos() {
    const todos = await todoService.getTodos();
    todos.forEach(todoData => {
        const todo = new Todo(todoData.description);

        // Set the completed status if applicable
        if (todoData.completed) {
            todo.complete();
        }
        todoList.addTodo(todo);
    });
}

// Handling adding new todos via the form submission
form.addEventListener('submit', async (event) => {
    event.preventDefault();
    const description = input.value.trim();
    
    // Validate input and add new todo via the service
    if (description) {
        const mytodo = new Todo(description);
        const newTodo = await todoService.addTodo(myTodo);

        const todo = new Todo(description);
        todoList.addTodo(todo);
        input.value = '';
    } else {
        console.log('Please enter a todo description.');
    }
});

// Load existing todos when the app starts
loadTodos();