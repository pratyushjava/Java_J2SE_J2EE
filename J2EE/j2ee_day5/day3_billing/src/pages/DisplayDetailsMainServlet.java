package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pojos.BillPOJO;

import dao.BillDAO;

/**
 * Servlet implementation class DisplayCellNosServlet
 */
public class DisplayDetailsMainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=null;
		try {
			response.setContentType("text/html");
			pw=response.getWriter();
			//create session --- retrieve session obj -- WC
			HttpSession hs=request.getSession();
			//retrieve DAO inst
			BillDAO dao=(BillDAO)hs.getAttribute("bill_dao");
	//		System.out.println("hs "+hs+"  "+dao);
			//get cell no from rq param
			String cellNo=request.getParameter("cell_no");
			if (cellNo == null)
				cellNo=(String) hs.getAttribute("mob_no");
			//add cust name & mob no to session
			hs.setAttribute("mob_no", cellNo);
			System.out.println("cell no "+cellNo);
			//get Details for specified cell no from DAO layer
			BillPOJO b1=dao.getBillDetails(cellNo);
			System.out.println("uploaded pojo "+b1);
			hs.setAttribute("cust_name",b1.getCustName());
			//display cell no dtls
			pw.print("<h3><center> "+b1+"<br/>");
			
			//generate form dyn.
			pw.print("<form action='update_info'><br/>");
			pw.print("Call Duration <input type='text'  name='call_duration' /><br/>");
			pw.print("Bill Amount <input type='text'  name='bill_amt' /><br/>");
			pw.print("<input type='submit' value='Update Cell Info'>");
			
			pw.print("</form>");
			pw.print("Press <a href='logout'>Logout </a>To exit");
			pw.print("</center></h3>");
			
			
		} catch (Exception e) {
			throw new ServletException("err in do-get of "+getClass().getName() ,e);
		} 
		finally {
			if (pw != null)
				pw.close();
		}
	}

}
