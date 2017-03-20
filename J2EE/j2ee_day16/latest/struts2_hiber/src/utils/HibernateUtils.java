package utils;
import org.hibernate.*;
import org.hibernate.cfg.*;


public class HibernateUtils {
	private static SessionFactory factory;
	static {
		factory=new AnnotationConfiguration().configure().buildSessionFactory();
	}
	public static SessionFactory getFactory() {
		return factory;
	}
	public static Session getSession()
	{
		return factory.openSession();
	}
	

}
