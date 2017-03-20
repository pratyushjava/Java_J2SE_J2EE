package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ejb.*;

import calc.Calculator;
import emp.EmpUtils;

/**
 * Servlet implementation class EmpClntServlet
 */
@WebServlet("/emp_utils_clnt")
public class EmpClntServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
@EJB(mappedName = "emp_utils")
	private EmpUtils ref;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = null;
		try {
			response.setContentType("text/html");
			pw = response.getWriter();
			// typically -- ic , ic.lookup --- rmi
			// replaced by DI
			
			pw.print("Emp Details "
					+ ref.getEmpDetails(Integer.parseInt(request
							.getParameter("f1"))));

		} catch (Exception e) {
			throw new ServletException("err in do-get", e);
		}

		finally {
			if (pw != null)
				pw.close();
		}
	}

}
