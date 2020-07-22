package com.todo.app;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoResource {
	
	//@GetMapping(path="/hello")
	@RequestMapping(
			method=RequestMethod.GET, 
			path="/hello/{name}")
	public String getHelloWorld(@PathVariable("name") String strName) {
		return "Hello " + strName;
	}

}
