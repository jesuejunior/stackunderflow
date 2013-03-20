package tests.com.sixcodes.stack.model;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.sixcodes.stack.model.Usuario;
import com.sixcodes.stack.util.HibernateUtil;

import org.junit.Assert;

public class UserModelTest {

	@Test
	public void test() {
		
		Usuario user = new Usuario();
		user.setFirstname("Dalton");
		user.setLastname("Barreto");
		
		/* save user */
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		
		/*Retrieve from DB*/
		
		Usuario dbUser = (Usuario) session.get(Usuario.class, user.getId());
		Assert.assertEquals("Dalton", dbUser.getFirstname());
		Assert.assertEquals("Barreto", dbUser.getLastname());
		
		
	}

}
