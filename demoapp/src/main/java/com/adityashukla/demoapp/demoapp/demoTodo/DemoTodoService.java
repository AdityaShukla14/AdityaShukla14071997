package com.adityashukla.demoapp.demoapp.demoTodo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;
@Service
public class DemoTodoService {
	private static List<DemoTodo> todos = new ArrayList<>();
	private static int todosCount=0;
	static {
		todos.add(new DemoTodo(++todosCount,"AdityaShukla","React", LocalDate.now().plusYears(1),false));
		todos.add(new DemoTodo(++todosCount,"AdityaShukla","Spring", LocalDate.now().plusYears(2),false));
		todos.add(new DemoTodo(++todosCount,"AdityaShukla","SQL", LocalDate.now().plusYears(1),false));
		todos.add(new DemoTodo(++todosCount,"AdityaShukla","Java", LocalDate.now().plusYears(1),false));
	}

	public List<DemoTodo> findByUsername(String username){
		Predicate<? super DemoTodo> predicate = todos-> todos.getUsername().equalsIgnoreCase(username);
		return todos.stream().filter(predicate).toList();
	}
	public void addTodo(long id, String username, String description , LocalDate targetDate,boolean done) {
		DemoTodo todo = new DemoTodo(++todosCount,username,description,targetDate,done);
		todos.add(todo);
	}
	public void deleteTodo(long id) {
		Predicate<? super DemoTodo> predicate = todos-> todos.getId()==id;
		todos.removeIf( predicate);
	}
	public void updateTodo(@Valid DemoTodo todo) {
		
		deleteTodo(todo.getId());
		todos.add(todo);
		
	}
	public DemoTodo findTodoById(Long id) {
		Predicate<? super DemoTodo> predicate = todos-> todos.getId()==id;
		DemoTodo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}
}
