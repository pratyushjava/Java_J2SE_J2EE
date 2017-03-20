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
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0) {
        sf=HibernateUtils.getFactory();
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        if (sf != null)
        	sf.close();
    }
	
}
