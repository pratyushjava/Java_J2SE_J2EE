package basic;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Date;

public class HelloServlet extends HttpServlet
{
	//response generation
	@Override
		public void doGet(HttpServletRequest rq,HttpServletResponse rs) throws ServletException,IOException
	{
		try(PrintWriter pw=rs.getWriter()){
		//MIME type --- Multimedia Internet mail ext --- response content type
		rs.setContentType("text/html");
		pw.println("<h3>Welcome 2 Servlets...@"+new Date()+"</h3>");
		}

	}
}
