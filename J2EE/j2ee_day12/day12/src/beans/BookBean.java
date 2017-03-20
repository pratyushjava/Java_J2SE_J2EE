package beans;

import dao.BookDAO;
import pojos.BookPOJO;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;

public class BookBean {
	private static String DATE_ACCEPT_FORMAT = "dd-MMM-yyyy";
	// sdate --- date accepted from user in dd-MMM-yyyy format
	private String title, author, sdate;
	private double price, discount;
	private BookPOJO addBook;
	private BookDAO dao;
	private SimpleDateFormat format;
	// sdate ---> converted to java.Util.Date --- has to be done by
	// JB developer now --- can be later delegated to Struts converter
	private Date publishDate;
	private List<BookPOJO> selectedBooks;

	public BookBean() {
		System.out.println("in book bean constr");
		dao = new BookDAO();
		format = new SimpleDateFormat(DATE_ACCEPT_FORMAT);
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

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) throws Exception {
		this.sdate = sdate;
		publishDate = format.parse(sdate);

	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	// written as pseudo-getter , so that need not use scriptlet
	public BookPOJO getAddBook() throws Exception {

		return dao.addBook(new BookPOJO(title, author, price, publishDate));
	}

	// written as pseudo-getter , so that need not use scriptlet

	public List<BookPOJO> getBooks() throws Exception {

		return dao.getBooks();
	}

	public List<BookPOJO> getSelectedBooks() throws Exception {
		selectedBooks = dao.getBooksByAuthor(author);
		return selectedBooks;
	}

	// written as pseudo-getter , so that need not use scriptlet
	public String getDelete() throws Exception {

		dao.deleteBooksByDate(publishDate);
		return "deleted successfully";
	}

	// written as B.L -- will be called by Custom Tag
	public void applyBookDiscount(double limit, double percent)
			throws Exception {
		dao.UpdateBooksByPrice(limit, percent);

	}

}
