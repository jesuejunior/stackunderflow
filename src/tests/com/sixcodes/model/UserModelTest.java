package com.sixcodes.model;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.sixcodes.db.HibernateUtil;
import com.sixcodes.model.User;

import org.junit.Assert;

public class UserModelTest {

	@Test
	public void test() {
		
		User user = new User();
		user.setFirstname("Dalton");
		user.setLastname("Barreto");
		
		/* save user */
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		
		/*Retrieve from DB*/
		
		User dbUser = (User) session.get(User.class, user.getId());
		Assert.assertEquals("Dalton", dbUser.getFirstname());
		Assert.assertEquals("Barreto", dbUser.getLastname());
		
		
	}

}
