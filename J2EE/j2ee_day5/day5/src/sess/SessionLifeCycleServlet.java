package sess;

// Import Servlet packages
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

// Import Java packages
import java.io.*;

import java.util.Date;

@WebServlet("/lifecycle")
public class SessionLifeCycleServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");

		if (action != null && action.equals("invalidate")) {
			HttpSession session = request.getSession();
			session.invalidate();
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			out.println("<HTML>");
			out.println("<HEAD><TITLE>Session Life Cycle</TITLE></HEAD>");
			out.println("<BODY>");
			out.println("<P>Your session has been invalidated.</p>");
			String lifecycleURL = response.encodeURL("lifecycle");
					// "lifecycle";
			

			out.println("<A HREF=\"" + lifecycleURL + "?action=newSession\">");
			out.println("Create new session</a>");
			out.println("</BODY></HTML>");
		} else {
			HttpSession session = request.getSession();
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			out.println("<H1><CENTER>Session lifecycle</CENTER></H1>");
			out.print("<BR>Session Status: ");
			if (session.isNew()) {
				out.println("New Session.");
			} else {
				out.println("Old Session.");
			}
			out.println("<BR>Session ID: ");
			out.println(session.getId());
			out.println("<BR>Creation Time: ");
			out.println(new Date(session.getCreationTime()));
			out.println("<BR>Last Accessed Time: ");
			out.println(new Date(session.getLastAccessedTime()));
			out.println("<BR>Maximum Inactive Interval (seconds): ");
			out.println(session.getMaxInactiveInterval());

			String lifecycleURL =response.encodeURL("lifecycle");// "lifecycle";
			// 

			out.print("<BR><A HREF=\"" + lifecycleURL + "?action=invalidate\">");
			out.println("Invalidate the session</A>");
			out.print("<BR><A HREF=\"" + lifecycleURL + "\">");
			out.println("Reload this page</A>");
			out.close();
		}
	}
}
