import Todo from "./Todo";

// Manages a list of Todo items and handles their display
export default class TodoList {
    private todos: Todo[] = []; // This array holds the list of todos

    // Method to add a new todo to the list
    addTodo(todo: Todo): void {
        this.todos.push(todo);
        this.render();
    }

    // Method to display the todos in the HTML document
    private render(): void {
        const todoListElement = document.getElementById("todo-list") as HTMLUListElement;
        todoListElement.innerHTML = ""; // Clear existing list

        // This loops through each todo and creates a list item for it
        this.todos.forEach((todo, index) => {
            const listItem = document.createElement("li");
            listItem.textContent = todo.title; // Set the text to the todo title

            // If the todo is completed, we style it as strikethrough
            if (todo.isCompleted) {
                listItem.style.textDecoration = "line-through";
            }

            // This is an event listener to mark the todo as completed when clicked
            listItem.addEventListener("click", () => {
                todo.complete();
                this.render();
            });
            
            // Add the list item to the todo list in the HTML
            todoListElement.appendChild(listItem);
        });
    }
}