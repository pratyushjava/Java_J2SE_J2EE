package db_redirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet(name = "disp1", urlPatterns = { "/display_redirect" })
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try (PrintWriter pw = response.getWriter()) {
			//retrieve HS
			HttpSession session=request.getSession();
			// set cont type
			response.setContentType("text/html");
			System.out.println("in 2nd page");
			System.out.println("session id from 2nd page "+session.getId());
			pw.print("<h3> From 2nd page ..... </h3>");
			pw.print("Emp Details "+session.getAttribute("emp_dtls"));
		}
	}

}
