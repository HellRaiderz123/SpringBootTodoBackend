package com.todo.pojo;

import java.util.ArrayList;

public class AppTodos {
	
	ArrayList<AppTodo> alTodoList = new ArrayList<AppTodo>();

	public ArrayList<AppTodo> getAlTodoList() {
		return alTodoList;
	}

	public void setAlTodoList(ArrayList<AppTodo> alTodoList) {
		this.alTodoList = alTodoList;
	}

	@Override
	public String toString() {
		return "AppTodos [alTodoList=" + alTodoList + "]";
	}

	public AppTodos() {
		super();
	}

	public AppTodos(ArrayList<AppTodo> alTodoList) {
		super();
		this.alTodoList = alTodoList;
	}
	
	

}
