package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BillDAO;

/**
 * Servlet implementation class DisplayCellNosServlet
 */
public class DisplayCellNosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=null;
		try {
			response.setContentType("text/html");
			pw=response.getWriter();
			//create session
			HttpSession hs=request.getSession();
			//create DAO inst
			BillDAO dao=new BillDAO();
			//add DAO inst to sess
			hs.setAttribute("bill_dao", dao);
			//get AL of mob nos from DAO layer
			ArrayList<String> nos=dao.getAllCellNos();
			pw.print("<h3><center>Select Cell NO<br/>");
			//generate form dyn.
			pw.print("<form action='display_info'><br/>");
			pw.print("<select name='cell_no'>");
			for(String s : nos)
				pw.print("<option value='"+s+"'>"+s+"</option>");
			pw.print("</select>");
			pw.print("<input type='submit' value='Choose Cell No'>");
			
			pw.print("</form>");
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
