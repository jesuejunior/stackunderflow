package com.sixcodes.model;

import javax.persistence.*;

@Entity
public class Group {

	@Id 
	@GeneratedValue
	private long id;
	
	private String nm_group;
}
