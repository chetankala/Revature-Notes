package org.todoapp.service;

import org.todoapp.model.Todo;
import org.todoapp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    // Fetch all todos
    public List<Todo> getAllTodos(){
        return todoRepository.findAll();
    }

    // Fetch a specific todo by ID
    public Optional<Todo> getTodoById(Long ID){
        return todoRepository.findById(id);
    }

    // Save a new or updated todo
    public Todo saveTodo(Todo todo){
        return todoRepository.save(todo);
    }

    // Delete a todo by ID
    public void deleteTodo(Long id){
        todoRepository.deleteById(id);
    }
}
