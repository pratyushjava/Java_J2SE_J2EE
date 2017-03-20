package cust_tags;

import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import beans.BookBean;

public class UpdatePriceHandler extends SimpleTagSupport {
	private double limit;
	private double percentDisc;
	@Override
	public void doTag() throws JspException, IOException {
		try {
		//get Http Session
		HttpSession hs=((PageContext) getJspContext()).getSession();
		//get Bean ref from session scope
		BookBean ref=(BookBean) hs.getAttribute("book");
		//custom tag invoking method of JB
		ref.applyBookDiscount(limit, percentDisc);
		} catch (Exception e) {
			throw new JspException("err in update tag",e);
		}
		
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}
	public void setPercentDisc(double percentDisc) {
		this.percentDisc = percentDisc;
	}
	

}
