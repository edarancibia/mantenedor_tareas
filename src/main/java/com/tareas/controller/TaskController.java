package com.tareas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tareas.entity.Task;
import com.tareas.service.TaskServiceImpl;

@RestController
@RequestMapping("tasks")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT, RequestMethod.DELETE})
public class TaskController {

	@Autowired
	public TaskServiceImpl service;
	
	@PostMapping("/add")
	public ResponseEntity<?> addTask(@RequestBody Task task){
		Task newTask = service.addTaks(task);
		return new ResponseEntity<Task>(newTask,HttpStatus.OK);
	}
	
	@GetMapping("/list")
	public @ResponseBody List<Task> getTasks(){
		List<Task> tasks = service.getTasks();
		return tasks;
	}
	
	@PutMapping("/edit/{idtask}")
	public ResponseEntity<?> editTask(@PathVariable int idtask, @RequestBody Task task){
		Long id = Long.valueOf(idtask);
		Task taskDb = service.findByidtask(id);
		taskDb.setDescription(task.getDescription());
		taskDb.setCreationdate(task.getCreationdate());
		taskDb.setVigent(task.isVigent());
		service.addTaks(taskDb);
		return new ResponseEntity<Task>(taskDb,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/{idtask}")
	public ResponseEntity<?> deleteTask(@PathVariable int idtask){
		Long id = Long.valueOf(idtask);
		service.deleteTask(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}
	
}
