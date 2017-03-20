package listeners;

import java.util.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ApplicationListener implements ServletContextListener {
	public void contextInitialized(ServletContextEvent cse) {
		/*HashMap<String, ArrayList<String>> countries = new HashMap<String, ArrayList<String>>();
		ArrayList<String> hm1 = new ArrayList<String>();
		hm1.add("MH");
		hm1.add("DE");
		hm1.add("TN");
		countries.put("India", hm1);

		hm1.clear();
		hm1.add("MH1");
		hm1.add("DE1");
		hm1.add("TN1");

		countries.put("Spain", hm1);
		hm1.clear();
		hm1.add("MH2");
		hm1.add("DE2");
		hm1.add("TN2");

		countries.put("USA", hm1);*/

		ServletContext servletContext = cse.getServletContext();
		
		/*servletContext.setAttribute("countries", countries);
		System.out.println("in ctx init "
				+ servletContext.getAttribute("countries"));*/
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