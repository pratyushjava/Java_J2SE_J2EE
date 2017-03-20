package db;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpDBServlet
 */
// @WebServlet(name = "emp", urlPatterns = { "/emp_db" })
@WebServlet("/emp_db")
public class EmpDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection cn;
	private PreparedStatement pst;

	/**
	 * @see Servlet#init()
	 */
	public void init() throws ServletException {
		try {
			System.out.println("in init of DB dependent servlet");
			System.out.println("drvr="
					+ getServletConfig().getInitParameter("drvr"));
			System.out.println("ctx param "
					+ getServletContext().getInitParameter("aa"));
			// load
			Class.forName("com.mysql.jdbc.Driver");
			// get cn
			String url = "jdbc:mysql://localhost:3306/testjdbc";
			cn = DriverManager.getConnection(url, "root", "root");
			// pst
			String sql = "select * from my_emp where empid=?";
			pst = cn.prepareStatement(sql);
			System.out.println("init completed....");

		} catch (Exception e) {
			throw new ServletException(
					"err in init of " + getClass().getName(), e);
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			if (pst != null)
				pst.close();
			if (cn != null)
				cn.close();
		} catch (Exception e) {
			System.out.println("err in destory " + e);
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try (PrintWriter pw = response.getWriter()) {
			// set cont type
			response.setContentType("text/html");
			// get emp id
			int id = Integer.parseInt(request.getParameter("id1"));
			// set in param
			pst.setInt(1, id);
			// exec query
			ResultSet rst = pst.executeQuery();
			// if emp exists -- disp dtls
			if (rst.next()) {
				pw.println("<h3> Valid Emp ID <br/>");
				pw.println("Emp Dtls " + rst.getString(2) + " "
						+ rst.getDouble(4) + " " + rst.getDate(6) + "</h3>");
			}
			// o.w retry link
			else
				pw.println("Invalid Emps ID Pls <a href='emp.html'>Retry</a>");
			if (rst != null)
				rst.close();

		} catch (Exception e) {
			throw new ServletException("err in do-get of "
					+ getClass().getName(), e);
		}
	}

}