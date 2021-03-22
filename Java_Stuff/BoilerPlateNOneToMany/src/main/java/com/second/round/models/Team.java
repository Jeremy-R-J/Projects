package com.second.round.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;


import javax.validation.constraints.Size;

//imports removed for brevity
@Entity
@Table(name="teams")
public class Team {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

@Size(min = 1,  message="Use a better Name, more than 1 characters!!")
private String name;
@OneToMany(mappedBy="currentTeam",fetch=FetchType.LAZY)
private List<User>members;

@Column(updatable=false)
private Date createdAt;
private Date updatedAt;

@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name="captain_id")
private User captain;

public User getCaptain() {
	return captain;
}


public void setCaptain(User captain) {
	this.captain = captain;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public List<User> getMembers() {
	return members;
}


public void setMembers(List<User> members) {
	this.members = members;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
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


public Team() {
}


// other getters and setters removed for brevity
@PrePersist
protected void onCreate(){
   this.createdAt = new Date();
}
@PreUpdate
protected void onUpdate(){
   this.updatedAt = new Date();
}
}