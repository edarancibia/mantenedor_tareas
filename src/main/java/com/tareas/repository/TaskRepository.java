package com.tareas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tareas.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

	public abstract Task findByidtask(Long idtask);
	
	public abstract Task deleteByidtask(Long idtask);
}
