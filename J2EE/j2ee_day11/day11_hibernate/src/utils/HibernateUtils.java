package utils;

import org.hibernate.*;
import org.hibernate.service.*;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory sf;
	private static Session sess;
	static {
		Configuration cfg = new Configuration().configure();
		ServiceRegistry ref = new ServiceRegistryBuilder().applySettings(
				cfg.getProperties()).buildServiceRegistry();
		sf=cfg.buildSessionFactory(ref);
	}

	public static SessionFactory getSf() {
		return sf;
	}

	public static Session getSess() {
		return sf.openSession();
	}

}
