package cust_tags;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class HelloTagHandler extends SimpleTagSupport {
	
	public HelloTagHandler() {
		System.out.println("in tag class constr....");
	}
	@Override
	public void doTag() throws JspException,IOException
	{
		//represents Tag exec logic
		getJspContext().getOut().print("<h3> Welcome 2 Custom Tags @"+new Date()+"</h3>");
	}
}
