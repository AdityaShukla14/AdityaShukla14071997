package com.adityashukla.demoapp.demoapp.demoTodo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
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
		return todos;
	}
	public void addTodo(long id, String username, String description , LocalDate targetDate,boolean done) {
		DemoTodo todo = new DemoTodo(++todosCount,username,description,targetDate,done);
		todos.add(todo);
	}
}
