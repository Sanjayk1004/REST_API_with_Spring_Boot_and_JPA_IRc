package com.example.demo.ex1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//Exercise demonstrating basic welcome message using Controller Annotation

@Controller
public class ClassEx1 
{
	
	@RequestMapping(value="/exercise1", method=RequestMethod.GET)
	@ResponseBody
	public String Welcome()
	{
		return "<h2>Welcome to RestApi class</h2>";
	}
}