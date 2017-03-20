package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pojos.BillPOJO;

import dao.BillDAO;

/**
 * Servlet implementation class LogoutHandlerServlet
 */
public class UpdateInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=null;
		try {
			response.setContentType("text/html");
			pw=response.getWriter();
			//get HS
			HttpSession session=request.getSession();
			//get DAO inst from session
			BillDAO dao=(BillDAO) session.getAttribute("bill_dao");
			String cellNo=(String)session.getAttribute("mob_no");
			String nm=(String)session.getAttribute("cust_name");
			//call duaration
			int callDuration=Integer.parseInt(request.getParameter("call_duration"));
			double bill=Double.parseDouble(request.getParameter("bill_amt"));
			//create BillPOJO inst & pass it to DAO layer
			BillPOJO b1=new BillPOJO(cellNo, nm, callDuration,bill);
			//synch state of DB with state of POJO
			System.out.println(dao.updateBillDetails(b1));
			//re-direct user to main page
			response.sendRedirect("display_info");
		} catch (Exception e) {
			throw new ServletException("do get err logout ", e);
		}
		finally {
			if (pw != null)
				pw.close();
		}
	}

}
