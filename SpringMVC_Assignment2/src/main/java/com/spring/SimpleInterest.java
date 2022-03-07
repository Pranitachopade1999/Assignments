package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleInterest {

	@RequestMapping(path="/simpleInterest",method=RequestMethod.POST)
	public String Cal(
			@RequestParam("Principle_Value") String p,
			@RequestParam("Year") String y,
			@RequestParam("Rate") String r,
			Model model)
	{
		double SI=Integer.parseInt(p)*Integer.parseInt(y)*Integer.parseInt(r);
		model.addAttribute("result", SI);
		return "SimpleInterest";
		
	}
}
