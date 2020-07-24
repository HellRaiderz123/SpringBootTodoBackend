package com.todo.pojo;

public class HelloWorld {
	
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorld [message=" + message + "]";
	}

	public HelloWorld(String message) {
		super();
		this.message = message;
	}

	public HelloWorld() {
		super();
	}
}
