package dao;

import org.hibernate.*;

import pojos.UserPOJO;
import utils.HibernateUtils;

public class UserDAO {
	public UserPOJO validateUser(String em, String ps) throws Exception {
		System.out.println("in dao -- " + em + " " + ps);
		Session hs = HibernateUtils.getSession();
		Transaction tx = null;
		try {
			tx = hs.beginTransaction();
			String hql = "from UserPOJO u where u.email = :p1 and u.pass = :p2";
			UserPOJO u = (UserPOJO) hs.createQuery(hql).setParameter("p1", em)
					.setParameter("p2", ps).uniqueResult();
			System.out.println("query reted " + u);
			tx.commit();
			return u;
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;

		} finally {
			if (hs != null)
				hs.close();
		}

	}

}
