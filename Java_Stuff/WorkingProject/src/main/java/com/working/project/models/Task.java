package com.working.project.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;



@Entity
@Table(name="tasks")
public class Task {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min=5, max=255, message="Please have a 5-255 character title for your task!")
    private String title;
	@Size(min=5, max=255, message="Please have a 5-255 character title for your Description!")
    private String desc;

	public Task() {
	}
	
	
}
