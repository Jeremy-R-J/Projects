package com.over.it.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;



@Entity
@Table(name="users")
public class User {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 @Email(message="Must be a email!!")
 @Size(min = 3,  message="Use a better email, more than 3 characters!!")
 private String email;
 @Size(min = 3,  message="Use a better password!!")
 private String password;
 @Size(min = 1,  message="Enter a name")
 private String name;

 public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@OneToMany(mappedBy="assignee", fetch=FetchType.LAZY)
 private List<Task> assigendTasks;
 
 @OneToMany(mappedBy="creator", fetch=FetchType.LAZY)
 private List<Task> createdTask;
 
 @Transient
 private String passwordConfirmation;
  
 @Column(updatable=false)
 private Date createdAt;
 private Date updatedAt;

 public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public List<Task> getAssigendTasks() {
	return assigendTasks;
}
public void setAssigendTasks(List<Task> assigendTasks) {
	this.assigendTasks = assigendTasks;
}
public List<Task> getCreatedTask() {
	return createdTask;
}
public void setCreatedTask(List<Task> createdTask) {
	this.createdTask = createdTask;
}
public String getPasswordConfirmation() {
	return passwordConfirmation;
}
public void setPasswordConfirmation(String passwordConfirmation) {
	this.passwordConfirmation = passwordConfirmation;
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
public User() {
	
}

}