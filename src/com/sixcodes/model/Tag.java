package com.sixcodes.model;

import javax.persistence.*;

@Entity
public class Tag {

	@Id	@GeneratedValue
	private long id;
	
	private String nm_tag;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNm_tag() {
		return nm_tag;
	}

	public void setNm_tag(String nm_tag) {
		this.nm_tag = nm_tag;
	}
}
