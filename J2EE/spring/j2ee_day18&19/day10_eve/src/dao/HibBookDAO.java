package dao;

import java.util.Date;
import java.util.List;

import org.hibernate.*;

import pojos.BookPOJO;
import utils.HibernateUtils;

public class HibBookDAO {
	public int addBook(BookPOJO b) throws Exception {
		Session session = null;
		Transaction tx = null;
		int id = -1;
		try {
			session = HibernateUtils.getSession();
			tx = session.beginTransaction();
			id = (Integer) session.save(b);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw e;
		} finally {
			if (session != null)
				session.close();
		}
		return id;

	}

	@SuppressWarnings("unchecked")
	public List<BookPOJO> getBooksByAuthor(String author) throws Exception {
		Session session = null;
		Transaction tx = null;
		List<BookPOJO> l1 = null;
		try {
			session = HibernateUtils.getSession();
			tx = session.beginTransaction();
			l1 = session.createQuery("from BookPOJO b where b.author = :auth")
					.setParameter("auth", author).list();
			System.out.println("list from dao within sess " + l1);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw e;
		} finally {
			if (session != null)
				session.close();
		}
		System.out.println("list from dao outside  sess " + l1);
		return l1;

	}
	@SuppressWarnings("unchecked")
	public String  deleteBooksByAuthorNDate(String author,Date pubDate) throws Exception {
		Session session = null;
		Transaction tx = null;
		List<BookPOJO> l1 = null;
		String sts="failed";
		try {
			session = HibernateUtils.getSession();
			tx = session.beginTransaction();
			l1 = session.createQuery("from BookPOJO b where b.author = :auth and b.publishDate < :dt")
					.setParameter("auth", author).setParameter("dt", pubDate).list();
			System.out.println("list1 from dao within sess " + l1);
			for(BookPOJO b : l1)
				session.delete(b);
					sts="success";
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw e;
		} finally {
			if (session != null)
				session.close();
		}
//		System.out.println("list1 from dao outside  sess " + l1);
		return sts;

	}


}
