package liseners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import utils.HibernateUtils;

/**
 * Application Lifecycle Listener implementation class HibernateCtxListener
 *
 */
@WebListener
public class HibernateCtxListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public HibernateCtxListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce) {
       System.out.println("in ctx inited ");
       //load hib frmwork --- sf rdy
       HibernateUtils.getSf();
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce) {
       System.out.println("ctx destroyed");
       HibernateUtils.getSf().close();
       
    }
	
}
