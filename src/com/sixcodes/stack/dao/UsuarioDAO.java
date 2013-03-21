package com.sixcodes.stack.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;

import com.sixcodes.stack.model.Usuario;
import com.sixcodes.stack.util.HibernateUtil;

@Component
public class UsuarioDAO {
	
	private final Session session;
	
	public UsuarioDAO(){
		this.session = HibernateUtil.getSessionFactory().openSession();
	}

	public void save(Usuario user) {
		Transaction tx = session.beginTransaction();
		this.session.save(user);
		tx.commit();
	}
	
	
	public void update(Usuario user) {
		Transaction tx = session.beginTransaction();
		this.session.update(user);
		tx.commit();
	}
	
	public List<Usuario> allUsers(){
		return this.session.createCriteria(Usuario.class).list();
	}

}
