package dao;


import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.*;
import listeners.*;
import utils.*;

public class ContactManager {

	public Contact add(Contact contact) throws Exception{
		Session session = HibernateUtils.getSession();
		Transaction tx=session.beginTransaction();
		try {
		
		session.save(contact);
		tx.commit();
		return contact;
		} catch (Exception e) {
			tx.rollback();
			throw e;
		}
		finally {
			if (session != null)
				session.clear();
		}
	}
	public Contact delete(int id) throws Exception{
		Session session = HibernateUtils.getSession();
		Transaction tx=session.beginTransaction();
		try {
		Contact contact = (Contact) session.get(Contact.class, id);
		System.out.println("delete id= "+id);
		if(contact != null) {
			session.delete(contact);
			System.out.println("after del ");
		}
		tx.commit();
		return contact;
		} catch (Exception e) {
			tx.rollback();
			throw e;
		}
			
		finally {
			if (session != null)
				session.close();
		}
	}

	public List<Contact> list() throws Exception{
		
		Session session = HibernateUtils.getSession();
		Transaction tx=session.beginTransaction();
		List<Contact> contacts = null;
		try {
			
			contacts = (List<Contact>)session.createQuery("from Contact").list();
			tx.commit();
			return contacts;
			
		} catch (Exception e) {
			tx.rollback();
			throw e;
		} 
		finally {
			if (session != null)
				session.close();
		}
		
		}
}
