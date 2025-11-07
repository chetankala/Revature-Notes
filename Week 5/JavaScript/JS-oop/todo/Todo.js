// Todo.js

// The Todo class represents a single todo item in the todo list
export class Todo {

    // Properties of the Todo class. Purpose: to store the task
    description;
    completed;

    constructor(description) {
        this.description = description; // The description of the todo item, passed as an argument when creating a new instance
        this.completed = false; // The completion status of the todo item, default is false
    }

    // Method to mark the todo item as completed
    markAsCompleted() {
        this.completed = true;
    }

    // Returns the description of the task, with styling if it is completed
    getDetails() {
        // If the task is completed, wrap the description in a span with a strikethrough style
        return this.completed ? `<span class="completed">${this.description}</span>` : this.description;
    }
}

// The UrgeentTodo class extends the Todo class to represent urgent todo items and add a priority level
export class UrgentTodo extends Todo {
    constructor(description, priority) {

        // Call the parent class constructor (Todo) to initialize the description and completed properties
        super(description); 

        // The priority of the task, specific to urgent todos
        this.priority = priority; 
    }

    // Override the getDetails method to include priority information in the returned string
    getDetails() {
        // Calls the parent class's getDetails method and appends the priority information
        return `${super.getDetails()} <strong>(Priority: ${this.priority})</strong>`;
    }
}