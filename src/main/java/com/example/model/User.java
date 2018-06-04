package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long user_id;
	private String name;
	private String surNmae;
	
	public User() {
		
	}
	public User( String name, String surNmae) {
		
		this.name = name;
		this.surNmae = surNmae;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurNmae() {
		return surNmae;
	}
	public void setSurNmae(String surNmae) {
		this.surNmae = surNmae;
	}
	

}
