package filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import java.util.*;

/**
 * Servlet Filter implementation class SessionCheckFilter
 */
public class SessionCheckFilter implements Filter {
	// private ArrayList<String> urlList;
	String urls;

	// private int total;
	/**
	 * Default constructor.
	 */
	public SessionCheckFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse rs = (HttpServletResponse) response;
		rs.setHeader("Cache-Control", "no-cache"); // Forces caches to obtain a
													// new copy of the page from
													// the origin server
		rs.setHeader("Cache-Control", "no-store"); // Directs caches not to
													// store the page under any
													// circumstance
		rs.setDateHeader("Expires", 0); // Causes the proxy cache to see the
										// page as "stale"
		rs.setHeader("Pragma", "no-cache"); // HTTP 1.0 backward compatibility

		String url = req.getServletPath().substring(1);
		// System.out.println("filter urls "+urls+"  url "+url);
		// try {
		if (!urls.contains(url)) {

			HttpSession session = req.getSession(false);
			// System.out.println(" sess"+session);
			if (session == null) {
				// if(req.getRequestedSessionId() == null ||
				// req.isRequestedSessionIdValid())
				rs.sendRedirect("/my_bank/bank_login.jsp");
				// was giving illegalstateexc. without return stmt , as after
				// sendRedirect it was still going to chain.doFilter.
				return;
			}
		}/*
		 * } catch(Exception e) { System.out.println("filter err"); }
		 */
		// pass the request along the filter chain
		chain.doFilter(request, response);
		System.out.println("post filter uri" + req.getServletPath());
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig config) throws ServletException {
		urls = config.getInitParameter("avoid_urls");
		/*
		 * StringTokenizer token = new StringTokenizer(urls, ",");
		 * 
		 * urlList = new ArrayList<String>();
		 * 
		 * while (token.hasMoreTokens()) { urlList.add(token.nextToken());
		 * 
		 * } total = urlList.size();
		 */
	}

}
