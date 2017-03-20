package pojos;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity //mandatory
//used by Hib frmwork : @ runtime (reflection)
@Table(name="DAC1_BOOKS")//optional
public class BookDatePOJO implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="b_id")
	private int bookId;
	@Column(name="b_title")
	private String title;
	private String author;
	private double price;
	@Temporal(TemporalType.DATE)
	private Date publishDate;
	public BookDatePOJO() {
		System.out.println("in BookPOJO def constr....");
	}
	public BookDatePOJO(String title, String author, double price,Date d) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		publishDate=d;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
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
	
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	@Override
	public String toString() {
		return "BookDatePOJO [bookId=" + bookId + ", title=" + title
				+ ", author=" + author + ", price=" + price + ", publishDate="
				+ publishDate + "]";
	}
	
	

}
