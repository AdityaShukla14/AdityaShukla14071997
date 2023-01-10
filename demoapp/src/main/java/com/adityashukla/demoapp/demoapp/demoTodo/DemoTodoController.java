package com.adityashukla.demoapp.demoapp.demoTodo;

import java.time.LocalDate;
import java.util.List;

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
public class DemoTodoController {
	private DemoTodoService demoTodoService;

	public DemoTodoController(DemoTodoService demoTodoService) {
		super();
		this.demoTodoService = demoTodoService;
	}

	@RequestMapping("demotodos")
	public String getDemoTodos(ModelMap model) {
		List<DemoTodo> todos =demoTodoService.findByUsername("AdityaShukla");
		model.addAttribute("todos",todos);
		return "demoListTodos";
	}
	@RequestMapping(value="add-todo",method = RequestMethod.GET)
	public String getDemoTodo(ModelMap model) {
		String username=(String)model.get("name");
		DemoTodo todo = new DemoTodo(0,username,"",LocalDate.now().plusYears(1), false);
		model.put("todo", todo);
		return "addTodo";
	}
	@RequestMapping(value="add-todo",method = RequestMethod.POST)
	public String postDemoTodo(ModelMap model,@Valid DemoTodo demotodo,BindingResult result) {
		if(result.hasErrors()) {
			
			return "redirect:add-Todo";
		}
		String username=(String)model.get("name");
		
		demoTodoService.addTodo(0,username, demotodo.getDescription(), LocalDate.now().plusYears(1), false);
		return "redirect:demotodos";
	}
	@RequestMapping(value="delete-todo",method = RequestMethod.GET)
	public String deleteDemoTodo(@RequestParam Long id, ModelMap model,@Valid DemoTodo todo,BindingResult result) {
		
		String username=(String)model.get("name");
		
		demoTodoService.deleteTodo(id);;
		return "redirect:demotodos";
	}
	@RequestMapping(value="update-todo",method = RequestMethod.GET)
	public String showUpdateDemoTodo(@RequestParam Long id, ModelMap model,@Valid DemoTodo demotodo,BindingResult result) {
		
		String username=(String)model.get("name");
		
		DemoTodo todo=demoTodoService.findTodoById(id);
		model.put("todo", todo);
		return "addTodo";
	}
	@RequestMapping(value="update-todo",method = RequestMethod.POST)
	public String updateDemoTodo(@RequestParam Long id, ModelMap model,@Valid DemoTodo todo,BindingResult result) {
		
		if(result.hasErrors()) {
			
			return "redirect:add-Todo";
		}
		String username=(String)model.get("name");
		todo.setUsername(username);
		todo.setTargetDate(LocalDate.now().plusYears(1));;
		demoTodoService.updateTodo(todo);
		return "redirect:demotodos";
	}
}
