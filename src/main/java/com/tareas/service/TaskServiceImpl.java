package com.tareas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tareas.entity.Task;
import com.tareas.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	public TaskRepository repository;

	@Override
	public Task addTaks(Task task) {
		return repository.save(task);
	}

	@Override
	public List<Task> getTasks() {
		return repository.findAll();
	}

	@Override
	public void deleteTask(Long idtask) {
		repository.deleteById(idtask);
	}

	@Override
	public Task findByidtask(Long idtask) {
		return repository.findByidtask(idtask);
	}
	
	
}
