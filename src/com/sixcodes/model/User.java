package com.sixcodes.model;

import javax.persistence.*;

@Entity
public class User {

	@Id
	@GeneratedValue
	private long id;
	
	private String firstname;
	
	private String lastname;
	
	@Column(unique=true)
	private String username;
	
	private String password;
	
	@Column(unique=true)
	private String email;
}
