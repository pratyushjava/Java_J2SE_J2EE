package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtils {
	private static SessionFactory factory;//single inst of SF will 
	//be created & used thro out web application
	//used as --- Hib session provider --- SF will be attached
	//hib config inst.
	//creating config inst & attaching SF ---
	//EXTREMELY time consuming. 
	
	static {
		System.out.println("in static init block");
		factory=new AnnotationConfiguration().configure().buildSessionFactory();
	}
	public static SessionFactory getFactory() {
		return factory;
	}
	public static Session getSession()
	{
		//sf creates new session inst(wrapper around ppoled out
		//db conn ) rets the new session inst to the caller.
		return factory.openSession();
	}
	

}
