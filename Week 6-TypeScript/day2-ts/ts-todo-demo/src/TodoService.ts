import Todo from "./Todo";

interface todoData {
    id: number;
    title: string;
    isCompleted: boolean;
}

// Service to interact with a backend API for managing todos
export default class TodoService {
    private apiUrl: string;

    constructor(apiUrl: string) {
        this.apiUrl = apiUrl;
    }

    async getTodos(): Promise<TodoData[]> {
        try {
            const response = await fetch(`${this.apiUrl}/todo/todos`);
            if (!response.ok) {
                throw new Error("Failed to fetch todos");
            }
            return await response.json();
        } catch (error) {
            console.error("Error fetching todos:", error);
            return [];
        }
    }

    async addTodo(todo: Omit<TodoData, "id">): Promise<TodoData | undefined> {
        try {
            const response = await fetch(`${this.apiUrl}/todo/todo`, {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(todo)
            });
            if (!response.ok) {
                throw new Error("Failed to add todo");
            }
            return await response.json();
        } catch (error) {
            console.error("Error adding todo:", error);
        }
    }

    async completeTodo(id: number): Promise<TodoData | undefined> {
        try {
            const response = await fetch(`${this.apiUrl}/todos/${id}`, {
                method: "PATCH",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({ isCompleted: true })
            });
            if (!response.ok) {
                throw new Error("Failed to complete todo");
            }
            return await response.json();
        } catch (error) {
            console.error("Error completing todo:", error);
        }
    }
}
