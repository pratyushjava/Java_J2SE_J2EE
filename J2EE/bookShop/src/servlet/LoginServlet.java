package servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Connection cn;
    private PreparedStatement pst;
  
	@Override
	public void init() throws ServletException {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			cn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.72.3:1521:orcl", "orad17", "orad17");
			
			ServletContext sc=getServletContext();
			
			sc.setAttribute("connection", cn);
			
			
			pst=cn.prepareStatement("select * from Login where email=?");
			
		} catch (Exception e) {
			
			throw new ServletException("in init",e);
		}		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try (PrintWriter pw = response.getWriter()) {
			response.setContentType("text/html");
			ArrayList<String> books = new ArrayList<>();
			HttpSession hs= request.getSession();
			hs.setAttribute("bk",books);
			
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			
			pst.setString(1, email);
			ResultSet rst=pst.executeQuery();
			
			if(rst.next()){
				
				if(rst.getString(2).equals(password))
				{
					
					hs.setAttribute(email,password);
					RequestDispatcher rd = request.getRequestDispatcher("CategoryServlet");
					if (rd != null)
						rd.forward(request, response);
					else
						System.out.println("rd not created....");
					
					pw.println(""+email);
					
				}
				else
				{
					
					pw.println("Invalid username or password... <a href=Login.html>Retry</a>");
				}
			}
			else
				{
				
					pw.println("Invalid email...<a href=Register.html>Register</a>");
				}
			
		}catch(SQLException e1){
			
			e1.printStackTrace();
		}
	}
	
	@Override
	public void destroy() {
		try {
			if(cn!=null){
						
				cn.close();
			}
			if(pst!=null){
				
				pst.close();
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
