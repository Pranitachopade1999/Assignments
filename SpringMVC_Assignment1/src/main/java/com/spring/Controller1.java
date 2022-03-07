package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Controller1 {
	
	@RequestMapping("/hello")
	public String helloWorldContoller()
	{
		
		
		System.out.println("Now we are in helloWorldContoller");
		return "helloWorld";
		
	}

}
