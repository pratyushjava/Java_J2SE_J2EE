package listeners;

import java.util.HashMap;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class CountryAddListener
 *
 */
public class CountryAddListener implements ServletContextListener {

   
	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0) {
    	HashMap<String,HashMap<Integer,String>> countries=new HashMap<String,HashMap<Integer,String>>();
    	HashMap<Integer,String> hm1=new HashMap<Integer, String>();
    	hm1.put(101,"MH");
    	hm1.put(102,"DE");
    	hm1.put(103,"TN");
    	countries.put("India",hm1);
    	
    	hm1.clear();
    	hm1.put(101,"MH1");
    	hm1.put(102,"DE1");
    	hm1.put(103,"TN1");
    	countries.put("Spain",hm1);
    	hm1.clear();
    	hm1.put(101,"MH2");
    	hm1.put(102,"DE2");
    	hm1.put(103,"TN2");
    	countries.put("USA",hm1);
    
    	arg0.getServletContext().setAttribute("countries",countries);
    	
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }
	
}
