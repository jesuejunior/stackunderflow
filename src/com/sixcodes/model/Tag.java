package com.sixcodes.model;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private long id;
	
	private String nm_tag;
}
