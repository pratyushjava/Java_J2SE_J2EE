package cust_tags;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import beans.BookBean;

public class DeleteBookHandler extends SimpleTagSupport {
	private String author;
	private String pDate;
	private Date publicationDate;
	private SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setpDate(String pDate) throws Exception{
		publicationDate=sdf.parse(pDate);
	}
	@Override
	public void doTag() throws JspException, IOException {
		HttpSession hs=((PageContext)getJspContext()).getSession();
		BookBean ref=(BookBean) hs.getAttribute("book");
		try {
			getJspContext().getOut().print(ref.deleteBooks(author, publicationDate));
		} catch (Exception e) {
			
			System.out.println("err in do-tag "+e);
		}
		
	}
	

}
