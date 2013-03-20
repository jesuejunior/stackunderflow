import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sixcodes.stack.db.HibernateUtil;
import com.sixcodes.stack.model.Question;
import com.sixcodes.stack.model.User;


public class Start {
	public static void main(String[] args) {
		
		Date date = new Date();
		Question question = new Question();
		
		question.setUser_id_created(1);
		question.setTx_question("Teste de conexao 2");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(question);
		tx.commit();
		
		
		User dbUser = (User) session.get(User.class, question.getId());
		System.out.println(dbUser);
	}

}
