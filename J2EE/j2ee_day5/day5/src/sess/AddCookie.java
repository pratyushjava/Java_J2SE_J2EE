package sess;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddCookie extends HttpServlet
{
 public void doPost(HttpServletRequest rq,HttpServletResponse rs) throws IOException,ServletException
 {
  rs.setContentType("text/html");
  PrintWriter pw=rs.getWriter();
  String name=rq.getParameter("cookiename");
  String data=rq.getParameter("cookievalue");
  Cookie c=new Cookie(name,data);
 c.setMaxAge(200);
/*  c.setDomain(".comp.com");
  c.setPath("/");*/
  rs.addCookie(c);
  pw.println("Cookie: " +name  +"set to: " +data);

 }
}
