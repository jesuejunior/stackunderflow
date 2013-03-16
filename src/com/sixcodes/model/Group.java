package com.sixcodes.model;

@Entity
public class Group {

	@Id 
	@GeneratedValue
	private long id;
	
	private String nm_group;
}
