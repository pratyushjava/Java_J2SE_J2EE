package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.VendorBean;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		int id=Integer.parseInt(request.getParameter("vendorid"));
		int phone=Integer.parseInt(request.getParameter("phoneno"));
		String name=request.getParameter("vendorname");
		String city=request.getParameter("city");
		
		VendorBean vb=new VendorBean();
		
		if(vb.insertVal(id, phone, name, city))
		{
			System.out.println("Inserting into the record");
		}
		
		
		RequestDispatcher rd=request.getRequestDispatcher("ViewAllServlet");
		rd.forward(request, response);
	}

}
