package mvc_pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojos.UserPOJO;

import beans.UserBean;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/user_controller")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			//rq processing
			String p1=request.getParameter("f1");
			String p2=request.getParameter("f2");
			//create Model inst & invoke B.L
			UserBean u1=new UserBean(p1, p2);
			UserPOJO user=u1.validateUser();
			RequestDispatcher rd=null;
			if (user != null) {
				request.setAttribute("user_dtls", user);
				rd=request.getRequestDispatcher("/WEB-INF/results/valid.jsp");
			}
			else
				rd=request.getRequestDispatcher("/WEB-INF/results/invalid.jsp");
			rd.forward(request, response);
			
			
		} catch (Exception e) {
			throw new ServletException("err in do-get" , e);
		} 
	}

}
