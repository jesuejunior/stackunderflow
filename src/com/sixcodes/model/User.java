package com.sixcodes.model;

@Entity
public class User {

	@Id
	@GeneratedValue
	private long id;
	
	private String firstname;
	
	private String lastname;
	
	@Column(unique=True)
	private String username;
	
	private String password;
	
	@Cloumn(unque=True)
	private String email;
}
