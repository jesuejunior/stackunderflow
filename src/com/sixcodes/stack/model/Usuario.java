package com.sixcodes.stack.model;

import javax.persistence.*;
import org.hibernate.validator.*;



@Entity
public class Usuario {

	@Id	@GeneratedValue
	private Long id;
	
	private String firstname;
	private String lastname;
	
	@Column(unique=true)
	@Length(min=6)
	private String username;
	
	@Length(min=6)
	private String password;
	
	@Column(unique=true)
	@Email
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
