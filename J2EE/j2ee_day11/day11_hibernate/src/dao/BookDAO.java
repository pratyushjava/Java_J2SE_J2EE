package dao;
import org.hibernate.*;

import pojos.BookDatePOJO;
import utils.HibernateUtils;


public class BookDAO {
	//DAL -- CRUD --- create
	public BookDatePOJO addBook(BookDatePOJO b) throws Exception
	{
		Session sess=null;
		Transaction tx=null;
		try {
			sess=HibernateUtils.getSess();
			tx=sess.beginTransaction();
			//save 
			sess.save(b);
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			if (sess != null)
				sess.close();
		}
		return b;
	}

}
