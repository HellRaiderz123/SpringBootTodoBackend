package com.todo.app.auth.endpoints;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class TodoBasicAuthEndpoint {
	
	@RequestMapping(path="/basic-auth", method=RequestMethod.GET)
	public BasicAuthBean basicAuth() {
		BasicAuthBean objBasicAuthBean = new BasicAuthBean("Successfully Logged in!!!");
		return objBasicAuthBean;
	}

}

class BasicAuthBean {
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String message;

	public BasicAuthBean(String message) {
		super();
		this.message = message;
	}

	public BasicAuthBean() {
		super();
	}
	
	
}
