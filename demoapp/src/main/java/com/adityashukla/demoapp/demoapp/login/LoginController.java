package com.adityashukla.demoapp.demoapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import ch.qos.logback.core.model.Model;

@Controller
@SessionAttributes("name")
public class LoginController {
	UserAuthenticationService authenticationService;
	public LoginController(UserAuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}
	private Logger logger = LoggerFactory.getLogger(getClass());
	@RequestMapping(value="login",method = RequestMethod.GET)
	public String login(@RequestParam String name ,ModelMap model) {
		model.put("name",name);
		logger.debug("Request param is {}",name);
		return "login";
	}
	
	@RequestMapping(value="login",method = RequestMethod.POST)
	public String welcome(@RequestParam String username,@RequestParam String password ,ModelMap model) {
		model.put("username",username);
		logger.debug("Request param is {}",username);
		if(authenticationService.authenticateUser(username, password)) {
		return "welcome";
		}
		else {
			model.put("errorMesssage","Invalid Credentials ! Please try again .");
			return "login";
			}
	}
}
