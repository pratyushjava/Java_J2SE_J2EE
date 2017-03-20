package pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="my_books")
public class BookPOJO implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="book_id")
	private int bookId;
	@Column(length=20)
	private String title;
	@Column(length=20)
	private String author;
	private double price;
	@Temporal(TemporalType.DATE)//annotation for marking Date --- prop type can be
	//java.util.Date or Calendar(GregorianCalendar)
	private Date publishDate;
	public BookPOJO() {
		System.out.println("in book def constr....");
	}
	public BookPOJO(String title, String author, double price, Date publishDate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publishDate = publishDate;
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
		return " [bookId=" + bookId + ", title=" + title + ", author="
				+ author + ", price=" + price + ", publishDate=" + publishDate
				+ "]";
	}
	

}
