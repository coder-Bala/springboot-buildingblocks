package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//controller
@RestController
public class HelloWorldController {

	//Simple method
	//URI = /helloworld
	//Get
	//@RequestMapping (method = RequestMethod.GET,path = "/helloworld")
	@GetMapping("/helloworld1")		
	public String HelloWorld()
	{
		return "Hello World";
	}
	
	
	@GetMapping("/helloworld-Bean")
	public UserDetails helloworldBean()
	{
		return new UserDetails ("bala","murugan","erode");
	}
}
