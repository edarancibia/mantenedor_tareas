package com.tareas.entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tasks")
public class Task {

	@Id
	@Column(name = "idtask")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idtask;
	
	@NotNull
	private String description;
	
	@NotNull
	private String creationdate;
	
	@NotNull
	private boolean vigent;

	public Long getIdtask() {
		return idtask;
	}

	public void setIdtask(Long idtask) {
		this.idtask = idtask;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(String creationdate) {
		this.creationdate = creationdate;
	}

	public boolean isVigent() {
		return vigent;
	}

	public void setVigent(boolean vigent) {
		this.vigent = vigent;
	}

	public Task(Long idtask, String description, String creationdate, boolean vigent) {
		this.idtask = idtask;
		this.description = description;
		this.creationdate = creationdate;
		this.vigent = vigent;
	}

	public Task() {
		
	}
	
	
}
