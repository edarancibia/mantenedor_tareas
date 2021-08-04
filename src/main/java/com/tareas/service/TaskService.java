package com.tareas.service;

import java.util.List;

import com.tareas.entity.Task;

public interface TaskService {

	public abstract Task addTaks(Task task);
	
	public abstract Task findByidtask(Long idtask);
	
	public abstract List<Task> getTasks();
	
	void deleteTask(Long idtask);
}
