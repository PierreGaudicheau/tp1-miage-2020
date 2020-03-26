package com.acme.todolist.application.service;

import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.acme.todolist.application.port.out.UpdateTodoItem;
import com.acme.todolist.domain.TodoItem;

@Service
public class PostTodoItemsService {
	private UpdateTodoItem updateTodoItem;
	
	@Inject
	public PostTodoItemsService(UpdateTodoItem updateTodoItem) {
		this.updateTodoItem = updateTodoItem;
	}
	
	public void createTodoItem(TodoItem todoItem) {
		this.updateTodoItem.storeNewTodoItem(todoItem);;
	}
}
