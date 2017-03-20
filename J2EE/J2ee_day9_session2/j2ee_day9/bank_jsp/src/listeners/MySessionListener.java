package listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import beans.BankBean;

/**
 * Application Lifecycle Listener implementation class MySessionListener
 *
 */
//@WebListener
public class MySessionListener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public MySessionListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0) {
        System.out.println("sess created...");
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0) {
        System.out.println("in sess destoyed....");
        //HSE --- HS
        HttpSession hs=arg0.getSession();
        //HS --- Bean ref
        BankBean ref=(BankBean) hs.getAttribute("bank_user");
        if (ref != null) {
         //invoke method of JB to release resources.
        	try {
				ref.logout();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    	
    }
	
}
