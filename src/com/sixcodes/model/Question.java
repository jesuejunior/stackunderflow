package com.sixcodes.model;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Question {

	@Id
	@GeneratedValue
	private long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dt_created;
	
	private String tx_question;
	
	private long user_id_created;
	
}
