package basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestInputServlet
 */
@WebServlet("/test_input")
public class TestInputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=null;
		try {
			response.setContentType("text/html");
			pw=response.getWriter();
			pw.print("<h3> Hello , "+request.getParameter("f1")+"<br/>");
			pw.print("Favourite clrs chosen ---- "+Arrays.toString(request.getParameterValues("clr"))+"<br/>");
			pw.print("Browser chosen ---- "+request.getParameter("browser")+"<br/>");
			int selection=Integer.parseInt(request.getParameter("myselect"));
			pw.print("Your selection "+selection+"</h3>");
			
		} finally {
			if (pw != null)
				pw.close();
		}
	}

}
