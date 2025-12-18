// TodoService.js

export class TodoService {

    constructor() {
        this.apiUrl = "http://localhost:8080"; //Base URL for the backend API
    }

    // Fetch all todos from the backend API
    async getTodos() {
        try {
            const response = await fetch(`${this.apiUrl}/todo/todos`);
            if (!response.ok) {
                throw new Error(`Failed to fetch todos: ${response.statusText}`);
            }

            // Parse the JSON response and return it
            return await response.json();
            } catch (error) {
                console.error("Error fetching todos:", error);
                return [];
            }
        }

    // Add a new todo to the database through the backend API
    async addTodo(todo) {
        try {
            const response = await fetch(`${this.apiUrl}/todo/todo`, {
                method: "POST",
                headers: { 
                    "Accept": "application/json",
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(todo)
            });

            // Check if the response is successful
            if (!response.ok) {
                throw new Error(`Failed to add todo: ${response.statusText}`);
            }
            console.log(`todo before response ${todo}`);

            return await response.json();

        // Handle errors and log them
        } catch (error) {
            console.error("Error adding todo:", error);
            return null;
        }
    }

    // Mark a todo as completed through the backend API
    async completeTodo(id){
        try {
            const response = await fetch(`${this.apiUrl}/todos/${id}`, {
                method: "PATCH",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({ isCompleted: true })
            });

            if (!response.ok) {
                throw new Error(`Failed to complete todo: ${response.statusText}`);
            }
        }
        catch (error) {
        console.error("Error completing todo:", error);
        }
    }
}

  