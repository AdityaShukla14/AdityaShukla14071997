package com.adityashukla.demoapp.demoapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class SayHelloController {
	
	@RequestMapping("say-hello")
	
	public String sayHello() {
		return "sayHello";
	}
}
