package com.sixcodes.stack.model;

import javax.persistence.*;

@Entity
public class Grupo {

	@Id @GeneratedValue
	private long id;
	
	private String nm_group;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNm_group() {
		return nm_group;
	}

	public void setNm_group(String nm_group) {
		this.nm_group = nm_group;
	}
}
