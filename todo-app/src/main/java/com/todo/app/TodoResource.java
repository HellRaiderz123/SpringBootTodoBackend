package com.todo.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.todo.pojo.AppTodo;
import com.todo.pojo.AppTodos;
import com.todo.pojo.HelloWorld;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class TodoResource {
	
	static ArrayList<AppTodo> alTodoList = new ArrayList<AppTodo>();
	
	public TodoResource() {
		alTodoList.add(new AppTodo(1,"Buy Vegies",new Date(),false));
		alTodoList.add(new AppTodo(2,"Dance",new Date(),true));
		alTodoList.add(new AppTodo(3,"Visit India",new Date(),false));
		alTodoList.add(new AppTodo(4,"Visit America",new Date(),true));
		
	}
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-YYYY");
	
	//@GetMapping(path="/hello")
	@RequestMapping(method=RequestMethod.GET, path="/hello/{name}")
	public HelloWorld getHelloWorld(@PathVariable("name") String strName) {
		HelloWorld objHelloWorld = new HelloWorld("Hello and Welcome " + strName);
		return objHelloWorld;
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/todos")
	public AppTodos getTodos() {
		AppTodos objAppTodos = new AppTodos();
		objAppTodos.setAlTodoList(alTodoList);
		return objAppTodos;
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/todo/{id}")
	public ResponseEntity<Object> getTodoById(@PathVariable("id") int id) throws ParseException {
		for(AppTodo objAppTodo : alTodoList) {
			if(objAppTodo.getId()==id) {
				return ResponseEntity.ok(objAppTodo);
			}
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@RequestMapping(method=RequestMethod.POST, path="/todo/update")
	public ResponseEntity<Object> updateTodoById(@RequestBody AppTodo objAppTodo) throws ParseException {
		System.out.println(objAppTodo.toString());
		for(AppTodo todo : alTodoList) {
			if(todo.getId()==objAppTodo.getId()) {
				alTodoList.remove(todo);
				alTodoList.add(objAppTodo);
				return ResponseEntity.ok(objAppTodo);
			}
		}
		return ResponseEntity.notFound().build();	
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE, path="todo/delete/{id}")
	public ResponseEntity<Void> deleteTodoId(@PathVariable("id") int id) {
		for(AppTodo objTodo : alTodoList) {
			if(objTodo.getId()==id) {
				alTodoList.remove(objTodo);
				return ResponseEntity.noContent().build();
			}
		}
		return ResponseEntity.notFound().build();
	}

	@RequestMapping(method=RequestMethod.POST, path="/todo/insert")
	public ResponseEntity<Object> insertTodo(@RequestBody AppTodo objAppTodo) throws ParseException {
		System.out.println(objAppTodo.toString());
		objAppTodo.setId(5);
		alTodoList.add(objAppTodo);
		return ResponseEntity.ok(objAppTodo);
	}
}
