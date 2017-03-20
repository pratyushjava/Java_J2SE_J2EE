package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.Employee;

import slsb_facade.MovieDAO;

/**
 * Servlet implementation class MovieEntSLSBServlet
 */
@WebServlet("/movie_clnt")
public class MovieEntSLSBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB(mappedName="movie_dao")
	private MovieDAO dao;
	//@EJB(mappedName="emp_slsb")
	//private Employee emp;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=null;
		try {
			response.setContentType("text/html");
			pw=response.getWriter();
			System.out.println("dao="+dao);
		//	
			pw.println(dao.test("hello"));
	//		pw.print(emp.getEmployees());
			System.out.println(dao.getAllBooks());
//			pw.print("<h3>"+dao.listAllMovies()+"</h3>");
			
			
		} finally {
			pw.close();
		}
	}

}
