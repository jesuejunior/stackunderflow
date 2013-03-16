package com.sixcodes.model;

@Entity
public class Answer {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dt_created;
	
	private String tx_answer;
	
	private boolean bl_favorite;
	
	private long question_id;
	
	private long user_id;

}
