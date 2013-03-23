package tests.com.sixcodes.stack.model;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Assert;
import org.junit.Test;

import com.sixcodes.stack.model.Question;
import com.sixcodes.stack.util.HibernateUtil;


public class QuestionModelTest {

	@Test
	public void test() {
		
		Question question = new Question();
		question.setTx_question("Who is legendary?");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(question);
		tx.commit();
		
		Question dbUser = (Question) session.get(Question.class, question.getId());
		Assert.assertEquals("Who is legendary?", dbUser.getTx_question());
		
		
	}

}
