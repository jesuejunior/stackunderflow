package com.sixcodes.stack.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sixcodes.stack.model.Usuario;
import com.sixcodes.stack.util.HibernateUtil;

public class UsuarioDAO {
	
	private final Session session;
	
	public UsuarioDAO(){
		this.session = HibernateUtil.getSessionFactory().openSession();
	}

	public void save(Usuario user) {
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
	}
	
	public List<Usuario> allUsers(){
		return this.session.createCriteria(Usuario.class).list();
	}

}
