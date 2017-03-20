package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection cn;
	PreparedStatement pst;
	ResultSet rs =null;
	Double total=0.0;

	@Override
	public void init() throws ServletException {
	
		super.init();
	
	
		
		ServletContext sc= getServletContext();
		cn=(Connection)sc.getAttribute("connection");
			
		try 
		{
			pst=cn.prepareStatement("select price from book where name=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession hs = request.getSession();
		 ArrayList<String> arr = (ArrayList<String>)hs.getAttribute("bk");
		 for (String s : arr) {
			 try{
			 
				 	pst.setString(1,s);
				 	rs=pst.executeQuery();
				 	while(rs.next()){
				 		System.out.println("in price");
				 	total=total+ rs.getDouble(1);
				 	}
			 	}catch (Exception e) {
				
				}
			
		}
		System.out.println("from logout Serv"+arr);
		System.out.println("Total is"+total);
		PrintWriter pw = response.getWriter();
		pw.println("books"+arr+"\n");
		pw.println("total"+total);
	}

}
