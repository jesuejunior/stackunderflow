package com.sixcodes.model;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Question {

	@Id	@GeneratedValue
	private long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dt_created;
	
	private String tx_question;
	
	private long user_id_created;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDt_created() {
		return dt_created;
	}

	public void setDt_created(Date dt_created) {
		this.dt_created = dt_created;
	}

	public String getTx_question() {
		return tx_question;
	}

	public void setTx_question(String tx_question) {
		this.tx_question = tx_question;
	}

	public long getUser_id_created() {
		return user_id_created;
	}

	public void setUser_id_created(long user_id_created) {
		this.user_id_created = user_id_created;
	}
	
}
