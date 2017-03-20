package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.jms.*;

/**
 * Servlet implementation class JMSSenderServlet
 */
@WebServlet("/msg_sender")
public class JMSSenderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//inject the resources into the servlet
	@Resource(mappedName="jms/my_factory")
	private ConnectionFactory factory;//admin obj in form of JMS conn factory
	//administered obj is : destination
	@Resource(mappedName="jms/MyQueue")
	private Queue myQueue;
	private Connection cn;
	
	
	

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		//get cf & get cn from the same.
		try {
			cn=factory.createConnection();
		} catch (Exception e) {
			throw new ServletException("err in init",e);
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=null;
		Session jmsSession=null;
		try {
			response.setContentType("text/html");
			pw=response.getWriter();
		// get JMS session from cn
			jmsSession=cn.createSession(false, Session.AUTO_ACKNOWLEDGE);
		//from sess ---> JMS producer
			MessageProducer p=jmsSession.createProducer(myQueue);
		//from sess ---> create JMS mesg
		TextMessage tm=jmsSession.createTextMessage();
		tm.setText(request.getParameter("f1"));
		
		//using the prodeuce send msg to dest.
		p.send(tm);
		pw.print("Msg delivered to Q");
		} catch (Exception e) {
			throw new ServletException("err in doGet",e);
		}
		finally {
			if (pw != null)
				pw.close();
			if (jmsSession != null)
				try {
					jmsSession.close();
				} catch (JMSException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	@Override
	public void destroy()
	{
		try {
			if (cn != null)
				cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
