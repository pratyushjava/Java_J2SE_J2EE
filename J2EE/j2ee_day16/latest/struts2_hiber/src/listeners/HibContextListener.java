package listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.hibernate.SessionFactory;

import utils.HibernateUtils;

/**
 * Application Lifecycle Listener implementation class HibContextListener
 *
 */
public class HibContextListener implements ServletContextListener {
private SessionFactory sf;
    /**
     * Default constructor. 
     */
    public HibContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0) {
        System.out.println("ctx inited");
        sf=HibernateUtils.getFactory();
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
    	System.out.println("ctx ended");
    	sf.close();
    }
	
}
