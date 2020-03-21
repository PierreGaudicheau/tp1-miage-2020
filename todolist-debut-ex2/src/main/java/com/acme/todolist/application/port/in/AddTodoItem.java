package com.acme.todolist.application.port.in;

import com.acme.todolist.domain.TodoItem;

public interface AddTodoItem {
	/**
	 * Permet d'ajouter un item dans la liste avec
	 * @param "item" l'item qu'on veut ajouter
	 */
	void addTodoItem(TodoItem item);
}
