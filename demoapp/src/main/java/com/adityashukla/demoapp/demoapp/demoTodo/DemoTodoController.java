package com.adityashukla.demoapp.demoapp.demoTodo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import ch.qos.logback.core.model.Model;

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
		
		return "addTodo";
	}
	@RequestMapping(value="add-todo",method = RequestMethod.POST)
	public String postDemoTodo(@RequestParam String description,ModelMap model) {
		String username=(String)model.get("name");
		demoTodoService.addTodo(0,username, description, LocalDate.now().plusYears(1), false);
		return "redirect:demotodos";
	}
}
