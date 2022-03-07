package com.springController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springModel.User;
@Controller
public class UserController {

@RequestMapping(path="/registration", method=RequestMethod.POST)	
public String show(@ModelAttribute User user,Model model)
{
	model.addAttribute("userName", user.getUserName());
	System.out.println(user);
	//if(user.getEmail().length()==0 || user.getUserName().length()==0 || user.getPassword().length()==0)
	if(user.getEmail().isEmpty() || user.getUserName().isEmpty() || user.getPassword().isEmpty())
	return "error";
	else
		return "success";
	
}
	
}
