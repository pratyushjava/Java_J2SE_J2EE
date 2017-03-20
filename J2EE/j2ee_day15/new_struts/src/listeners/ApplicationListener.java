package listeners;

import java.util.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ApplicationListener implements ServletContextListener {
	public void contextInitialized(ServletContextEvent cse) {
		ServletContext servletContext=cse.getServletContext();
			// inits reqd for cust care center
		List<String> browsers = Arrays.asList("IE", "FireFox");
		servletContext.setAttribute("browsers", browsers);
		List<String> technologies = Arrays.asList("Java SE", "J2EE", ".NET",
				"XML");
		servletContext.setAttribute("technologies", technologies);
		HashMap<String, List<String>> states = new HashMap<String, List<String>>();
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Pune");
		l1.add("Mumbai");
		l1.add("Kolhapur");
		states.put("MH", l1);
		l1 = new ArrayList<String>();
		l1.add("Indore");
		l1.add("Bhopal");
		l1.add("Jabalpur");
		states.put("MP", l1);
		l1 = new ArrayList<String>();
		l1.add("Chennai");
		l1.add("Kanchipuram");
		states.put("TN", l1);
		servletContext.setAttribute("states", states);

		List<String> platforms = Arrays
				.asList("Win32", "Win64", "Mac", "Linux");
		servletContext.setAttribute("platforms",platforms);
		System.out.println("added pfs "+platforms);
	}

	public void contextDestroyed(ServletContextEvent cse) {
	}
}