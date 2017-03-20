package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import com.mysql.jdbc.PreparedStatement;

@WebServlet(name = "categ", urlPatterns = {"/CategoryServlet" })
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection cn;
	PreparedStatement pst;
	
	public void init(ServletConfig config) throws ServletException {
		
	}
	public void destroy() {

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try(PrintWriter pw = response.getWriter()){
			
			
			
			response.setContentType("text/html");
			pw.println("<html><head>Book Category</head><body bgcolor=wheat><center><form action=BookServlet method=post><h3>");
			pw.println("Select Category  :");
			pw.println("<br/><br/><input type=radio name=category value='JAVA'>Java ");
			pw.println("<br/><br/><input type=radio name=category value='XML'>XML ");
			pw.println("<br/><br/><input type=radio name=category value='C'>C ");
			pw.println("<br/><br/><input type=submit value='Choose'>");
			pw.println("</h3></form></center></body></html>");
	

			
		}
		
	}

}
