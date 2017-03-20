package utils;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.service.*;

public class HibernateUtils {
	private static SessionFactory factory;
	private static Session session;
	static {
		System.out.println("in static init block");
		// create empty cfg & configure it
		Configuration cfg = new Configuration().configure();
		// create reg
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(
				cfg.getProperties()).buildServiceRegistry();
		//attach singleton immutable sf inst to the cfg obj.
		factory=cfg.buildSessionFactory(reg);
	}

	public static SessionFactory getFactory() {
		return factory;
	}

	public static Session getSession() {
		return factory.openSession();
	}

}
