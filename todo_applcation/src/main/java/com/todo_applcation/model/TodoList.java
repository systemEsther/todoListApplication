package com.todo_applcation.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="todo_list")
@Entity
@Data
@NoArgsConstructor
public class TodoList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String discription;
	@CreationTimestamp
	private Date createdDate;
	@CreationTimestamp
	private Date modifiedDate;
	private String createdBy;
	private String modifiedBy;
	@Column(name = "est_time_com", nullable = false)
	private String estimatedTimeCompletion;
	
	

}
