package listeners;

import java.util.HashMap;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import pojos.UserPOJO;

/**
 * Application Lifecycle Listener implementation class MyCtxListener
 * 
 */
@WebListener
public class MyCtxListener implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public MyCtxListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent arg0) {
		HashMap<Integer, UserPOJO> users = new HashMap<>();
		UserPOJO[] u = { new UserPOJO(1, "aa", 100),
				new UserPOJO(2, "bb", 200), new UserPOJO(10, "cc", 300) };
		for (UserPOJO u1 : u)
			users.put(u1.getId(), u1);
		arg0.getServletContext().setAttribute("user_list", users);
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	}

}
