package sess;



import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetCook extends HttpServlet
{
 public void doGet(HttpServletRequest rq,HttpServletResponse rs) 
 throws IOException,ServletException
 {
  Cookie[] c=rq.getCookies();
  rs.setContentType("text/html");
  PrintWriter pw=rs.getWriter();
  if (c == null) {
   pw.println("No cookies set!!!!");
   return;
  }
  for (int i=0;i<c.length;i++)
  {
   pw.println("<h2>Name : " +c[i].getName() +" Value : " +c[i].getValue() +"</h2>");
  }
  
   
 }
}
