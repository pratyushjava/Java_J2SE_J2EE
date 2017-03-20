package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.*;

public class HibernateUtils {
	private static SessionFactory factory;//single inst of SF will 
	//be created & used thro out web application
	//used as --- Hib session provider --- SF will be attached
	//hib config inst.
	//creating config inst, reg inst  & attaching SF ---
	//EXTREMELY time consuming.  -- so ctx listener will invoke this static init block @ ctx loading time itself.
	
	static {
		System.out.println("in static init block");
		Configuration cfg=new Configuration().configure();
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		factory=cfg.buildSessionFactory(reg);
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
