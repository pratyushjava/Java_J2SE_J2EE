package beans;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

import pojos.BookPOJO;

import dao.HibBookDAO;

public class BookBean {
	private String title, author;
	private double price;
	private String pDate;
	private Date pubDate;
	private SimpleDateFormat sdf;
	private HibBookDAO dao;
	
	private String bookByAuthor;

	// def constr
	public BookBean() {
		dao = new HibBookDAO();
		sdf = new SimpleDateFormat("dd-MMM-yyyy");
		System.out.println("in jb constr....");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getPubDate() {
		return pubDate;
	}

	public void setpDate(String pDate) throws Exception {

		pubDate = sdf.parse(pDate);
	}
	

	// B.L

	
	public String getStatus() throws Exception {
		String sts = "failed";
		BookPOJO b = new BookPOJO(title, author, price, pubDate);
		dao.addBook(b);
		sts = "success";
		return sts;
	}

	public List<BookPOJO> getBookByAuthor() throws Exception {
		return  dao.getBooksByAuthor(author);
		
	}

	/*
	 * public String getBookByAuthor() throws Exception { }
	 */
	// will be called by custom tag -- author & pub date will be passed by jsp
	// to cust tag as 2 attrs
	// cust tag handler class will call this method -- so will have args
	public String deleteBooks(String author, Date pubDate) throws Exception {
		return dao.deleteBooksByAuthorNDate(author, pubDate);
	}

}
