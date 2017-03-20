package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection cn;
	PreparedStatement st;
       
   
    
    @Override
    public void init() throws ServletException {
    
    ServletContext sc=getServletContext();
    
    try {
				
    	 cn=(Connection)sc.getAttribute("connection");
    		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    System.out.println("Got con :"+cn);
    
    }
    
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String cat=request.getParameter("category");
		System.out.println("Category :"+cat);
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		pw.println("<html><head>Book Category</head><body bgcolor=cyan><center><form action=AddToCart method=post><h3>");
		pw.println("Select Book  :");
		
	try {
	   	st=cn.prepareStatement("select * from book where category=?");
		st.setString(1,cat);
		
		ResultSet rs=st.executeQuery();
	
	while(rs.next())
	{	
		
		String s=rs.getString(2);
		System.out.println("rs "+s);
		pw.println("<br/><input type=checkbox name='books' value="+s+">"+s+"</input>");
	}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	pw.println("<br/><br/><input type=submit value='Add To Cart'>");
	
	pw.println("<br/><br/><input type=button value='logout' onclick='Login.html'>");
	pw.println("</h3></form></center></body></html>");
//	RequestDispatcher rd = request.getRequestDispatcher("AddToCart");


	
	
	}

}
