package utils;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.service.*;

public class HibernateUtils {
	private static SessionFactory sf;
	
	static {
		System.out.println("in static init block");
		Configuration cfg = new Configuration().configure();// populated cfg
															// inst
		// create service reg inst --- from reg builder by attaching map of
		// props.
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(
				cfg.getProperties()).buildServiceRegistry();
		sf=cfg.buildSessionFactory(reg);

	}
	public static SessionFactory getSf() {
		return sf;
	}
	public static Session getSession() {
		return sf.openSession();
	}
	

}
