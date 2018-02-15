package com.x.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity(name="user")
public class User extends BaseEntity{

	@Column(name = "name", nullable = false)
	String name;
	@Column(name = "email", nullable = false)
	String email;
	
	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	public User() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + "]";
	}
}