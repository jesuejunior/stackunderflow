package com.sixcodes.model;

import javax.persistence.*;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private long id;
	
	private String nm_tag;
}
