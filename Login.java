package com.Guesthub.GuestHub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Login {
	@Id
	private int id;
	private String Username;
	private String Password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Login [id=" + id + ", Username=" + Username + ", Password=" + Password + "]";
	}
	public Login(int id, String username, String password) {
		super();
		this.id = id;
		Username = username;
		Password = password;
	}
	public Login() {
		super();
	}
	
}
