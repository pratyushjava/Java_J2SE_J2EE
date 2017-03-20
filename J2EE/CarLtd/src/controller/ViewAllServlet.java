package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import bean.VendorBean;
import pojo.VendorPojo;
/**
 * Servlet implementation class ViewAllServlet
 */
@WebServlet("/ViewAllServlet")
public class ViewAllServlet extends HttpServlet {
	
	PrintWriter pw=null;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		VendorBean vbean=new VendorBean();
		
		HttpSession hs=request.getSession();
		
		
						
		ArrayList<VendorPojo> vp=vbean.dispAll();
		
		hs.setAttribute("VenBean",vp);
		
		RequestDispatcher rd= request.getRequestDispatcher("ViewAll.jsp");
		
		rd.forward(request,response);
		
	}

}
