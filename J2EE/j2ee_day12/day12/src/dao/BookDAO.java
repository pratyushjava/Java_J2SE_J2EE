package dao;

import org.hibernate.*;
import pojos.BookPOJO;
import utils.HibernateUtils;
import java.util.*;

public class BookDAO {
	public BookPOJO addBook(BookPOJO b) throws Exception {
		Session hibSession = HibernateUtils.getSession();
		Transaction tx = null;
		try {
			tx = hibSession.beginTransaction();
			hibSession.save(b);
			tx.commit();
			return b;
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			if (hibSession != null)
				hibSession.close();
		}

	}
	
	@SuppressWarnings("unchecked")
	public List<BookPOJO> getBooks() throws Exception {
		Session hibSession = HibernateUtils.getSession();
		Transaction tx = null;
		try {
			tx = hibSession.beginTransaction();
			String hql = "from BookPOJO";
			List<BookPOJO> l1 = hibSession.createQuery(hql).list();
			tx.commit();
			return l1;
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			if (hibSession != null)
				hibSession.close();
		}

	}



	@SuppressWarnings("unchecked")
	public List<BookPOJO> getBooksByAuthor(String authorName) throws Exception {
		Session hibSession = HibernateUtils.getSession();
		Transaction tx = null;
		try {
			tx = hibSession.beginTransaction();
			String hql = "from BookPOJO where author = :auth";
			List<BookPOJO> l1 = hibSession.createQuery(hql)
					.setParameter("auth", authorName).list();
			tx.commit();
			return l1;
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			if (hibSession != null)
				hibSession.close();
		}

	}

	@SuppressWarnings({"unchecked" })
	public void deleteBooksByDate(Date d) throws Exception {
		// to discard books which are published
		// earlier than specified date
		Session hibSession = HibernateUtils.getSession();
		Transaction tx = null;
		System.out.println("date "+d);
		try {
			tx = hibSession.beginTransaction();
			String hql = "from BookPOJO b where b.publicationDate < :dt";
			List<BookPOJO> l1 = hibSession.createQuery(hql)
					.setParameter("dt",d).list();
			//l1 --- list of PERSISTENT BookPOJOs -- published
			//earlier than specified date.
			for (BookPOJO b : l1)
				hibSession.delete(b);
			tx.commit();

		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			if (hibSession != null)
				hibSession.close();
		}

	}
	@SuppressWarnings({"unchecked" })
	public void UpdateBooksByPrice(double priceLimit,double discPercent) throws Exception {
		// to apply specified disc on all books 
		//whose price > priceLimit
		Session hibSession = HibernateUtils.getSession();
		Transaction tx = null;

		try {
			tx = hibSession.beginTransaction();
			String hql = "from BookPOJO where price > :pr";
			List<BookPOJO> l1 = hibSession.createQuery(hql)
					.setParameter("pr",priceLimit).list();
			//l1 --- list of persistent BookPOJOs -- having price
			//more than limit
			for (BookPOJO b : l1) 
				b.setPrice(b.getPrice()*(100-discPercent)/100);
			
			tx.commit();

		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			
			if (hibSession != null)
				hibSession.close();
			
		
		}

	}


}
