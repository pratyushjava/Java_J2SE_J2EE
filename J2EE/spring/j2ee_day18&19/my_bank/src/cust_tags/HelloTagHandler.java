package cust_tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class HelloTagHandler extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		//obj : display welcome msg from cust tag on the clnt browser
		getJspContext().getOut().println("<h1>Hello from Cust tags</h1>");
		
	}
	
	
	

}
