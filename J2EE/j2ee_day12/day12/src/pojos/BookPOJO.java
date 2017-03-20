//only change from day8 --- added publish date
package pojos;

import java.io.Serializable;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.persistence.*;

@Entity
@Table(name="MY_BOOKS_DATE")
public class BookPOJO implements Serializable {
	//props --- private D.M --- state of POJO
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="book_id")
	private int bookId;
	@Column(name="b_title")
	private String title;
	private String author;
	private double price;
	@Temporal(TemporalType.DATE)
	private Date publicationDate;
	
	
	//def constr
	public BookPOJO() {
		System.out.println("in book's def constr");
	}
	public BookPOJO(String title, String author, double price,Date d) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		publicationDate=d;
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
	public int getBookId() {
		return bookId;
	}
	
	public Date getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}
	@Override
	public String toString() {
		String s=String.format("%td-%1$tb-%1$tY",publicationDate);
		return "BookPOJO [bookId=" + bookId + ", title=" + title + ", author="
				+ author + ", price=" + price +" publishDate " +s+ "]";
	}
	

}
