package com.adityashukla.demoapp.demoapp.demoTodo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class DemoTodoControllerJpa {
	private TodoRepository repository;

	public DemoTodoControllerJpa(TodoRepository repository) {
		super();
		this.repository=repository;
	}

	@RequestMapping("demotodos")
	public String getDemoTodos(ModelMap model) {
		String username = getLoggedInUser();
		List<DemoTodo> todos =repository.findByUsername(username);
		model.addAttribute("todos",todos);
		return "demoListTodos";
	}
	private String getLoggedInUser() {
		Authentication authentication=  SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}

	@RequestMapping(value="add-todo",method = RequestMethod.GET)
	public String getDemoTodo(ModelMap model) {
		String username= getLoggedInUser();;
		DemoTodo todo = new DemoTodo(0,username,"",LocalDate.now().plusYears(1), false);
		model.put("todo", todo);
		return "addTodo";
	}
	@RequestMapping(value="add-todo",method = RequestMethod.POST)
	public String postDemoTodo(ModelMap model,@Valid DemoTodo demotodo,BindingResult result) {
		if(result.hasErrors()) {
			
			return "redirect:add-Todo";
		}
		String username= getLoggedInUser();
		demotodo.setUsername(username);
		repository.save(demotodo);
		return "redirect:demotodos";
	}
	@RequestMapping(value="delete-todo",method = RequestMethod.GET)
	public String deleteDemoTodo(@RequestParam Long id, ModelMap model,@Valid DemoTodo todo,BindingResult result) {
		
		String username=getLoggedInUser();;
		repository.deleteById(id);
		return "redirect:demotodos";
	}
	@RequestMapping(value="update-todo",method = RequestMethod.GET)
	public String showUpdateDemoTodo(@RequestParam Long id, ModelMap model,@Valid DemoTodo demotodo,BindingResult result) {
		
		String username=getLoggedInUser();
		
		DemoTodo todo=repository.findById(id).get();
		model.put("todo", todo);
		return "addTodo";
	}
	@RequestMapping(value="update-todo",method = RequestMethod.POST)
	public String updateDemoTodo(@RequestParam Long id, ModelMap model,@Valid DemoTodo todo,BindingResult result) {
		
		if(result.hasErrors()) {
			
			return "redirect:add-Todo";
		}
		String username=getLoggedInUser();
		todo.setUsername(username);
		todo.setTargetDate(LocalDate.now().plusYears(1));;
		repository.save(todo);
		return "redirect:demotodos";
	}
}
