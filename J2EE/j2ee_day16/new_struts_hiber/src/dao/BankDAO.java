package dao;

import org.hibernate.*;

import pojos.BankAccount;
import pojos.BankUser;
import utils.HibernateUtils;
import java.util.*;

public class BankDAO {
	public BankUser validateUser(String name, String pass) throws Exception {
		Session hibSession = HibernateUtils.getSession();
		Transaction tx = null;
		try {
			tx = hibSession.beginTransaction();
			String hql = "from BankUser b where b.name = :nm and b.password = :pass";
			BankUser b = (BankUser) hibSession.createQuery(hql)
					.setParameter("nm", name).setParameter("pass", pass)
					.uniqueResult();
			if (b != null) {
				List<BankAccount> l1 = b.getAccts();
				//Change fetch type from lazy to eager & observe.
				System.out.println("in dao b=" + b + " " + l1);
			}
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

	public List<BankAccount> createAccount(int userId, BankAccount ac)
			throws Exception {
		Session hibSession = HibernateUtils.getSession();
		Transaction tx = null;
		try {
			tx = hibSession.beginTransaction();
			BankUser u = (BankUser) hibSession.get(BankUser.class, userId);
	//		System.out.println("uploaded user " + u + "  " + u.getAccts());// persistent
			ac.setBankUser(u);// ac still transient
			hibSession.save(ac);// ac persistent
			u.getAccts().add(ac);
			List<BankAccount> l1 = u.getAccts();
			System.out.println("acct list " + l1);
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

}
