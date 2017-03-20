package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BillDAO;

/**
 * Servlet implementation class LogoutHandlerServlet
 */
public class LogoutHandlerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=null;
		try {
			response.setContentType("text/html");
			pw=response.getWriter();
			//get HS
			HttpSession session=request.getSession();
			//get DAO inst from session
			BillDAO dao=(BillDAO) session.getAttribute("bill_dao");
			//close cn & clean-up
			dao.cleanUp();
			//discard session
			session.invalidate();
			pw.print("U R being logged out... Please <a href='index.html'>Visit</a>again....");
		} catch (Exception e) {
			throw new ServletException("do get err logout ", e);
		}
		finally {
			if (pw != null)
				pw.close();
		}
	}

}
