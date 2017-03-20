package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.xml.internal.security.Init;


@WebServlet("/AddToCart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection cn;
	PreparedStatement st;
	
	@Override
	public void init() throws ServletException {
	
		super.init();
		
	}	
	@Override
	public void destroy() {
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 ServletContext sc=getServletContext();
		    
		    try {
						System.out.println("in add to cart dopost");
		    	 cn=(Connection)sc.getAttribute("connection");
		    	 HttpSession hs = request.getSession();
		 		
		 		ArrayList<String> books=(ArrayList<String>)hs.getAttribute("bk");
		    	
		    	 PrintWriter pw = response.getWriter();
		    	
		    	 String[] bookArr = request.getParameterValues("books");
		    	
		    	 
		    	 
		    	 for(String str:bookArr)
		    		 books.add(str);
		    	 pw.println("add to cart "+books);
		    	 hs.setAttribute("bk",books);
		    	 pw.println("<form action='LogoutServlet' method=post>");
		    	 pw.println("<input type=submit value=exit></form>");
		    	 pw.println("<form action='CategoryServlet' method=post>");
		    	 pw.println("<input type=submit value='Buy More'></form>");
		    	 
		    	 
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		    
		   
		
		
	}

}
