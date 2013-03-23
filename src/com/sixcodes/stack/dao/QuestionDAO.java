package com.sixcodes.stack.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;

import com.sixcodes.stack.model.Question;
import com.sixcodes.stack.model.Usuario;
import com.sixcodes.stack.util.HibernateUtil;

@Component
public class QuestionDAO {
	
	private final Session session;
	
	public QuestionDAO() {
		this.session = HibernateUtil.getSessionFactory().openSession();
	}
	
	public void save(Question question) {
		Transaction tx = session.beginTransaction();
		this.session.save(question);
		tx.commit();
	}
	
	public void update(Question question) {
		Transaction tx = session.beginTransaction();
		this.session.update(question);
		tx.commit();
	}
	
	public List<Question> allQuestions(){
		return this.session.createCriteria(Question.class).list();
	}
	
	public void edit(Question question) {
		Transaction tx = session.beginTransaction();
		this.session.update(question);
		tx.commit();
		
	}

	public void remove(Question question) {
		Transaction tx = session.beginTransaction();
		this.session.delete(question);
		tx.commit();
		
	}

	public Question load(Long id){
		return (Question) this.session.load(Question.class, id);
	}
}
