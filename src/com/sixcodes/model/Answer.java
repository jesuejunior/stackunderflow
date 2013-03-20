package com.sixcodes.model;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Answer {
	
	@Id	@GeneratedValue
	private long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dt_created;
	
	private String tx_answer;
	
	private boolean bl_favorite;
	
	private long question_id;
	
	private long user_id;

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

	public String getTx_answer() {
		return tx_answer;
	}

	public void setTx_answer(String tx_answer) {
		this.tx_answer = tx_answer;
	}

	public boolean isBl_favorite() {
		return bl_favorite;
	}

	public void setBl_favorite(boolean bl_favorite) {
		this.bl_favorite = bl_favorite;
	}

	public long getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(long question_id) {
		this.question_id = question_id;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

}
