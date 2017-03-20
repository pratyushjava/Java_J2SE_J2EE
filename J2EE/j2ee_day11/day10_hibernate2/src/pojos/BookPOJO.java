package pojos;

import java.io.Serializable;
import javax.persistence.*;

@Entity //mandatory
//used by Hib frmwork : @ runtime (reflection)
@Table(name="DAC1_BOOKS")//optional
public class BookPOJO implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="b_id")
	private int bookId;
	@Column(name="b_title")
	private String title;
	private String author;
	private double price;
	public BookPOJO() {
		System.out.println("in BookPOJO def constr....");
	}
	public BookPOJO(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
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
	@Override
	public String toString() {
		return "BookPOJO [bookId=" + bookId + ", title=" + title + ", author="
				+ author + ", price=" + price + "]";
	}
	
	

}
