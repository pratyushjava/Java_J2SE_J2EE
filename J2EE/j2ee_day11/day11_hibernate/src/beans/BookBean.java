package beans;

import java.text.SimpleDateFormat;
import java.util.Date;

import pojos.BookDatePOJO;

import dao.BookDAO;

public class BookBean {
	private String name,author;
	private double price;
	private String sDate;
	private Date publicationDate;
	private SimpleDateFormat sdf;
	private BookDAO dao;
	private String status;
	
	public BookBean() {
		System.out.println("in bean constr....");
		sdf=new SimpleDateFormat("dd-MMM-yyyy");
		dao=new BookDAO();
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setsDate(String sDate) {
		this.sDate = sDate;
	}

	
	//B.L ---invoke DAO layer method to persist transient
	//BookPOJO
	public String getStatus() throws Exception
	{
		String sts="failed";
		BookDatePOJO b=new BookDatePOJO(name, author, price, sdf.parse(sDate));
		dao.addBook(b);
		sts="success";
		return sts;
	}
	

}
