package org.todoapp.controller;

import org.todoapp.model.Todo;
import org.todoapp.model.User;
import org.todoapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpSession;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @PostMapping
    public ResponseEntity<Todo> createTodo(@RequestBody Todo todo, HttpSession session){
        User loggedInUser = (User) session.getAttribute("user"); // Get user from session
        if (loggedInUser == null || !"user".equals(loggedInUser.getRole())){
            return ResponseEntity.status(401).body(null); // Unauthorized if not logged in or wrong role
        }
        todo.setUserId(loggedInUser.getId()); // Set todo's userId to logged-in user's ID
        Todo newTodo = todoService.saveTodo(todo);
        return ResponseEntity.ok(newTodo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable("id") Long id, @RequestBody Todo todoDetails, HttpSession session){
        User loggedInUser = (User) session.getAttribute("user");
        System.out.println("hello");
        if (loggedInUser == null || !"user".equals(loggedInUser.getRole())) {
            return ResponseEntity.status(401).body(null);
        }

        Optional<Todo> optionalTodo = todoService.getTodoById(id);
        if (optionalTodo.isPresent()) {
            Todo todo = optionalTodo.get();
            todo.setDescription(todoDetails.getDescription());
            todo.setCompleted(todoDetails.isCompleted());
            todo.setUserId(loggedInUser.getId());

            Todo updatedTodo = todoService.saveTodo(todo);
            return ResponseEntity.ok(updatedTodo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable Long id, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("user");
        if (loggedInUser == null || !"user".equals(loggedInUser.getRole())) {
            return ResponseEntity.status(401).build();
        }

        Optional<Todo> todo = todoService.getTodoById(id);
        if (todo.isPresent()){
            todoService.deleteTodo(id);
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
