package com.sixcodes.stack.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;

import com.sixcodes.stack.model.Usuario;
import com.sixcodes.stack.util.HibernateUtil;


@Component
public class UsuarioDAO {
	
	private final Session session;
	
	public UsuarioDAO(){
		this.session = HibernateUtil.getSessionFactory().openSession();
	}
	
	public boolean existeUsuario(Usuario usuario) {
        Usuario encontrado = (Usuario) session.createCriteria(Usuario.class).add(Restrictions.eq("username", usuario.getUsername())).uniqueResult();
        return encontrado != null;
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

	public void edit(Usuario usuario) {
		Transaction tx = session.beginTransaction();
		this.session.update(usuario);
		tx.commit();
		
	}

	public void remove(Usuario usuario) {
		Transaction tx = session.beginTransaction();
		this.session.delete(usuario);
		tx.commit();
		
	}
	
	public Usuario getUsuarioLogin(Usuario usuario){
		return (Usuario) session.createCriteria(Usuario.class).add(Restrictions.eq("username", usuario.getUsername())).add(Restrictions.eq("password", usuario.getPassword())).uniqueResult();
	}

	public Usuario load(Long id){
		return (Usuario) this.session.load(Usuario.class, id);
	}

}
