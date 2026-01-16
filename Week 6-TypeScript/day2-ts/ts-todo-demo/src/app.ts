import Todo from "./Todo";
import TodoList from "./TodoList";
import TodoService from "./TodoService";

const todoService = new TodoService("http://localhost:8080/"); // Replace with your API URL

const todoList = new TodoList();
const form = document.getElementById("todo-form") as HTMLFormElement;
const input = document.getElementById("todo-input") as HTMLInputElement;

// Load existing todos from the server and display them
async function loadTodos(): Promise<void> {
    const todos = await todoService.getTodos();
    todoList.forEach((todoData) => {  
        const todo = new Todo(todoData.title);
        if (todoData.isCompleted) { 
            todo.complete();
        }
        todoList.addTodo(todo); 
    });
}

// Event listener for adding a new todo
form.addEventListener("submit", async (event: Event) => {
    event.preventDefault();
    const title = input.value.trim();
    if (title) {
        const newTodo = await todoService.addTodo({ title, isCompleted: false });
        if (newTodo) {
            const todo = new Todo(newTodo.title);
        }
    }
});

loadTodos(); // Initial load of todos

