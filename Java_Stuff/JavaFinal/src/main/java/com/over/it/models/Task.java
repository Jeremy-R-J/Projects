package com.over.it.models;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="tasks")
public class Task {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;

 @Size(min = 3,  message="Use a better name, more than 3 characters!!")
 private String name;

 private String priority;
 @ManyToOne
 @JoinColumn(name="assignee_id")
 private User assignee;
 
 @ManyToOne(fetch= FetchType.LAZY)
 @JoinColumn(name="creator_id")
 private User creator;
 
 
 @Column(updatable=false)
 @DateTimeFormat(pattern="yyyy-MM-dd")
 private Date createdAt;
 public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@DateTimeFormat(pattern="yyyy-MM-dd")
 private Date updatedAt;

 public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getnName() {
	return name;
}
public void setname(String name) {
	this.name = name;
}
public String getPriority() {
	return priority;
}
public void setPriority(String priority) {
	this.priority = priority;
}
public User getAssignee() {
	return assignee;
}
public void setAssignee(User assignee) {
	this.assignee = assignee;
}
public User getCreator() {
	return creator;
}
public void setCreator(User creator) {
	this.creator = creator;
}
public Date getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}
public Date getUpdatedAt() {
	return updatedAt;
}
public void setUpdatedAt(Date updatedAt) {
	this.updatedAt = updatedAt;
}
 
public Task() {
    
}






}