// Create a todo item with a title and completion status

export default class Todo {
    // Properties: title and isCompleted
    title: string;
    isCompleted: boolean;

    // Constructor is what initializes the class
    constructor(title: string) {
        this.title = title;
        this.isCompleted = false;
    }

    // Method to mark the todo as completed
    complete(): void {
        this.isCompleted = true;
    }
}